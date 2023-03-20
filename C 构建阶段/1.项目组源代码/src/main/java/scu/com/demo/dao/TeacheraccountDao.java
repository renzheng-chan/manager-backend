package scu.com.demo.dao;

import scu.com.demo.entity.Teacheraccount;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Teacheraccount)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 09:40:05
 */
public interface TeacheraccountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherid 主键
     * @return 实例对象
     */
    Teacheraccount queryById(Integer teacherid);

    /**
     * 统计总行数
     *
     * @param teacheraccount 查询条件
     * @return 总行数
     */
    long count(Teacheraccount teacheraccount);

    /**
     * 新增数据
     *
     * @param teacheraccount 实例对象
     * @return 影响行数
     */
    int insert(Teacheraccount teacheraccount);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Teacheraccount> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Teacheraccount> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Teacheraccount> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Teacheraccount> entities);

    /**
     * 修改数据
     *
     * @param teacheraccount 实例对象
     * @return 影响行数
     */
    int update(Teacheraccount teacheraccount);

    /**
     * 通过主键删除数据
     *
     * @param teacherid 主键
     * @return 影响行数
     */
    int deleteById(Integer teacherid);

}

