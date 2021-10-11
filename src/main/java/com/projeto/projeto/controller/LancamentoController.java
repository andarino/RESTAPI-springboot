package com.projeto.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.projeto.projeto.model.Conta;
import com.projeto.projeto.model.Lancamento;
import com.projeto.projeto.repository.RepositoryLanc;

@Controller 
public class LancamentoController {
	@Autowired
	RepositoryLanc repositoryLanc;
	
	@GetMapping("/lancamento")
	@ResponseBody
	public Iterable<Lancamento> getAllConta(){
		return repositoryLanc.findAll();
	}
	
	@PutMapping(value = "/lancamento")
	@ResponseBody
	public Lancamento updateLancamento(@RequestBody Lancamento lancamento) {
		return repositoryLanc.saveAndFlush(lancamento);
	}
	 
	@RequestMapping(value = "/lancamento", method = RequestMethod.POST)
	 @ResponseBody
	public Lancamento saveLancamento(@RequestBody Lancamento lancamento) {
		return repositoryLanc.save(lancamento);
	}
	
	
	@DeleteMapping("/lancamento/{num_lancamento}")
	@ResponseBody
	public void deleteLancamento(@PathVariable Long num_lancamento) {
		repositoryLanc.deleteById(num_lancamento);  
	}
	
	@GetMapping("/lancamento/{num_lancamento}")
	@ResponseBody
	public Lancamento getLancamentoById(@PathVariable Long num_lancamento) {
		// TODO Auto-generated method stub
		return repositoryLanc.findById(num_lancamento).get();
	}
	
	
}
