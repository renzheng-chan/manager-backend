package scu.com.demo.dao;

import scu.com.demo.entity.Classinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Classinfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 09:36:52
 */
public interface ClassinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param classid 主键
     * @return 实例对象
     */
    Classinfo queryById(Integer classid);

    /**
     * 统计总行数
     *
     * @param classinfo 查询条件
     * @return 总行数
     */
    long count(Classinfo classinfo);

    /**
     * 新增数据
     *
     * @param classinfo 实例对象
     * @return 影响行数
     */
    int insert(Classinfo classinfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classinfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Classinfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classinfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Classinfo> entities);

    /**
     * 修改数据
     *
     * @param classinfo 实例对象
     * @return 影响行数
     */
    int update(Classinfo classinfo);

    /**
     * 通过主键删除数据
     *
     * @param classid 主键
     * @return 影响行数
     */
    int deleteById(Integer classid);

}

