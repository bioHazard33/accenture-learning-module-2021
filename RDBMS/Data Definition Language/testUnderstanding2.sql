CREATE table department(
    dept_id number(4) PRIMARY key,
    prod_id number(4),
    foreign key(prod_id) REFERENCES product(prod_id),
    dept_name varchar(25) unique,
    dept_head varchar(25) NOT NULL
);