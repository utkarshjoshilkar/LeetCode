CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    WITH cte AS (
        SELECT  id , salary ,
        DENSE_RANK() OVER(w) rnk FROM Employee
        WINDOW w AS (ORDER BY salary DESC)
    )
    SELECT MAX(salary) AS SecondHighestSalary FROM cte   
    WHERE rnk = N
  );
END


