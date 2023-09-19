package com.net.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.net.os.domain.Cliente;
import com.net.os.domain.OS;
import com.net.os.domain.Prioridade;
import com.net.os.domain.Status;
import com.net.os.domain.Tecnico;
import com.net.os.repositories.ClienteRepository;
import com.net.os.repositories.OSRepository;
import com.net.os.repositories.TecnicoRepository;

@Service
public class DbService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;
	
	@Bean
	public void instaciaDB() {
		
		Tecnico t1 =new Tecnico(null, "Jose augusto", "92448054134" ,"(61)984376380");
		Cliente c1 = new Cliente(null,"joao", "72195339187","(61)985263969");
		OS os1 = new OS(null,Prioridade.ALTA,"teste da os" ,Status.ABERTO , t1, c1);
			
		t1.getList().add(os1);
		c1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
		
		
	}

}
