SELECT employee_id, 
IF(employee_id % 2 = 0 OR name like 'm%', 0, salary)
AS bonus
FROM employees
ORDER BY employee_id ASC;