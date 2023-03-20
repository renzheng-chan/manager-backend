package scu.com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import scu.com.demo.entity.Course;
import scu.com.demo.dao.CourseDao;
import scu.com.demo.service.CourseService;
//import org.springframework.stereotype.Service;
import scu.com.demo.util.MybatisUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:37:10
 */
//@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    @Override
    public Course queryById(Integer courseid) {
        return this.courseDao.queryById(courseid);
    }

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course insert(Course course) {
        this.courseDao.insert(course);
        return course;
    }

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course update(Course course) {
        this.courseDao.update(course);
        return this.queryById(course.getCourseid());
    }

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer courseid) {
        return this.courseDao.deleteById(courseid) > 0;
    }

    @Override
    public List<Course> getCourseById(Course courseid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CourseDao courseMapper = sqlSession.getMapper(CourseDao.class);
        List<Course> course = courseMapper.getCourseById(courseid);
        return course;
    }

    @Override
    public Course getCourseById_(Course course) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CourseDao courseMapper = sqlSession.getMapper(CourseDao.class);
        Course courseid = courseMapper.getCourseById_(course);
        return courseid;
    }

    @Override
    public List<Course> getAll(Course teacherid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CourseDao mapper = sqlSession.getMapper(CourseDao.class);
        return mapper.getAll(teacherid);
    }

}
