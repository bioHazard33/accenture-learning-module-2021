select student_name,
(
        select max(value)
        from mark m
        where s.student_id = m.student_id
    ) as MAX_MARKfrom student s
order by student_name;