CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE x INT;
Set x=N-1;
  RETURN (
      # Write your MySQL query statement below.
        select Distinct salary 
        from Employee
        Order by salary desc
        Limit 1 offset x
  );
END