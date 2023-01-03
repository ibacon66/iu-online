package com.ibacon.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ibacon.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ibacon.eduservice.entity.vo.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author zhangxin
 * @since 2022-12-19
 */
public interface EduTeacherService extends IService<EduTeacher> {
    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);
}
