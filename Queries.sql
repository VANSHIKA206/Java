
/*find all male students */
select * from Students
where gender="M";

/*list names of students along with their courses */
Select ID,name,semester,Students.course_id,course_name from Students,Courses where Students.course_id=Courses.course_id;

/* information of all girls */
 select Id, name,semester,course_name,Faculty_name from Students ,Courses,Faculty 
 WHERE Students.course_id=Courses.course_id 
 AND Courses.course_id=Faculty.faculty_id
 AND Students.gender="F"; 
 
 /* find students who don't enrolled in any course */
 select * from Students  
 where course_id is NULL;  
 
 
  /* list of course teaching by a specific professor */
select course_name from Courses
where faculty_id in (
    select faculty_id 
    from Faculty 
    where faculty_name= "Vamika Kohli"
    );
    
/* list of course along with their faculty */
select course_name , faculty_name
from Courses,Faculty
where  Faculty.faculty_id= Courses.faculty_id; 

/* list of student name, course name and faculty name together */
select name, course_name,faculty_name
from Students, Courses, Faculty
where Students.course_id=Courses.course_id
and Faculty.faculty_id= Courses.faculty_id 
order by ID; 