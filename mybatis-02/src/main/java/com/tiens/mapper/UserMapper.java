package com.tiens.mapper;

import com.tiens.pojo.User;

import java.util.List;

/**
 * @author baijing
 * @version 1.0
 * @date 2021/2/7 16:39
 */
public interface UserMapper {
    /**
     * 获取用户列表
     * @return 用户列表
     */
    List<User> getUserList();

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return id对应用户
     */
    User getUserById(int id);

    /**
     * 添加用户
     * @param user 用户
     * @return 添加成功
     */
    int addUser(User user);

    /**
     * 修改用户
     * @param user 用户
     * @return 修改成功
     */
    int updateUser(User user);

    /**
     *删除用户
     * @param id 用户id
     * @return 删除成功
     */
    int deleteUser(int id);
}
