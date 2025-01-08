# Write your MySQL query statement below
WITH cte AS (
SELECT 
    id, name, salary, DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS 'rank',  departmentId
    FROM Employee
)
SELECT d.name AS Department ,e.name AS Employee ,e.salary AS Salary  FROM Employee e 
INNER JOIN cte ON cte.id = e.id
INNER JOIN Department d ON d.id = e.departmentId 
WHERE cte.rank < 4;




