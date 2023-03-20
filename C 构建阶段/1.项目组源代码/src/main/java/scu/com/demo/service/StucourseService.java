package scu.com.demo.service;

import scu.com.demo.entity.Stucourse;

/**
 * (Stucourse)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:38:47
 */
public interface StucourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param stuid 主键
     * @return 实例对象
     */
    Stucourse queryById(Integer stuid);

    /**
     * 新增数据
     *
     * @param stucourse 实例对象
     * @return 实例对象
     */
    Stucourse insert(Stucourse stucourse);

    /**
     * 修改数据
     *
     * @param stucourse 实例对象
     * @return 实例对象
     */
    Stucourse update(Stucourse stucourse);

    /**
     * 通过主键删除数据
     *
     * @param stuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stuid);

}
