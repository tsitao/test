package com.tony.jersey.main;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.tony.jersey.resource.UserResource;

/**
 * @author Pavel Bucek (pavel.bucek at oracle.com)
 */
@ApplicationPath("/")
public class MyApplication extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    final Set<Class<?>> classes = new HashSet<Class<?>>();
    // register root resource
    classes.add(UserResource.class);
    return classes;
  }
}