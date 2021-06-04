select r.resortid,
    r.resortname,
    NVL(m.name, 'NA') as MANAGERNAME,
    NVL(m.phone, 'NA') as PHONENO
from resort r
    left outer join manager m using(managerid)
order by r.resortid;