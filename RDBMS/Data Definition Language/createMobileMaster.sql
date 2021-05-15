create table Mobile_Master(
    IMEI_No varchar(10) primary key,
    Model_Name varchar(20),
    Manufacturer varchar(20),
    Date_Of_Manufac Date,
    Warranty_in_Years number(10),
    Price number(7,2),
    Distributor_ID varchar(10),
    foreign key(Distributor_ID) references Distributor(Distributor_ID),
    Spec_No varchar(10),
    foreign key(Spec_No) references Mobile_Specification(Spec_No)
);