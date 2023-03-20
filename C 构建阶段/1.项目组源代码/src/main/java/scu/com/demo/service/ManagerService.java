package scu.com.demo.service;

import scu.com.demo.entity.Manager;

/**
 * (Manager)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:37:48
 */
public interface ManagerService {

    /**
     * 通过ID查询单条数据
     *
     * @param managerid 主键
     * @return 实例对象
     */
    Manager queryById(Integer managerid);

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Manager insert(Manager manager);

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Manager update(Manager manager);

    /**
     * 通过主键删除数据
     *
     * @param managerid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer managerid);

}
