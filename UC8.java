mysql> CREATE  TABLE employee_payroll
    -> (
    -> EmployeeID int identity(1 ,1 ) primary key,
    -> EmployeeName  varchar(255),
    -> PhoneNumber   varchar(255),
    -> Address       varchar(255),
    -> Department    varchar(255),
    -> );
