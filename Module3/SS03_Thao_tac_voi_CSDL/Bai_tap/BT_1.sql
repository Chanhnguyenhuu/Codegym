use quan_ly_sinh_vien;

select *
from student
where student_name like 'h%';

select *
from class
where month(start_date) > 11;

select *
from subject 
where subject.credit >= 3 and subject.credit <= 5;

update student set class_id = 2 where student_name = 'hung';

select student.student_name, mark.mark, subject.sub_name
from student 
join mark on student.student_id = mark.student_id 
join subject on subject.sub_id = mark.sub_id;
