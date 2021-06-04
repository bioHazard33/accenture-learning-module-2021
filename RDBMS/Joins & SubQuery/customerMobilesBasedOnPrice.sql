select c.customer_id,
    customer_name,
    mobile,
    price fromcustomer_info c
    join sales_info s on s.customer_id = c.customer_id
where price < 30000
order by customer_id;