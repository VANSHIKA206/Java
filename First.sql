create table Student (
    ID int primary key,
    NAME varchar(40),
    GENDER varchar(10),
    SEMESTER varchar(5),
    COURSE varchar(40),
    PHONE_NO int(10),
    EMAIL varchar(50),
    ADDRESS varchar(50)
);

insert into Student values(1,"Vanshika Sharma","Female","8th","Computer Science",9863798,"vanshikasharma@gmail.com","Sunder Nagar"),
(2,"Anjali Sharma","Female","8th","Computer Science",83682657,"anjalisharma@gmail.com","Santoshi Nagar"),
(3,"Alankrita khumbhaj","Female","3rd","Bcom",2648364,"alankrita@gmail.com","Matri Nagar"),
(4,"Khushi Yadav","Female","8th","Computer Science",6765448,"khushiyadav@gmail.com","Santoshi Nagar"),
(5,"Isha Mishra","Female","8th","Computer Science",476148,"ishamishra@gmail.com","Santoshi Nagar"),
(6,"Tulsi Dewangan","Female","8th","Computer Science",366935,"tulsidewangan@gmail.com","Aswini Nagar"),
(7,"Shubham Verma","Male","3rd","Bcom",8369485,"shubham@gmail.com","Bhilai"),
(8,"Ashwini Singh","Male","3rd","LLB",766966,"ashwini7@gmail.com","Rajender Nagar"),
(9,"Vedant Sharma","Male","4th","LLB",8093706,"vedeantsharma@gmail.com","Sunder Nagar"),
(10,"Aditi Panday","Female","6th","Information Technology",663795,"aditi14@gmail.com","Sunder Nagar");

select *from student;

create table Course(
  course_id int primary key,
  course varchar(40),
  id int(10),
  CourseFaculty varchar (40),
  FOREIGN KEY (Course_ID) REFERENCES Student(ID)
);

insert into Course value(1,"Computer Science",1,"Aditaya Sharma"),
(2,"Computer Science",2,"Aditaya Sharma"),
(3,"Bcom",3,"Sweta Tiwari"),
(4,"Computer Science",4,"Aditaya Sharma"),
(5,"Computer Science",5,"Aditaya Sharma"),
(6,"Computer Science",6,"Aditaya Sharma"),
(7,"Bcom",7,"Sweta Tiwari"),
(8,"LLB",8,"Ram pandey"),
(9,"LLB",9,"Ram pandey"),
(10,"Computer Science",10,"Aditaya Sharma");

select *from Course;

