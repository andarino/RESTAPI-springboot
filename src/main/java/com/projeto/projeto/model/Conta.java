package com.projeto.projeto.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="TB_CONTA")
public class Conta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //gerar os ids automaticamente
	private Long num_conta;
	
	private String saldo;
	
	private String cpf;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conta",  cascade = CascadeType.ALL)
	private List<Lancamento> lancamentos;
	
	
	public Long getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(Long num_conta) {
		this.num_conta = num_conta;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
 
	
}
