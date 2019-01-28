package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

/*	Retorna uma empresa dado um CNPJ
	@param cnpj
	@return Optional<Empresa>*/
	
	Empresa buscarPorCnpj(String cnpj);
	
/*	Cadastra uma empresa na base de dados
	@param empresa
	@return Empresa*/
			
	Empresa persistir(Empresa empresa);
}
