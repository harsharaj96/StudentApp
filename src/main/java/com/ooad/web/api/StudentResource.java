/*
 * Created by Sandeep Tadepalli on 21/01/18 01:40
 * Copyright (c) 2018. All rights reserved.
 */

package com.ooad.web.api;

import com.ooad.web.Dao.StudentDao;
import com.ooad.web.Model.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("student")
public class StudentResource {
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt(@PathParam("id") int id) {
        System.out.println(id);
        final Student student = new StudentDao().getStudent(id);
        if (student != null) {
            return Response.status(Status.OK).entity(student).build();
        } else {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(null).build();
        }
    }

}
