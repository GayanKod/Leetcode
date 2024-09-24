# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales As s
JOIN Product As p
ON s.product_id = p.product_id;