package com.projeto.projeto.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.projeto.model.Conta;
import com.projeto.projeto.model.Lancamento;


public interface RepositoryLanc extends JpaRepository<Lancamento, Long>{
	@Query(value = "SELECT * FROM tb_conta  INNER JOIN tb_lancamento ON tb_conta.num_conta = tb_lancamento.num_conta", nativeQuery=true)
	List<Lancamento> findContaLan(Long num_conta);
	
	
}
