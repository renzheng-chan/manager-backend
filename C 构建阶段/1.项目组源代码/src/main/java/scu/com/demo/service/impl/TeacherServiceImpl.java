package scu.com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import scu.com.demo.entity.Teacher;
import scu.com.demo.dao.TeacherDao;
import scu.com.demo.service.TeacherService;
import scu.com.demo.util.MybatisUtil;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:39:37
 */
//@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param teacherid 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Integer teacherid) {
        return this.teacherDao.queryById(teacherid);
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherDao.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getTeacherid());
    }

    /**
     * 通过主键删除数据
     *
     * @param teacherid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer teacherid) {
        return this.teacherDao.deleteById(teacherid) > 0;
    }

    @Override
    public Teacher getPersonalInfo(Teacher teacher) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);
        Teacher teacherInfo = mapper.getPersonalInfo(teacher);
        return teacherInfo;
    }
}
