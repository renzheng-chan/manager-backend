package scu.com.demo.dao;

import scu.com.demo.entity.Stuaccount;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Stuaccount)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 09:38:34
 */
public interface StuaccountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    Stuaccount queryById(Integer account);

    /**
     * 统计总行数
     *
     * @param stuaccount 查询条件
     * @return 总行数
     */
    long count(Stuaccount stuaccount);

    /**
     * 新增数据
     *
     * @param stuaccount 实例对象
     * @return 影响行数
     */
    int insert(Stuaccount stuaccount);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stuaccount> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Stuaccount> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stuaccount> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Stuaccount> entities);

    /**
     * 修改数据
     *
     * @param stuaccount 实例对象
     * @return 影响行数
     */
    int update(Stuaccount stuaccount);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 影响行数
     */
    int deleteById(Integer account);

}

