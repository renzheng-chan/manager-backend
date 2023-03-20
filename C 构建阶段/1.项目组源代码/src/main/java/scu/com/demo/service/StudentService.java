package scu.com.demo.service;

import scu.com.demo.entity.Student;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:39:02
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param stuid 主键
     * @return 实例对象
     */
    Student queryById(Integer stuid);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param stuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stuid);

    Student getStudentById(Student student);

}
