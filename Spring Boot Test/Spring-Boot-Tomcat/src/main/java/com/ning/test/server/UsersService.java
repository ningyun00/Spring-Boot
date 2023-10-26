package com.ning.test.server;

import com.ning.test.Entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("usersService")
public interface UsersService {

    List<Users> getListUsers();
    Users getUsers();
}
