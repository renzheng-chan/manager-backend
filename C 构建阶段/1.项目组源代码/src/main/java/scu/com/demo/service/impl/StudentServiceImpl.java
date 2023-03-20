package scu.com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import scu.com.demo.entity.Student;
import scu.com.demo.dao.StudentDao;
import scu.com.demo.service.StudentService;
import scu.com.demo.util.MybatisUtil;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:39:02
 */
//@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stuid 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer stuid) {
        return this.studentDao.queryById(stuid);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getStuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param stuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stuid) {
        return this.studentDao.deleteById(stuid) > 0;
    }


    @Override
    public Student getStudentById(Student studentid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao courseMapper = sqlSession.getMapper(StudentDao.class);
        Student student = courseMapper.getStudentById(studentid);
        return student;
    }
}
