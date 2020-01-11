package com.chilly.demo.service.impl;

import com.chilly.demo.entity.Grades;
import com.chilly.demo.entity.Student;
import com.chilly.demo.mapper.StudentMapper;
import com.chilly.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2019/12/29
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;
    /**
     * 获取所有学生信息
     * @return
     */
    public List<Student> getStudentList(){
        return studentMapper.getStudentList();
    }

    /**
     * 新增学生信息
     * @param student
     * @return 成功返回1，失败返回0
     */
    public int addStudent(Student student){
        String sd = student.getStudent_department();
        if (sd.equals("中文")){
            student.setDepartment_id(1);
        }else if (sd.equals("外国语")){
            student.setDepartment_id(2);
        }else if (sd.equals("经管")){
            student.setDepartment_id(3);
        }else if (sd.equals("交通")){
            student.setDepartment_id(4);
        }else if (sd.equals("电子")){
            student.setDepartment_id(5);
        }else if (sd.equals("计算机")){
            student.setDepartment_id(6);
        }else if (sd.equals("土建")){
            student.setDepartment_id(7);
        }else if (sd.equals("机械")){
            student.setDepartment_id(8);
        }else if (sd.equals("化工")){
            student.setDepartment_id(9);
        }else if (sd.equals("数理")){
            student.setDepartment_id(10);
        }else if (sd.equals("政法")){
            student.setDepartment_id(11);
        }else if (sd.equals("纺织")){
            student.setDepartment_id(13);
        }else if (sd.equals("艺术")){
            student.setDepartment_id(21);
        }
        return studentMapper.addStudent(student);
    }

    /**
     * 删除学生信息
     * @param studentId
     * @return
     */
    public int deleteStudentById(String studentId){
        return studentMapper.deleteStudentById(studentId);
    }

    /**
     * 查看学生详情
     * @param studentId
     * @return
     */
    public Student getStudentById(String studentId){
        return studentMapper.getStudentById(studentId);
    }
    /**
     * 学生详情的成绩
     * @param studentId
     * @return
     */
    public List<Grades> getStudentGradesById(String studentId){
        return studentMapper.getStudentGradesById(studentId);
    }

    /**
     * 更改学生详情
     * @param student
     * @return
     */
    public int updateStudent(Student student){
        String sd = student.getStudent_department();
        if (sd.equals("中文")){
            student.setDepartment_id(1);
        }else if (sd.equals("外国语")){
            student.setDepartment_id(2);
        }else if (sd.equals("经管")){
            student.setDepartment_id(3);
        }else if (sd.equals("交通")){
            student.setDepartment_id(4);
        }else if (sd.equals("电子")){
            student.setDepartment_id(5);
        }else if (sd.equals("计算机")){
            student.setDepartment_id(6);
        }else if (sd.equals("土建")){
            student.setDepartment_id(7);
        }else if (sd.equals("机械")){
            student.setDepartment_id(8);
        }else if (sd.equals("化工")){
            student.setDepartment_id(9);
        }else if (sd.equals("数理")){
            student.setDepartment_id(10);
        }else if (sd.equals("政法")){
            student.setDepartment_id(11);
        }else if (sd.equals("纺织")){
            student.setDepartment_id(13);
        }else if (sd.equals("艺术")){
            student.setDepartment_id(21);
        }
        return studentMapper.updateStudent(student);
    }
}
