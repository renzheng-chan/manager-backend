package scu.com.demo.service;

import scu.com.demo.entity.Stuaccount;

/**
 * (Stuaccount)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:38:34
 */
public interface StuaccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    Stuaccount queryById(Integer account);

    /**
     * 新增数据
     *
     * @param stuaccount 实例对象
     * @return 实例对象
     */
    Stuaccount insert(Stuaccount stuaccount);

    /**
     * 修改数据
     *
     * @param stuaccount 实例对象
     * @return 实例对象
     */
    Stuaccount update(Stuaccount stuaccount);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    boolean deleteById(Integer account);

}
