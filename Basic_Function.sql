/*Order by */
select name,address from Students Order by name Asc;

/* Min() and Max()*/
select min(semester) from student;
select max(salary) from Faculty;

/*Count() , Avg() and Sum()*/
select count(semester) from Students where semester=8;
select avg(salary) from Faculty ;
select sum(salary) from Faculty;

/*Group By*/
select count(Id),name from Students Group by name;

/*Having*/
select count(semester),name from Students Group by name having count(semester)>1;

/*ALL and Any*/
select all name from Students where semester = 8 ;
select faculty_name FROM Faculty WHERE faculty_id = ANY (SELECT faculty_id FROM Faculty WHERE salary >10000);

/*Update*/
UPDATE Students 
SET email= "vanshika.sharma@gmail.com"
WHERE Id=1;

/*AND OR*/
select * from Students  where address="Raipur" and semester=8;
select * from Students where Address="Raipur" or semester=8;
