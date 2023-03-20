package scu.com.demo.service;

import scu.com.demo.entity.Approval;

/**
 * (Approval)表服务接口
 *
 * @author makejava
 * @since 2022-07-17 09:36:26
 */
public interface ApprovalService {

    /**
     * 通过ID查询单条数据
     *
     * @param approvalid 主键
     * @return 实例对象
     */
    Approval queryById(Integer approvalid);

    /**
     * 新增数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    Approval insert(Approval approval);

    /**
     * 修改数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    Approval update(Approval approval);

    /**
     * 通过主键删除数据
     *
     * @param approvalid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer approvalid);

    int addApproval(Approval approval);
}
