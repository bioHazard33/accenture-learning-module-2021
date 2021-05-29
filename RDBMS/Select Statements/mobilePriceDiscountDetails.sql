select ime_no,
    model_name,
    warranty_in_years,
    price,
(0.13 * price) as discount
from mobile_master
where manufacturer = 'Samsung';