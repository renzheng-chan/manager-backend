package scu.com.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import scu.com.demo.entity.User;
import scu.com.demo.dao.UserDao;
import scu.com.demo.service.UserService;
import scu.com.demo.util.MybatisUtil;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-07-17 09:40:21
 */
//@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer account) {
        return this.userDao.queryById(account);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getAccount());
    }

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer account) {
        return this.userDao.deleteById(account) > 0;
    }

    @Override
    public User login(User user) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User login = mapper.login(user);
        return login;
    }

    @Override
    public User getUserById(User user) {
        System.out.println("进入getUserById方法的实现！");
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User login = mapper.getUserById(user);
        return login;
    }

    @Override
    public int addUser(User user) {
        int i=0;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        try{
            i=mapper.addUser(user);
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}
