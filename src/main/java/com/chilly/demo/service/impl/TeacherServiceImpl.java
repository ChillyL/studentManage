package com.chilly.demo.service.impl;

import com.chilly.demo.entity.Lecture;
import com.chilly.demo.entity.Teacher;
import com.chilly.demo.mapper.TeacherMapper;
import com.chilly.demo.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2019/12/30
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;
    /**
     * 获取所有教师信息
     * @return
     */
    public List<Teacher> getTeacherList(){
        return teacherMapper.getTeacherList();
    }

    /**
     * 新增教师信息
     * @param teacher
     * @return
     */
    public int addTeacher(Teacher teacher){
        String sd = teacher.getDepartment_name();
        if (sd.equals("中文")){
            teacher.setDepartment_id(1);
        }else if (sd.equals("外国语")){
            teacher.setDepartment_id(2);
        }else if (sd.equals("经管")){
            teacher.setDepartment_id(3);
        }else if (sd.equals("交通")){
            teacher.setDepartment_id(4);
        }else if (sd.equals("电子")){
            teacher.setDepartment_id(5);
        }else if (sd.equals("计算机")){
            teacher.setDepartment_id(6);
        }else if (sd.equals("土建")){
            teacher.setDepartment_id(7);
        }else if (sd.equals("机械")){
            teacher.setDepartment_id(8);
        }else if (sd.equals("化工")){
            teacher.setDepartment_id(9);
        }else if (sd.equals("数理")){
            teacher.setDepartment_id(10);
        }else if (sd.equals("政法")){
            teacher.setDepartment_id(11);
        }else if (sd.equals("纺织")){
            teacher.setDepartment_id(13);
        }else if (sd.equals("艺术")){
            teacher.setDepartment_id(21);
        }

        return teacherMapper.addTeacher(teacher);
    }

    /**
     * 删除教师信息
     * @param teacherId
     * @return
     */
    public int deleteTeacherById(String teacherId){
        return teacherMapper.deleteTeacherById(teacherId);
    }

    /**
     * 查看教师详情
     * @param teacherId
     * @return
     */
    public Teacher getTeacherById(String teacherId){
        return teacherMapper.getTeacherById(teacherId);
    }

    /**
     * 教师任课
     * @param teacherId
     * @return
     */
    public List<Lecture> getTeacherLectureById(String teacherId){
        return teacherMapper.getTeacherLectureById(teacherId);
    }

    /***
     * 更改教师信息
     * @param teacher
     * @return
     */
    public int updateTeacher(Teacher teacher){
        String sd = teacher.getDepartment_name();
        if (sd.equals("中文")){
            teacher.setDepartment_id(1);
        }else if (sd.equals("外国语")){
            teacher.setDepartment_id(2);
        }else if (sd.equals("经管")){
            teacher.setDepartment_id(3);
        }else if (sd.equals("交通")){
            teacher.setDepartment_id(4);
        }else if (sd.equals("电子")){
            teacher.setDepartment_id(5);
        }else if (sd.equals("计算机")){
            teacher.setDepartment_id(6);
        }else if (sd.equals("土建")){
            teacher.setDepartment_id(7);
        }else if (sd.equals("机械")){
            teacher.setDepartment_id(8);
        }else if (sd.equals("化工")){
            teacher.setDepartment_id(9);
        }else if (sd.equals("数理")){
            teacher.setDepartment_id(10);
        }else if (sd.equals("政法")){
            teacher.setDepartment_id(11);
        }else if (sd.equals("纺织")){
            teacher.setDepartment_id(13);
        }else if (sd.equals("艺术")){
            teacher.setDepartment_id(21);
        }
        return teacherMapper.updateTeacher(teacher);
    }
}
