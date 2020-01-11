package com.chilly.demo.controller;

import com.chilly.demo.entity.Lecture;
import com.chilly.demo.entity.Teacher;
import com.chilly.demo.exception.BaseExceptionHandleAction;
import com.chilly.demo.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther ChillyLin
 * @date 2019/12/30
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController extends BaseExceptionHandleAction {
    @Resource
    private TeacherService teacherService;

    @GetMapping({"/index"})
    public String initStudentIndex(Model model) {
        List<Teacher> teacherList = teacherService.getTeacherList();
        model.addAttribute("teachers",teacherList);
        return "teacher_index";
    }

    @RequestMapping("/toAddTeacher")
    public String toAddStudent(){
        return "teacher_add";
    }

    @RequestMapping("/addTeacher")
    public String addStudent(Teacher teacher){
        teacherService.addTeacher(teacher);
        return "redirect:/teacher/index";
    }

    @RequestMapping("/deleteTeacher")
    public String deleteStudent(String teacherId){
        teacherService.deleteTeacherById(teacherId);
        return "redirect:/teacher/index";
    }

    @RequestMapping("/teacherIntro")
    public String studentIntro(String teacherId,Model model){
        Teacher teacher = teacherService.getTeacherById(teacherId);
        List<Lecture> lectureList = teacherService.getTeacherLectureById(teacherId);
        if (teacher == null){
            return "teacher_404";
        }
        model.addAttribute("teacher",teacher);
        model.addAttribute("lectureList",lectureList);
        return "teacher_intro";
    }

    @RequestMapping("/updateTeacher")
    public String updateTeacher(Teacher teacher){
        teacherService.updateTeacher(teacher);
        return "redirect:/teacher/teacherIntro?teacherId="+teacher.getTeacher_id();
    }

    @RequestMapping("toUpdateTeacherById")
    public String toUpdateTeacherById(Model model,String teacherId){
        Teacher teacher = teacherService.getTeacherById(teacherId);
        model.addAttribute("teacher",teacher);
        return "teacher_update";
    }
}
