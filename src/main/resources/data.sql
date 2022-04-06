insert into course(id,name)
values(1001,'Jpa quick');
insert into course(id,name)
values(1002,'SQL quick');
insert into course(id,name)
values(1003,'Boot quick');



insert into passport(id,numb)
values(4001,'EN458796');

insert into passport(id,numb)
values(4002,'NH564846');

insert into passport(id,numb)
values(4003,'NH6582145');


insert into student(id,name,passport_id)
values(2001,'Ashley',4001);
insert into student(id,name,passport_id)
values(2002,'Louise',4002);
insert into student(id,name,passport_id)
values(2003,'Giovani',4003);







insert into review(id,rating,description,course_id)
values(5001,'5','Great Course',1001);
insert into review(id,rating,description,course_id)
values(5002,'4','Wonderful',1001);
insert into review(id,rating,description,course_id)
values(5003,'5','Great one!!',1003);


insert into Student_Course(student_id , course_id)
values(2002,1002);
insert into Student_Course(student_id , course_id)
values(2003,1001);
