alter table sales_info
add constraint fk_key foreign key(customer_id) references customer_info(customer_id);