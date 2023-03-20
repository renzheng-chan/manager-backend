package scu.com.demo.service;

import scu.com.demo.entity.Exam;

/**
 * (Exam)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:37:34
 */
public interface ExamService {

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    Exam queryById(Integer courseid);

    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    Exam insert(Exam exam);

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 实例对象
     */
    Exam update(Exam exam);

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer courseid);

}
