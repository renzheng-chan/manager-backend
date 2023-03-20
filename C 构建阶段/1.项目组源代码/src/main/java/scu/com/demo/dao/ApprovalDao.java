package scu.com.demo.dao;

import scu.com.demo.entity.Approval;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Approval)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 09:36:22
 */
public interface ApprovalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param approvalid 主键
     * @return 实例对象
     */
    Approval queryById(Integer approvalid);

    /**
     * 统计总行数
     *
     * @param approval 查询条件
     * @return 总行数
     */
    long count(Approval approval);

    /**
     * 新增数据
     *
     * @param approval 实例对象
     * @return 影响行数
     */
    int insert(Approval approval);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Approval> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Approval> entities);

//    /**
//     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
//     *
//     * @param entities List<Approval> 实例对象列表
//     * @return 影响行数
//     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
//     */
    int insertOrUpdateBatch(@Param("entities") List<Approval> entities);

    /**
     * 修改数据
     *
     * @param approval 实例对象
     * @return 影响行数
     */
    int update(Approval approval);

    /**
     * 通过主键删除数据
     *
     * @param approvalid 主键
     * @return 影响行数
     */
    int deleteById(Integer approvalid);

    int addApproval(Approval approval);

}

