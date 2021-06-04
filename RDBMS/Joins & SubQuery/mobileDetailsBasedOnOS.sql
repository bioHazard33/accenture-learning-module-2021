select ime_no,
    model_name,
    manufacturer,
    price frommobile_master
    join mobile_specification using(spec_no)
where OS = 'Android4S'
order by ime_no;