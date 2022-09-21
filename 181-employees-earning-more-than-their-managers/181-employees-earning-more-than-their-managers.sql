# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee ea on e.managerId=ea.id where e.salary>ea.salary;