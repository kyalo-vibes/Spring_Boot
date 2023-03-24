package com.example.springbootunittests;

import jakarta.annotation.Resource;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // @RunWith: integrate spring with junit
@SpringBootTest(classes = {SpringBootUnitTestsApplication.class}) // @SpringBootTest: this class is spring boot test.
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testGetUser() {
        Assert.assertEquals(userService.getUser(), "Tom");
    }
}
