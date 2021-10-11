package com.projeto.projeto.service;

import java.util.List;

import com.projeto.projeto.model.*;


public interface ProjetoService {

	List<Conta> findall(); //lista de ids
	Conta findById(long num_conta); //retorna um unico id
	Conta save(Conta conta); //para salvar a conta no banco
	
	
//	List<Conta> findContaLanc(Long num_conta);
	
}
