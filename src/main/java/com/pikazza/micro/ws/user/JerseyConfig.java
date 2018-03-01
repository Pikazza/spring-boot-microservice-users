package com.pikazza.micro.ws.user;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JerseyConfig extends ResourceConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(JerseyConfig.class);

    public JerseyConfig() {
    	LOGGER.info(UsersController.class.getName()+"  Registed");
    	register(UsersController.class);
    }

}
