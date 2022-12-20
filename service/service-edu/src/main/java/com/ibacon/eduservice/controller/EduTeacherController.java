package com.ibacon.eduservice.controller;


import com.ibacon.commonutils.R;
import com.ibacon.eduservice.entity.EduTeacher;
import com.ibacon.eduservice.service.EduTeacherService;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")
    public R list(){
        List<EduTeacher> list = teacherService.list(null);
        return R.ok().data("items",list);
    }
    @ApiOperation(value = "根据ID删除讲师")
    @DeleteMapping("{id}")
    public R removeById(@PathVariable String id){
        teacherService.removeById(id);
        return R.ok();
    }



}

