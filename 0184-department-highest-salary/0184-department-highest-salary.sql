# Write your MySQL query statement below
WITH cte AS(
    SELECT id , name , MAX(salary) OVER(PARTITION BY departmentId) AS Salary 
    FROM Employee 
)
SELECT d.name AS Department , cte.name AS Employee ,cte.Salary AS Salary FROM Employee e
INNER JOIN cte ON cte.salary = e.salary
INNER JOIN Department d ON e.departmentId = d.id
WHERE e.name = cte.name;




