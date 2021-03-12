package dao;

import com.tiens.mapper.UserMapper;
import com.tiens.pojo.User;
import com.tiens.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author baijing
 * @version 1.0
 * @date 2021/2/7 17:03
 */
public class UserDaoTest {
    /**
     * 查询用户列表
     */
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //方式一:getMapper
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            //方式二:
            //List<User> userList = sqlSession.selectList("com.tiens.dao.UserDao.getUserList");
            for (User user : userList) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭sqlSession
            sqlSession.close();
        }
    }

    /**
     * 根据id查询用户
     */
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    /**
     * 添加用户，增删改都需要提交事务
     */
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int addUser = mapper.addUser(new User(5,"啊哈哈","4357438953"));
        if (addUser>0){
            System.out.println("插入成功!");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 修改用户
     */
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int wei = mapper.updateUser(new User(5, "小笨薇薇", "545433"));
        if (wei>0){
            System.out.println("修改成功!");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 删除
     */
    @Test
    public void testDelete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int delete = mapper.deleteUser(2);
        if (delete>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
