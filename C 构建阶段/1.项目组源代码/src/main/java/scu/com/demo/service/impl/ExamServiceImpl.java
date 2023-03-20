package scu.com.demo.service.impl;

import scu.com.demo.entity.Exam;
import scu.com.demo.dao.ExamDao;
import scu.com.demo.service.ExamService;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Exam)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:37:34
 */
//@Service("examService")
public class ExamServiceImpl implements ExamService {
    @Resource
    private ExamDao examDao;

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    @Override
    public Exam queryById(Integer courseid) {
        return this.examDao.queryById(courseid);
    }

    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    @Override
    public Exam insert(Exam exam) {
        this.examDao.insert(exam);
        return exam;
    }

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    @Override
    public Exam update(Exam exam) {
        this.examDao.update(exam);
        return this.queryById(exam.getCourseid());
    }

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer courseid) {
        return this.examDao.deleteById(courseid) > 0;
    }
}
