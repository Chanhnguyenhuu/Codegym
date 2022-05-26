use quan_ly_sinh_vien;

-- Hiển thị số lượng sinh viên ở từng nơi
select address, count(student_id) as count
from student
group by address;

-- Tính điểm trung bình các môn học của mỗi học viên
select student.student_id, student.student_name, avg(mark.mark) as TB
from student
left join mark on student.student_id = mark.student_id
group by student.student_id;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select student.student_id, student.student_name, avg(mark.mark) as TB
from student
left join mark on student.student_id = mark.student_id
group by student.student_id
having avg(mark.mark) > 15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select student.student_id, student.student_name, avg(mark.mark) as TB
from student
left join mark on student.student_id = mark.student_id
group by student.student_id
having avg(mark) >= all(select avg(mark) from mark group by mark.student_id)



