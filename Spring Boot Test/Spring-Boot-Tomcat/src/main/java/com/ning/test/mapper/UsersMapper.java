package com.ning.test.mapper;

import com.ning.test.Entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("usersMapper")
public interface UsersMapper {
    List<Users> getListUsers();
    Users getUsers();
}
