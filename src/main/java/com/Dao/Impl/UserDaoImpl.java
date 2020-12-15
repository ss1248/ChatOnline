package com.Dao.Impl;

import com.Dao.UserDao;
import com.pojo.User;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Data
public class UserDaoImpl implements UserDao {
    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> getUserList() {
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        return userDao.getUserList();
    }
}
