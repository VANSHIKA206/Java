/*select students whose name starts with V */
SELECT * from Students where Name  LIKE 'V%'; 

/* select students whose id is between 5 to 10  */
SELECT * from Students where ID BETWEEN 5 AND 10;

/*select students from whose name is between A and S */
SELECT * FROM Students where Name BETWEEN   'A%' AND 'S%';