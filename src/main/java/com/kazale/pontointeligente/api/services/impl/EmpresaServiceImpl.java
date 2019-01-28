package com.kazale.pontointeligente.api.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.pontointeligente.api.entities.Empresa;
import com.kazale.pontointeligente.api.repositories.EmpresaRepository;
import com.kazale.pontointeligente.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{


	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@Override
	public Empresa buscarPorCnpj(String cnpj) {
		
		return empresaRepository.findByCnpj(cnpj);
	
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		
		return empresaRepository.save(empresa);
	}

}
