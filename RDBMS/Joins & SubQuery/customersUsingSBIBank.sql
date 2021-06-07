select name,
    address
from users
where user_id in(
        select user_id
        from bookingdetails
        where user_id not in (
                select user_id
                from bookingdetails
                where lower(name) = 'sbi'
            )
    )
order by name;