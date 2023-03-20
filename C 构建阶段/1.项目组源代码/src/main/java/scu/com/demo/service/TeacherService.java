package scu.com.demo.service;

import scu.com.demo.entity.Teacher;

/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:39:36
 */
public interface TeacherService {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherid 主键
     * @return 实例对象
     */
    Teacher queryById(Integer teacherid);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param teacherid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer teacherid);

    Teacher getPersonalInfo(Teacher teacher);
}
