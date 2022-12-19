package com.ibacon.eduservice.controller;


import com.ibacon.eduservice.entity.EduTeacher;
import com.ibacon.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author ibacon66
 * @since 2022-12-19
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService teacherService;
    @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
        return teacherService.list(null);
    }
    @DeleteMapping("{id}")
    public boolean removeById(@PathVariable String id){
        return teacherService.removeById(id);
    }



}

