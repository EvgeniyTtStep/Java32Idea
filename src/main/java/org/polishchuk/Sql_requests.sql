
SELECT d.name AS department_name, SUM(doc.premium) AS total_premium
FROM doctors doc
         JOIN departments d ON doc.id_doctors = d.id_departments
GROUP BY d.name;



