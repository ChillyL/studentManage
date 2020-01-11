package com.chilly.demo.mapper;

import com.chilly.demo.entity.Grades;
import com.chilly.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 获取所有学生信息
     * @return
     */
    List<Student> getStudentList();

    /**
     * 新增学生信息
     * @param student
     * @return
     */
    int addStudent(Student student);

    /**
     * 删除学生信息
     * @param studentId
     * @return
     */
    int deleteStudentById(String studentId);

    /**
     * 查看学生详情
     * @param studentId
     * @return
     */
    Student getStudentById(String studentId);

    /**
     * 学生详情的成绩
     * @param studentId
     * @return
     */
    List<Grades> getStudentGradesById(String studentId);

    /**
     * 更改学生详情
     * @param student
     * @return
     */
    int updateStudent(Student student);
}
