# Write your MySQL query statement below

SELECT e.name AS Employee FROM Employee e JOIN Employee ea ON e.managerID = ea.id WHERE e.salary > ea.salary