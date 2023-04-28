package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.bean.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
    @GetMapping
    public String getTeacher(Model model){
        List<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            teachers.add(new Teacher(i, "Nguyễn Thị " + i, "Lớp " + i));
        }

        model.addAttribute("danhSachGiaoVien",teachers);
        return  "teacherList";
    }
}
