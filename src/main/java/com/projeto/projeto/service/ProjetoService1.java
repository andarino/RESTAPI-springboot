package com.projeto.projeto.service;
import java.util.List;

import com.projeto.projeto.model.*;

public interface ProjetoService1 {

	List<Lancamento> findall();
	Lancamento findById(Long num_lancamento); //retorna um unico id
	Lancamento save(Lancamento lancamento); //para salvar a conta no banco
	
	 
}
