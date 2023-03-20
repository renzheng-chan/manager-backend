package scu.com.demo.service.impl;

import scu.com.demo.entity.Stuaccount;
import scu.com.demo.dao.StuaccountDao;
import scu.com.demo.service.StuaccountService;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Stuaccount)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:38:34
 */
//@Service("stuaccountService")
public class StuaccountServiceImpl implements StuaccountService {
    @Resource
    private StuaccountDao stuaccountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    @Override
    public Stuaccount queryById(Integer account) {
        return this.stuaccountDao.queryById(account);
    }

    /**
     * 新增数据
     *
     * @param stuaccount 实例对象
     * @return 实例对象
     */
    @Override
    public Stuaccount insert(Stuaccount stuaccount) {
        this.stuaccountDao.insert(stuaccount);
        return stuaccount;
    }

    /**
     * 修改数据
     *
     * @param stuaccount 实例对象
     * @return 实例对象
     */
    @Override
    public Stuaccount update(Stuaccount stuaccount) {
        this.stuaccountDao.update(stuaccount);
        return this.queryById(stuaccount.getAccount());
    }

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer account) {
        return this.stuaccountDao.deleteById(account) > 0;
    }
}
