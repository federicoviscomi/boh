package com.feviscom.server.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class RESTConfig extends Application {
    /*public Set<Object> getSingletons() {
        try {
            HashSet<Object> objects = new HashSet<>();
            objects.add(new SQLiteJDBC());
            return objects;
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
            return null;
        }
    }
*/
}
