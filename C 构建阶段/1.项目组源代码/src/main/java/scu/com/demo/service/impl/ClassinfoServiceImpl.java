package scu.com.demo.service.impl;

import scu.com.demo.entity.Classinfo;
import scu.com.demo.dao.ClassinfoDao;
import scu.com.demo.service.ClassinfoService;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Classinfo)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:36:52
 */
//@Service("classinfoService")
public class ClassinfoServiceImpl implements ClassinfoService {
    @Resource
    private ClassinfoDao classinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param classid 主键
     * @return 实例对象
     */
    @Override
    public Classinfo queryById(Integer classid) {
        return this.classinfoDao.queryById(classid);
    }

    /**
     * 新增数据
     *
     * @param classinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Classinfo insert(Classinfo classinfo) {
        this.classinfoDao.insert(classinfo);
        return classinfo;
    }

    /**
     * 修改数据
     *
     * @param classinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Classinfo update(Classinfo classinfo) {
        this.classinfoDao.update(classinfo);
        return this.queryById(classinfo.getClassid());
    }

    /**
     * 通过主键删除数据
     *
     * @param classid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer classid) {
        return this.classinfoDao.deleteById(classid) > 0;
    }
}
