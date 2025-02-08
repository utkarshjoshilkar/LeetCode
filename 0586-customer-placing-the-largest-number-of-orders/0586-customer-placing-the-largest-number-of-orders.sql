# Write your MySQL query statement below

WITH cte AS 
    (SELECT o.order_number,o.customer_number ,count(customer_number) c
    FROM Orders o
    GROUP BY customer_number)

SELECT customer_number FROM cte 
WHERE c = (SELECT Max(c) FROM cte);