package scu.com.demo.dao;

import scu.com.demo.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Teacher)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 09:39:34
 */
public interface TeacherDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teacherid 主键
     * @return 实例对象
     */
    Teacher queryById(Integer teacherid);

    /**
     * 统计总行数
     *
     * @param teacher 查询条件
     * @return 总行数
     */
    long count(Teacher teacher);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 影响行数
     */
    int insert(Teacher teacher);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Teacher> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Teacher> entities);

//    /**
//     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
//     *
//     * @param entities List<Teacher> 实例对象列表
//     * @return 影响行数
//     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
//     */
    int insertOrUpdateBatch(@Param("entities") List<Teacher> entities);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 影响行数
     */
    int update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param teacherid 主键
     * @return 影响行数
     */
    int deleteById(Integer teacherid);

    Teacher getPersonalInfo(Teacher teacher);

}

