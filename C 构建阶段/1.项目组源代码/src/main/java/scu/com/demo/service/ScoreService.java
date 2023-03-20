package scu.com.demo.service;

import scu.com.demo.entity.Score;

import java.util.List;

/**
 * (Score)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:38:23
 */
public interface ScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    Score queryById(Integer courseid);

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score insert(Score score);

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score update(Score score);

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer courseid);

    List<Score> getStuScore(Score score);
}
