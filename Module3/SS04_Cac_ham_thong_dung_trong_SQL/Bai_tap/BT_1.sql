use quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất
select *
from subject
where credit = (select credit from subject order by credit desc limit 0,1);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select subject.sub_name, max(mark) as mark
from mark
join subject on mark.sub_id = subject.sub_id;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.student_id, student.student_name, avg(mark.mark) as TB
from student
left join mark on student.student_id = mark.student_id
group by student.student_id
order by avg(mark.mark) desc;



