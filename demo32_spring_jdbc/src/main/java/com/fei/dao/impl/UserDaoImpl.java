package com.fei.dao.impl;

import com.fei.dao.UserDao;
import com.fei.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findUser() {
        List<User> query = jdbcTemplate.query("select * from t_user", new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setSex(resultSet.getString("sex"));
                user.setBirthday(resultSet.getDate("birthday"));
                user.setAddress(resultSet.getString("address"));
                user.setUid(resultSet.getInt("uid"));
                return user;
            }
        });
        return query;

    }


}
