select distinct rate
from cabincost as SECOND_MAX
where rate =(
        select max(rate)
        from cabincost
        where rate <(
                select max(rate)
                from cabincost
            )
    );