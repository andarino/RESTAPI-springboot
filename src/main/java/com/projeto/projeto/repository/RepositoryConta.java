package com.projeto.projeto.repository;
import java.util.Iterator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.projeto.projeto.model.Conta;

import java.util.List;


public interface RepositoryConta extends JpaRepository<Conta, Long>{

//	@Query(value = "select l.desc_lancamento from tb_lancamento l inner join tb_conta c where l.num_conta = c.num_conta", nativeQuery=true)
//	List<Conta> findContaLan(Long num_conta);
//	
		
}
