select customer_id,
    customer_name,
    address,
    email
from customer_info
where mobile is null
order by customer_name desc;