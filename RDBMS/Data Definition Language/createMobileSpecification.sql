create table Distributor(
    Spec_No varchar(10) primary key,
    Dimension varchar(20),
    Weight varchar(20),
    Display_Type varchar(20),
    Display_Size varchar(20),
    Internal_mem_in_MB number(10),
    Memory_Card_Capacity_GB number(10),
    Network_3G varchar(5),
    GPRS varchar(5),
    EDGE varchar(5),
    Bluetooth varchar(5),
    Camera varchar(5),
    Camera_Quality varchar(5),
    OS varchar(20),
    Battery_Life_Hrs number(10)
);