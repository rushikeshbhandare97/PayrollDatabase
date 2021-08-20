#UC9
mysql> create table payroll (
    -> emp_id int unsigned NOT NULL AUTO_INCREMENT,
    -> basic_pay Double NOT NULL,
    -> deductions Double NOT NULL,
    -> taxable_pay Double NOT NULL,
    -> tax Double NOT NULL,
    -> net_pay Double NOT NULL,
    -> FOREIGN KEY (emp_id) REFERENCES employee_details(emp_id)
    -> );
mysql> describe payroll;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| emp_id      | int unsigned | NO   | MUL | NULL    | auto_increment |
| basic_pay   | double       | NO   |     | NULL    |                |
| deductions  | double       | NO   |     | NULL    |                |
| taxable_pay | double       | NO   |     | NULL    |                |
| tax         | double       | NO   |     | NULL    |                |
| net_pay     | double       | NO   |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
6 rows in set (2.40 sec)
