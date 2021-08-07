package com.wzw.repository;

import com.wzw.entity.User;

import java.util.Collection;

/**
 * @author wei
 * @Date 2021/8/4
 */
public interface UserRepository {
    public Collection<User> findAll();
    public User findById(Integer id);
    public void save(User user);
    public void deleteById(Integer id);
    public void update(User user);
}
