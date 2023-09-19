package com.net.os;

import java.util.Arrays;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.net.os.domain.Cliente;
import com.net.os.domain.OS;
import com.net.os.domain.Prioridade;
import com.net.os.domain.Status;
import com.net.os.domain.Tecnico;
import com.net.os.repositories.ClienteRepository;
import com.net.os.repositories.OSRepository;
import com.net.os.repositories.TecnicoRepository;

@SpringBootApplication
public class OsApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

	

}
