select distributor_name
from distributor
where distributor_id not in('SA111', 'MC111')
order by distributor_name;