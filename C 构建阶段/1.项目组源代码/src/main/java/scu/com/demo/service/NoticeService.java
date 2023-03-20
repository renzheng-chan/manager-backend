package scu.com.demo.service;

import scu.com.demo.entity.Notice;

import java.util.List;

/**
 * (Notice)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:38:08
 */
public interface NoticeService {

    /**
     * 通过ID查询单条数据
     *
     * @param noticeid 主键
     * @return 实例对象
     */
    Notice queryById(Integer noticeid);

    /**
     * 新增数据
     *
     * @param notice 实例对象
     * @return 实例对象
     */
    Notice insert(Notice notice);

    /**
     * 修改数据
     *
     * @param notice 实例对象
     * @return 实例对象
     */
    Notice update(Notice notice);

    /**
     * 通过主键删除数据
     *
     * @param noticeid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer noticeid);

    List<Notice> getNotice();
}
