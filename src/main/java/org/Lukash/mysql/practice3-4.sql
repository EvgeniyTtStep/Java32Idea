select * from doctors_specializations ds
join doctors d on d.id_doctors = ds.doctor_id
join specializations s on s.id_specializations = ds.specialization_id;

-- 1. Вивести повні імена лікарів та їх спеціалізації.
select * from `doctors`, `specializations`, `doctors_specializations`
where `doctors_specializations`.`doctor_id` = `doctors`.`id_doctors`
  and `doctors_specializations`.`specialization_id` = `specializations`.`id_specializations`;

select * from `doctors_specializations`
                  inner join `specializations` on `doctors_specializations`.`specialization_id` = `specializations`.`id_specializations`
                  inner join `doctors` on `doctors_specializations`.`doctor_id` = `doctors`.`id_doctors`;

select
    `doctors`.`name` as 'имя доктора',
    `doctors`.`surname`as 'фамилия доктора',
    `specializations`.`name` as 'специализция'
from `doctors_specializations`
         inner join `specializations` on `doctors_specializations`.`specialization_id` = `specializations`.`id_specializations`
         inner join `doctors` on `doctors_specializations`.`doctor_id` = `doctors`.`id_doctors`;



-- 2. Вивести прізвища та зарплати (сума ставки та надбавки) лікарів, які не перебувають у відпустці.
select `doctors`.`surname`, (`premium` + `salary`) as 'зарплата' from `doctors`
inner join `vacations` on `vacations`.`doctor_id` = `doctors`.`id_doctors`
where '2024-06-26' < `vacations`.`start_date` or '2024-06-26' > `vacations`.`end_date`;



-- 3. Вивести назви палат, що знаходяться у відділенні “dep1”.
select * from `wards`
inner join `departments` on `wards`.`department_id` = `departments`.`id_departments`
where `departments`.`name` = 'dep3';

-- 4. Вивести назви відділень без повторень, що спонсоруються
-- компанією “Umbrella Corporation”.
select distinct departments.name from departments
join donations d on departments.id_departments = d.department_id
join sponsors s on s.id_sponsors = d.sponsor_id
where s.name = 'sponsor1';


-- вивести всех докторов без спе-ции

select doctors.* from doctors
left join doctors_specializations ds on doctors.id_doctors = ds.doctor_id
left join specializations s on s.id_specializations = ds.specialization_id
where id_specializations is null ;


-- вивести все спе-ции без доктров
select s.* from doctors
                          join doctors_specializations ds on doctors.id_doctors = ds.doctor_id
                          right join specializations s on s.id_specializations = ds.specialization_id
where doctors.id_doctors is null;


