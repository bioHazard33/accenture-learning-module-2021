select d.department_name
from department d
    join student s using(department_id)
group by department_namehaving count(s.student_id) =(
        select min(count(s2.student_id))
        from student s2
            join department d2 using(department_id)
        group by department_id
    )
order by department_name;