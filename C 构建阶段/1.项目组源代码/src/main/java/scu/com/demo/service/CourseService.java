package scu.com.demo.service;

import scu.com.demo.entity.Course;

import java.util.List;

/**
 * (Course)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:37:10
 */
public interface CourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    Course queryById(Integer courseid);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course insert(Course course);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer courseid);

    List<Course> getCourseById(Course course);
    Course getCourseById_(Course course);

    List<Course> getAll(Course course);

}
