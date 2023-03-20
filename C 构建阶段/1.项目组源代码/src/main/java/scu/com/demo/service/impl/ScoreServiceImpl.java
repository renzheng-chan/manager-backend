package scu.com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import scu.com.demo.entity.Score;
import scu.com.demo.dao.ScoreDao;
import scu.com.demo.service.ScoreService;
import scu.com.demo.util.MybatisUtil;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:38:23
 */
//@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreDao scoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    @Override
    public Score queryById(Integer courseid) {
        return this.scoreDao.queryById(courseid);
    }

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score insert(Score score) {
        this.scoreDao.insert(score);
        return score;
    }

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score update(Score score) {
        this.scoreDao.update(score);
        return this.queryById(score.getCourseid());
    }

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer courseid) {
        return this.scoreDao.deleteById(courseid) > 0;
    }

    @Override
    public List<Score> getStuScore(Score score) {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreDao mapper = sqlSession.getMapper(ScoreDao.class);
        List<Score> stuScore = mapper.getStuScore(score);
        return stuScore;
    }
}
