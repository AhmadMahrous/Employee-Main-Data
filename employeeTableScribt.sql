use `java-developing-task`;

create table `employee` (
	id int(11) NOT NULL AUTO_INCREMENT,
    employee_code int(11) default null ,
	first_name varchar(45) Default null,
    last_name varchar(45) default null,
    birth_date DATE default null,
    birth_city varchar(45) default null,
    employee_department varchar(45) default null,
    job_title varchar(45) default null,
    employee_status varchar(20) default null,
    contract_typr varchar(20) default null,
    
    primary key (`id`)
);

alter table employee rename column contract_typr to contract_type;
