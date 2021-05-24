create table buses(
    Bus_no number(11),
    Bus_name varchar2(20),
    Type varchar2(20),
    Total_seats number(11),
    Avail_seats number(11),
    constraint pk_buses primary key(Bus_no)

);