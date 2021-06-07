select distributor_name,
    model_name,
    price,
    warranty_in_years
from distributor
    join mobile_master using(distributor_id)
where warranty_in_years =(
        select max(warranty_in_years)
        from mobile_master
    )
order by distributor_name;