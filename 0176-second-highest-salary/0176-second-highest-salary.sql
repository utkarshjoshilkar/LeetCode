# Write your MySQL query statement below
WITH cte AS (
SELECT  id , salary ,
DENSE_RANK() OVER(w) rnk FROM Employee
WINDOW w AS (ORDER BY salary DESC)
)
SELECT MAX(salary) AS SecondHighestSalary FROM cte   
WHERE rnk = 2;

-- if the aggrigate function is applied on the table having empty set it returns NULL