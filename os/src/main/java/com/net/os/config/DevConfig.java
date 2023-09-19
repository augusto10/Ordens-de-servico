package com.net.os.config;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.net.os.services.DbService;



@Configuration
@Profile("dev")
public class DevConfig {
	@Autowired
	private DbService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto=create}")
	private  String ddl; 
	
	
	
	public boolean instaciaDB() {
		
		if(ddl.equals("create")) {
			this.dbService.instaciaDB();
		}
		
		return false;
		
	}

}
