alter table mobile_master
add constraint chk_warranty check(warranty_in_years > 0);