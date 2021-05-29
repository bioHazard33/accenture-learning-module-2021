select customer_id,
    customer_name,
    address,
    mobile,
    email
from customer_info
where address in('Kolkata', 'Patna')
order by customer_name;