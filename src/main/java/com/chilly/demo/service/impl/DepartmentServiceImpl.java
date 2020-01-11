package com.chilly.demo.service.impl;

import com.chilly.demo.entity.Department;
import com.chilly.demo.entity.Student;
import com.chilly.demo.entity.Teacher;
import com.chilly.demo.mapper.DepartmentMapper;
import com.chilly.demo.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2020/1/1
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    /**
     * 获取所有学院信息
     * @return
     */
    public List<Department> getAllDepartment(){
        return departmentMapper.getAllDepartment();
    }

    /**
     * 新增学院
     * @param department
     * @return
     */
    public int addDepartment(Department department){
        return departmentMapper.addDepartment(department);
    }

    /**
     * 删除选中的学院
     * @param departmentId
     * @return
     */
    public int deleteDepartmentById(int departmentId){
        return departmentMapper.deleteDepartmentById(departmentId);
    }
    /**
     * 获取学院
     * @param departmentId
     * @return
     */
    public Department getDepartmentById(int departmentId){
        return departmentMapper.getDepartmentById(departmentId);
    }

    /**
     * 获取相关学院的学生
     * @param departmentId
     * @return
     */
    public List<Student> getStudentDepartment(int departmentId){
        return departmentMapper.getStudentDepartment(departmentId);
    }

    /**
     * 获取相关学院的教师
     * @param departmentId
     * @return
     */
    public List<Teacher> getTeacherDepartment(int departmentId){
        return departmentMapper.getTeacherDepartment(departmentId);
    }
}
