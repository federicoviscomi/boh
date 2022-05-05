package com.feviscom.server.rest;

import com.feviscom.server.domain.User;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Stateless
@Path("/users")
public class UsersResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<User> getUsers() {
        return null;
    }

    /*


    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    //This will serve: GET /users/{userId}
    public User getUser(@PathParam("userId") String userId){
        return findUserById(userId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    //This will serve: POST /users
    public void addUser(User u) {
        users.add(u);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    //This will serve: PUT /users
    public Response updateUser(User u) {
        User user = findUserById(u.getId());
        if (user == null){
            return Response.status(Status.NOT_FOUND)
                    .entity("User with ID: "+u.getId()+" not found")
                    .build();
        }
        users.remove(user);
        users.add(u);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{userId}")
    //This will serve: DELETE /users/{userId}
    public void deleteUser(@PathParam("userId") String userId){
        User user = findUserById(userId);
        users.remove(user);
    }

    private User findUserById(String userId) {
        //TODO implement...
        return null;
    }

*/
}