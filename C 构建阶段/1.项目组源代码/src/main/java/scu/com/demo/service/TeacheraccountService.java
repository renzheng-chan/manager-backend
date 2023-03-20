package scu.com.demo.service;

import scu.com.demo.entity.Teacheraccount;

/**
 * (Teacheraccount)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:40:05
 */
public interface TeacheraccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherid 主键
     * @return 实例对象
     */
    Teacheraccount queryById(Integer teacherid);

    /**
     * 新增数据
     *
     * @param teacheraccount 实例对象
     * @return 实例对象
     */
    Teacheraccount insert(Teacheraccount teacheraccount);

    /**
     * 修改数据
     *
     * @param teacheraccount 实例对象
     * @return 实例对象
     */
    Teacheraccount update(Teacheraccount teacheraccount);

    /**
     * 通过主键删除数据
     *
     * @param teacherid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer teacherid);

}
