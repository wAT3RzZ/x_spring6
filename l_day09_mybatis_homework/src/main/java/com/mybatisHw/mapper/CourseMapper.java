package com.mybatisHw.mapper;

import com.mybatisHw.pojo.Course;
import com.mybatisHw.pojo.Score;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 16:24 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface CourseMapper {
    List<Course> queryScore();
}
