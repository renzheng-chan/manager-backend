package scu.com.demo.dao;

import scu.com.demo.entity.Exam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Exam)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 09:37:34
 */
public interface ExamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param courseid 主键
     * @return 实例对象
     */
    Exam queryById(Integer courseid);

    /**
     * 统计总行数
     *
     * @param exam 查询条件
     * @return 总行数
     */
    long count(Exam exam);

    /**
     * 新增数据
     *
     * @param exam 实例对象
     * @return 影响行数
     */
    int insert(Exam exam);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exam> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Exam> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exam> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Exam> entities);

    /**
     * 修改数据
     *
     * @param exam 实例对象
     * @return 影响行数
     */
    int update(Exam exam);

    /**
     * 通过主键删除数据
     *
     * @param courseid 主键
     * @return 影响行数
     */
    int deleteById(Integer courseid);

}

