package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Funcionario;

public interface FuncinarioService {

	Funcionario persistir(Funcionario funcionario);
	
	Optional<Funcionario> buscaPorCPF(String cpf);
	
	Optional<Funcionario> buscaPorEmail(String email);
	
	Optional<Funcionario> buscaPorID(Long id);
}
