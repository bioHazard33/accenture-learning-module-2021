select ime_no,
    model_name,
    price,
case
        when price < 10000 then 'Average Price'
        when price >= 10000
        AND price <= 20000 then 'Medium Price'
        else 'High Price'
    end as "Comment"
from mobile_master
order by ime_no;