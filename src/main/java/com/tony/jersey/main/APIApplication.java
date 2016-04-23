package com.tony.jersey.main;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.tony.jersey.resource.UserResource;

public class APIApplication extends ResourceConfig {
	public APIApplication() {
		// ����Resource
		register(UserResource.class);

		// ע������ת����
		register(JacksonJsonProvider.class);

		// Logging.
		register(LoggingFilter.class);
	}
}
