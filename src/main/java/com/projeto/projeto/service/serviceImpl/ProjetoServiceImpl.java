package com.projeto.projeto.service.serviceImpl;

import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.projeto.repository.*;
import com.projeto.projeto.model.Conta;
import com.projeto.projeto.model.Lancamento;
import com.projeto.projeto.service.ProjetoService;



@Service //mostra que essa classe sera um bin do spring
public class ProjetoServiceImpl implements ProjetoService{
	
	@Autowired //ponto de injecao do repository
	RepositoryConta RepositoryConta;
		
	@Override
	public List<Conta> findall() {
		// TODO Auto-generated method stub
		return RepositoryConta.findAll();
	}
	
	

	@Override
	public Conta findById(long num_conta) {
		// TODO Auto-generated method stub
		return RepositoryConta.findById(num_conta).get();
	}

	@Override
	public Conta save(Conta conta) {
		// TODO Auto-generated method stub
		return RepositoryConta.save(conta);
	}
	
//	@Override
//	public List<Conta> findContaLanc(Long num_conta){
//		return RepositoryConta.findContaLan(num_conta);
//	}
//	
//	
	
}
