package scu.com.demo.dao;

import scu.com.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 09:40:21
 */
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    User queryById(Integer account);

    /**
     * 统计总行数
     *
     * @param user 查询条件
     * @return 总行数
     */
    long count(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User> entities);

//    /**
//     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
//     *
//     * @param entities List<User> 实例对象列表
//     * @return 影响行数
//     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
//     */
    int insertOrUpdateBatch(@Param("entities") List<User> entities);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 影响行数
     */
    int deleteById(Integer account);


    User login(User user);

    List<User> getAll();

    int addUser(User user);

    User getUserById(User user);
}

