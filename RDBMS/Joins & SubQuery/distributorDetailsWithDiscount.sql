select d.Address,mm.Manufacturer,mm.Model_Name,ms.Dimension,s.Discount
from Distributor d, Mobile_Master mm, Mobile_Specification ms, Sales_Info s
where d.Distributor_ID = mm.Distributor_ID and mm.Spec_No = ms.Spec_No and s.IME_No = mm.IME_No
order by d.Address;