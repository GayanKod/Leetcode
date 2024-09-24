# Write your MySQL query statement below
SELECT eu.unique_id, e.name
FROM EmployeeUNI As eu
RIGHT JOIN Employees As e
ON e.id = eu.id;