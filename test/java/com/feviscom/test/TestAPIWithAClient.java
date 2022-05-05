package com.feviscom.test;

import com.feviscom.client.JogClient;
import com.feviscom.server.domain.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class TestAPIWithAClient {
    private JogClient client;
    private User user;

    @BeforeClass
    public void init() {
        client = new JogClient();
        user = new User(1, "username1", "password1");
    }

    @AfterClass
    public void tearDown() {
        client.tearDown();
    }

    //@Test
    public void testAddUser() {
        Throwable thrown = catchThrowable(() -> client.addUser(user));
        assertThat(thrown).isNotNull();
    }

    //@Test(dependsOnMethods = {"testAddUser"})
    public void testGetUsers() {
        Object users = client.getUsers();
        assertThat(users).isNotNull();
        //assertThat(userList).containsOnly(user);
    }


}
