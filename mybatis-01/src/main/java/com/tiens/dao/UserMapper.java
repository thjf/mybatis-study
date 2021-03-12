package com.tiens.dao;

import com.tiens.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author baijing
 * @version 1.0
 * @date 2021/2/7 16:39
 */
public interface UserMapper {
    /**
     * 获取用户列表
     */
    List<User> getUserList();

    /**
     * 模糊查询
     * @param value
     * @return
     */
    List<User> getUserLike(String value);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 根据idMap查询用户
     * @param map
     * @return
     */
    User getUserByIdMap(Map<String,Object> map);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 添加用户Map
     * @param map
     * @return
     */
    int addUserMap(Map<String,Object> map);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     *删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);
}
