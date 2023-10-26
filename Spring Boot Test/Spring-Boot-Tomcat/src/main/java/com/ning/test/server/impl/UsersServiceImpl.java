package com.ning.test.server.impl;

import com.ning.test.Entity.Users;
import com.ning.test.mapper.UsersMapper;
import com.ning.test.server.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    private  UsersMapper usersMapper;

    @Override
    public List<Users> getListUsers() {
        return usersMapper.getListUsers();
    }

    @Override
    public Users getUsers() {
        return usersMapper.getUsers();
    }
}
