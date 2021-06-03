select to_char(sales_date, 'MON') as MONTH,
    sum(net_amount) as TURN_OVER
from sales_info
where months_between(sysdate, sales_date) <= 12
group by to_char(sales_date, 'MON')
order by sum(net_amount) desc;