package com.example.app.SpringBootWebContacts;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

@SpringBootApplication
public class WebContactsApplication {
	private static final Logger LOGGER = Logger.getLogger(WebContactsApplication.class.getName());

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebContactsApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
		LOGGER.info("APP is running...");
	}

}
