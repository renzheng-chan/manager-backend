package scu.com.demo.service.impl;

import scu.com.demo.entity.Stucourse;
import scu.com.demo.dao.StucourseDao;
import scu.com.demo.service.StucourseService;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Stucourse)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:38:47
 */
//@Service("stucourseService")
public class StucourseServiceImpl implements StucourseService {
    @Resource
    private StucourseDao stucourseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stuid 主键
     * @return 实例对象
     */
    @Override
    public Stucourse queryById(Integer stuid) {
        return this.stucourseDao.queryById(stuid);
    }

    /**
     * 新增数据
     *
     * @param stucourse 实例对象
     * @return 实例对象
     */
    @Override
    public Stucourse insert(Stucourse stucourse) {
        this.stucourseDao.insert(stucourse);
        return stucourse;
    }

    /**
     * 修改数据
     *
     * @param stucourse 实例对象
     * @return 实例对象
     */
    @Override
    public Stucourse update(Stucourse stucourse) {
        this.stucourseDao.update(stucourse);
        return this.queryById(stucourse.getStuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param stuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stuid) {
        return this.stucourseDao.deleteById(stuid) > 0;
    }
}
