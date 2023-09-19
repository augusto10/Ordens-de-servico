package com.net.os.config;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.net.os.services.DbService;



@Configuration
@Profile("test")
public class TestConfig {
	@Autowired
	private DbService dbService;
	
	
	
	public void instaciaDB() {
		
		this.dbService.instaciaDB();
		
		
		
	}

}
