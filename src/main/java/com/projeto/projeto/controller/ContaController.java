package com.projeto.projeto.controller;

import java.util.Iterator;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.projeto.projeto.model.Conta;
import com.projeto.projeto.model.Lancamento;
import com.projeto.projeto.repository.RepositoryConta;
import com.projeto.projeto.repository.RepositoryLanc;
import com.projeto.projeto.service.ProjetoService;
import java.util.List;

@Controller
public class ContaController {

	@Autowired
	RepositoryConta repositoryConta;
	
	@Autowired
	RepositoryLanc repositoryLanc;
	
	@GetMapping("/contas/")
	@ResponseBody
	public Iterable<Conta> getAllConta() {
		return repositoryConta.findAll();
	}
	
	@GetMapping("/contas/{num_conta}")
	@ResponseBody
	public Conta getContaById(@PathVariable Long num_conta){
		return repositoryConta.findById(num_conta).get();
	}
	
	 @RequestMapping(value = "/contas", method = RequestMethod.POST)
	 @ResponseBody
	public Conta saveConta(@RequestBody Conta conta) {
		return repositoryConta.save(conta);
	}
	
	@DeleteMapping("/contas/{num_conta}")
	@ResponseBody
	public void deleteConta(@PathVariable Long num_conta) {
		repositoryConta.deleteById(num_conta);  
	}
	
	@PutMapping(value = "/contas")
	@ResponseBody
	public Conta updateConta(@RequestBody Conta conta) {
		return repositoryConta.saveAndFlush(conta);
	}

	
}
	
	
