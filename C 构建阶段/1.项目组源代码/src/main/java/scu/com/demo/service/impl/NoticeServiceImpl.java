package scu.com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import scu.com.demo.entity.Notice;
import scu.com.demo.dao.NoticeDao;
import scu.com.demo.service.NoticeService;
import scu.com.demo.util.MybatisUtil;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Notice)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:38:08
 */
//@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeDao noticeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param noticeid 主键
     * @return 实例对象
     */
    @Override
    public Notice queryById(Integer noticeid) {
        return this.noticeDao.queryById(noticeid);
    }

    /**
     * 新增数据
     *
     * @param notice 实例对象
     * @return 实例对象
     */
    @Override
    public Notice insert(Notice notice) {
        this.noticeDao.insert(notice);
        return notice;
    }

    /**
     * 修改数据
     *
     * @param notice 实例对象
     * @return 实例对象
     */
    @Override
    public Notice update(Notice notice) {
        this.noticeDao.update(notice);
        return this.queryById(notice.getNoticeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param noticeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer noticeid) {
        return this.noticeDao.deleteById(noticeid) > 0;
    }

    @Override
    public List<Notice> getNotice() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        NoticeDao mapper = sqlSession.getMapper(NoticeDao.class);
        List<Notice> Notice = mapper.getNotice();
        return Notice;
    }
}
