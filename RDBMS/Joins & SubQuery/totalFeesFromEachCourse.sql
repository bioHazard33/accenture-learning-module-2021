select c.courseid,
    coursename,
    fees *(
        select count(*)
        from registration r
        where c.courseid = r.courseid
    ) as TOTALFEES
from course corder by c.courseid;