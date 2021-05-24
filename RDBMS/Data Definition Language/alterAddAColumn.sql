create table payments(
    payment_id varchar2(3),
    constraint pk_payments primary key(payment_id),
    ticket_id varchar2(3),
    constraint fk_payments_tickets foreign key(ticket_id) references tickets(ticket_id),
    bd_id number(11),
    constraint fk_payments_bookingdetails foreign key(bd_id) references bookingdetails(bd_id),
    discount_id varchar2(3),
    constraint fk_payments_discounts foreign key(discount_id) references discounts(discount_id)
);