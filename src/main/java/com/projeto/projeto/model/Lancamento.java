package com.projeto.projeto.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity // This tells Hibernate to make a table out of this class
@Table (name="TB_LANCAMENTO")
public class Lancamento{
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO) //gerar os ids automaticamente
	private Long num_lancamento;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate data_lancamento ;
	

	private String valor_lancamento;
	
	@Valid
	@NotBlank
	@Pattern(regexp = "D|C", message = "D ou C")
	private String natureza_lancamento;
	
	@Lob //pro banco pegar valores grandes  
	private String desc_lancamento;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name="num_conta", nullable = false)
	private Conta conta;	
	
	
	public Long getNum_lancamento() {
		return num_lancamento;
	}

	public void setNum_lancamento(Long num_lancamento) {
		this.num_lancamento = num_lancamento;
	}

	public LocalDate getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(LocalDate data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

	public String getValor_lancamento() {
		return valor_lancamento;
	}

	public void setValor_lancamento(String valor_lancamento) {
		this.valor_lancamento = valor_lancamento;
	}

	public String getNatureza_lancamento() {
		return natureza_lancamento;
	}

	public void setNatureza_lancamento(String natureza_lancamento) {
		this.natureza_lancamento = natureza_lancamento;
	}

	public String getDesc_lancamento() {
		return desc_lancamento;
	}

	public void setDesc_lancamento(String desc_lancamento) {
		this.desc_lancamento = desc_lancamento;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}


	
	
}
