select model_name,
    count(salesid) as max_sales
from mobile_master
    inner join sales_info on mobile_master.ime_no = sales_info.ime_no
group by model_name
having count(salesid) =(
        select max(count(salesid))
        from sales_info
            join mobile_master on sales_info.ime_no = mobile_master.ime_no
        group by model_name
    )
order by model_name desc;