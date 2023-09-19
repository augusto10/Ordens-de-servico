package com.net.os.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

public class OS {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@JsonFormat(pattern ="dd/MM/yyyy HH:mm")
	private LocalDateTime dataAbertura;
	@JsonFormat(pattern ="dd/MM/yyyy HH:mm")
	private LocalDateTime dataFecamento;
	private Integer prioridade;
	private String observaçoes;
	private Integer status;
	
	@ManyToOne
	@JoinColumn(name= "tecnico_id")
	private Tecnico tecnico;
	
	@ManyToOne
	@JoinColumn(name= "cliente_id")
	private Cliente cliente;
	public OS() {
		
		
		super();
		this.setDataAbertura(LocalDateTime.now());
		this.setPrioridade(Prioridade.BAIXA);
		this.setStatus(Status.ABERTO);
		
	}
	public OS(Integer id, Prioridade prioridade,
			String observaçoes, Status status, Tecnico tecnico, Cliente cliente) {
		super();
		this.id = id;
		this.setDataAbertura(LocalDateTime.now());
		
		this.prioridade = (prioridade == null) ? 0 : prioridade.getCod();
		this.observaçoes = observaçoes;
		this.status = (status == null) ? 0 : status.getCod();
		this.tecnico = tecnico;
		this.cliente = cliente;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public LocalDateTime getDataFecamento() {
		return dataFecamento;
	}
	public void setDataFecamento(LocalDateTime dataFecamento) {
		this.dataFecamento = dataFecamento;
	}
	public Prioridade getPrioridade() {
		return Prioridade.toEnum(this.prioridade);
	}
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade.getCod();
	}
	public String getObservaçoes() {
		return observaçoes;
	}
	public void setObservaçoes(String observaçoes) {
		this.observaçoes = observaçoes;
	}
	public Status getStatus() {
		return Status.toEnum(this.status);
	}
	public void setStatus(Status status) {
		this.status = status.getCod();
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OS other = (OS) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
