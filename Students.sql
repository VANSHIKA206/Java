create table Students (
   Id int primary key,
   name varchar(40),
   gender varchar(40),
   semester varchar(10),
   course varchar(40),
   address varchar(40),
   phoneno int (10),
   email varchar(40),
   course_id int
);

create table Courses (
   course_id int primary key,
   course_name varchar(40),
   faculty_id int
);

alter table Students add foreign key(course_id) references Courses(course_id);

select *from Students;
select *from Courses;

create table Faculty(
   faculty_id int primary key,
   faculty_name varchar(40),
   gender varchar(5),
   salary double

);
alter table Courses add foreign key(faculty_id) references Faculty(faculty_id) on delete set NULL;

INSERT into Students
VALUES (1,"Vanshika Sharma","Female","8th","Computer Science","Raipur",76839655,"vanshika@gmail.com",null);
select * from Students;


update Students set course_id=1 where Id=1;

   