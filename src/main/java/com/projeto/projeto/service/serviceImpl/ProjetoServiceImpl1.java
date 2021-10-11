package com.projeto.projeto.service.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.projeto.repository.*;
import com.projeto.projeto.model.Conta;
import com.projeto.projeto.model.Lancamento;
import com.projeto.projeto.service.ProjetoService;
import com.projeto.projeto.service.ProjetoService1;



@Service //mostra que essa classe sera um bin do spring
public class ProjetoServiceImpl1 implements ProjetoService1{
	
	@Autowired //ponto de injecao do repository
	RepositoryLanc repositoryLanc;

	@Override
	public List<Lancamento> findall() {
		// TODO Auto-generated method stub
		return repositoryLanc.findAll();
	}

	@Override
	public Lancamento findById(Long num_lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lancamento save(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
