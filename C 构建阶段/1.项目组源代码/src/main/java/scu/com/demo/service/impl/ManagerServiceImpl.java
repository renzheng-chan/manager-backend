package scu.com.demo.service.impl;

import scu.com.demo.entity.Manager;
import scu.com.demo.dao.ManagerDao;
import scu.com.demo.service.ManagerService;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Manager)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:37:48
 */
//@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Resource
    private ManagerDao managerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param managerid 主键
     * @return 实例对象
     */
    @Override
    public Manager queryById(Integer managerid) {
        return this.managerDao.queryById(managerid);
    }

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    @Override
    public Manager insert(Manager manager) {
        this.managerDao.insert(manager);
        return manager;
    }

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    @Override
    public Manager update(Manager manager) {
        this.managerDao.update(manager);
        return this.queryById(manager.getManagerid());
    }

    /**
     * 通过主键删除数据
     *
     * @param managerid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer managerid) {
        return this.managerDao.deleteById(managerid) > 0;
    }
}
