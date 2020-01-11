package com.chilly.demo.controller;

import com.chilly.demo.entity.Course;
import com.chilly.demo.entity.Student;
import com.chilly.demo.entity.Teacher;
import com.chilly.demo.exception.BaseExceptionHandleAction;
import com.chilly.demo.service.CourseService;
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
@RequestMapping("/course")
public class CourseController extends BaseExceptionHandleAction {

    @Resource
    private CourseService courseService;

    @GetMapping({"/index"})
    public String initCourseIndex(Model model) {
        List<Course> courseList = courseService.getCourseList();
        model.addAttribute("courses",courseList);
        return "course_index";
    }

    @RequestMapping("/toAddCourse")
    public String toAddCourse(){
        return "course_add";
    }

    @RequestMapping("/addCourse")
    public String addCourse(Course course){
        courseService.addCourse(course);
        return "redirect:/course/index";
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(String courseId){
        courseService.deleteCourseById(courseId);
        return "redirect:/course/index";
    }

    @RequestMapping("/courseIntro")
    public String courseIntro(String courseId,Model model){
        Course course = courseService.getCourseById(courseId);
        if (course == null){
            return "course_404";
        }
        List<Teacher> teacherList = courseService.getTeacherCourse(courseId);
        List<Student> studentList = courseService.getStudentCourse(courseId);
        model.addAttribute("course",course);
        model.addAttribute("teacherList",teacherList);
        model.addAttribute("studentList",studentList);
        return "course_intro";
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(Course course){
        courseService.updateCourse(course);
        return "redirect:/course/courseIntro?courseId="+course.getCourse_id();
    }

    @RequestMapping("toUpdateCourseById")
    public String toUpdateCourseById(Model model,String courseId){
        Course course = courseService.getCourseById(courseId);
        model.addAttribute("course",course);
        return "course_update";
    }
}
