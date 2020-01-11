package com.chilly.demo.mapper;

import com.chilly.demo.entity.Course;
import com.chilly.demo.entity.Department;
import com.chilly.demo.entity.Student;
import com.chilly.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    /**
     * 获取所有学院信息
     * @return
     */
    List<Department> getAllDepartment();

    /**
     * 新增学院
     * @param department
     * @return
     */
    int addDepartment(Department department);

    /**
     * 删除选中的学院
     * @param departmentId
     * @return
     */
    int deleteDepartmentById(int departmentId);

    /**
     * 获取学院
     * @param departmentId
     * @return
     */
    Department getDepartmentById(int departmentId);

    /**
     * 获取相关学院的学生
     * @param departmentId
     * @return
     */
    List<Student> getStudentDepartment(int departmentId);

    /**
     * 获取相关学院的教师
     * @param departmentId
     * @return
     */
    List<Teacher> getTeacherDepartment(int departmentId);
}
