package scu.com.demo.service.impl;

import scu.com.demo.entity.Teacheraccount;
import scu.com.demo.dao.TeacheraccountDao;
import scu.com.demo.service.TeacheraccountService;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Teacheraccount)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:40:05
 */
//@Service("teacheraccountService")
public class TeacheraccountServiceImpl implements TeacheraccountService {
    @Resource
    private TeacheraccountDao teacheraccountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param teacherid 主键
     * @return 实例对象
     */
    @Override
    public Teacheraccount queryById(Integer teacherid) {
        return this.teacheraccountDao.queryById(teacherid);
    }

    /**
     * 新增数据
     *
     * @param teacheraccount 实例对象
     * @return 实例对象
     */
    @Override
    public Teacheraccount insert(Teacheraccount teacheraccount) {
        this.teacheraccountDao.insert(teacheraccount);
        return teacheraccount;
    }

    /**
     * 修改数据
     *
     * @param teacheraccount 实例对象
     * @return 实例对象
     */
    @Override
    public Teacheraccount update(Teacheraccount teacheraccount) {
        this.teacheraccountDao.update(teacheraccount);
        return this.queryById(teacheraccount.getTeacherid());
    }

    /**
     * 通过主键删除数据
     *
     * @param teacherid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer teacherid) {
        return this.teacheraccountDao.deleteById(teacherid) > 0;
    }
}
