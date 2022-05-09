package com.repository;

import com.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepoTest {
    @Autowired
    private UserRepo userService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<User> users = userService.findAll();

        Assert.assertEquals(users.get(1),1);
    }
}