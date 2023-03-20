package scu.com.demo.service;

import scu.com.demo.entity.Classinfo;

/**
 * (Classinfo)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:36:52
 */
public interface ClassinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param classid 主键
     * @return 实例对象
     */
    Classinfo queryById(Integer classid);

    /**
     * 新增数据
     *
     * @param classinfo 实例对象
     * @return 实例对象
     */
    Classinfo insert(Classinfo classinfo);

    /**
     * 修改数据
     *
     * @param classinfo 实例对象
     * @return 实例对象
     */
    Classinfo update(Classinfo classinfo);

    /**
     * 通过主键删除数据
     *
     * @param classid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer classid);

}
