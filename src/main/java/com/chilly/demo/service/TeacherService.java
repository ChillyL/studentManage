package com.chilly.demo.service;

import com.chilly.demo.entity.Lecture;
import com.chilly.demo.entity.Teacher;

import java.util.List;

public interface TeacherService {

    /**
     * 获取所有教师信息
     * @return
     */
    List<Teacher> getTeacherList();

    /**
     * 新增教师信息
     * @param teacher
     * @return
     */
    int addTeacher(Teacher teacher);

    /**
     * 删除教师信息
     * @param teacherId
     * @return
     */
    int deleteTeacherById(String teacherId);

    /**
     * 查看教师详情
     * @param teacherId
     * @return
     */
    Teacher getTeacherById(String teacherId);

    /**
     * 教师任课
     * @param teacherId
     * @return
     */
    List<Lecture> getTeacherLectureById(String teacherId);

    /***
     * 更改教师信息
     * @param teacher
     * @return
     */
    int updateTeacher(Teacher teacher);
}
