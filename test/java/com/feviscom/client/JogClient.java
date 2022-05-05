package com.feviscom.client;

import com.feviscom.server.domain.User;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;

public class JogClient {
    private static final String URI_TEMPLATE = "http://localhost:8081/rest-server/%s";
    private final Client client;

    public JogClient() {
        client = ClientBuilder.newClient();
    }

    public void tearDown() {
        client.close();
    }

    public Object getUsers() {
        String uri = String.format(URI_TEMPLATE, "users");
        return Collections.unmodifiableList(
                client.target(uri)
                        .request(MediaType.APPLICATION_JSON_TYPE)
                        .get()
                        .readEntity(new GenericType<ArrayList<User>>() {
                        }));
    }

    public void addUser(User user) {
        throw new RuntimeException("method not implemented");
    }
}
