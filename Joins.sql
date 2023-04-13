select name as name
from  Students; 

/* union */
select name as StudentName from Students union 
select course_name as CourseName
from Courses; 

select Courses.course_name ,Courses.course_id
from Courses
union all
select Faculty.faculty_name,Salary
from Faculty; 


/* INNER JOIN */
Select faculty_name,course_name
from Faculty
inner join Courses
on Faculty.faculty_id=Courses.faculty_id; 


/*LEFT JOIN */

SELECT Students.Id,Students.course_id, Courses.course_name  
FROM Students 
left JOIN Courses
ON Students.course_id = Courses.course_id
order by Id; 

/*RIGHT JOIN */

SELECT Students.Id,Students.course_id, Courses.course_name  
FROM Students 
right JOIN Courses
ON Students.course_id = Courses.course_id
order by Id;  

/*FULL JOIN */

SELECT Students.course_id, Courses.course_name  
FROM Students
full JOIN Courses
ON Students.course_id = Courses.course_id;


