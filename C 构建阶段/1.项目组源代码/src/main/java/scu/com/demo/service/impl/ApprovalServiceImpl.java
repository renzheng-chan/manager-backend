package scu.com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import scu.com.demo.entity.Approval;
import scu.com.demo.dao.ApprovalDao;
import scu.com.demo.service.ApprovalService;
import scu.com.demo.util.MybatisUtil;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Approval)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:36:27
 */
//@Service("approvalService")
public class ApprovalServiceImpl implements ApprovalService {
    @Resource
    private ApprovalDao approvalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param approvalid 主键
     * @return 实例对象
     */
    @Override
    public Approval queryById(Integer approvalid) {
        return this.approvalDao.queryById(approvalid);
    }

    /**
     * 新增数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    @Override
    public Approval insert(Approval approval) {
        this.approvalDao.insert(approval);
        return approval;
    }

    /**
     * 修改数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    @Override
    public Approval update(Approval approval) {
        this.approvalDao.update(approval);
        return this.queryById(approval.getApprovalid());
    }

    /**
     * 通过主键删除数据
     *
     * @param approvalid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer approvalid) {
        return this.approvalDao.deleteById(approvalid) > 0;
    }

    @Override
    public int addApproval(Approval approval) {
        System.out.println("开始插入");
        int i=0;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ApprovalDao mapper = sqlSession.getMapper(ApprovalDao.class);
        try{
            i=mapper.addApproval(approval);
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}
