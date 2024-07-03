select avg(salary)
from doctors;

select *
from doctors;



select count(*)
from doctors;


select max(premium), doctors.name
from doctors;

select min(premium), doctors.name
from doctors;

select doctors.name, doctors.premium
from doctors
where doctors.premium = (select max(premium) from doctors);

select doctors.name, doctors.premium
from doctors
where doctors.premium = (select min(premium) from doctors);

select doctors.name, doctors.premium
from doctors
where premium > (select avg(premium) from doctors);

select doctors.name, doctors.premium
from doctors
where premium < (select avg(premium) from doctors);

select sum(premium)
from doctors;

select sum(salary)
from doctors;

-- GROUP BY --

select *
from departments
         join wards w on departments.id_departments = w.department_id;

-- подсчитать сколько палат в каждом департаменте

select departments.name, COUNT(*) as 'wards-count'
from departments
         join wards w on departments.id_departments = w.department_id
group by departments.name;

-- подсчитать сколько донатов сделал каждій спонсор
select s.name, count(*)
from donations
         join sponsors s on s.id_sponsors = donations.sponsor_id
group by s.name;

-- подсчитать сколько донатов получил каждій департамент
select d.name, count(*)
from donations
         join departments d on d.id_departments = donations.department_id
group by d.name;

-- подсчитать сколько денег получил каждій департамент
select d.name, sum(donations.amount)
from donations
         join departments d on d.id_departments = donations.department_id
group by d.name;

-- подсчитать сколько денег заплатил каждій спонсор
select s.name, sum(amount)
from donations
         join sponsors s on s.id_sponsors = donations.sponsor_id
group by s.name;

-- HAVING--

-- подсчитать сколько денег заплатил каждій спонсор и вывести богатых спонсоров
select s.name, sum(amount)
from donations
         join sponsors s on s.id_sponsors = donations.sponsor_id
group by s.name
having sum(amount) > 600;

-- подсчитать сколько денег заплатил каждій спонсор и вывести богатых спонсоров
select *, sum(amount) as summ
from donations
         join sponsors s on s.id_sponsors = donations.sponsor_id
where date >= '2024-06-20'
group by s.name
having summ > 600;


-- подсчитать сколько денег заплатил каждій спонсор и вывести богатых спонсоров кроме sponsor1
select *, sum(amount) as summ
from donations
         join sponsors s on s.id_sponsors = donations.sponsor_id
where s.name != 'sponsor1'
group by s.name
having summ > 600;




