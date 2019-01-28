package com.kazale.pontointeligente.api;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.kazale.pontointeligente.api.entities.Empresa;
import com.kazale.pontointeligente.api.repositories.EmpresaRepository;
import com.kazale.pontointeligente.api.services.EmpresaService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test") 
public class EmpresaServices {

	@MockBean
	private EmpresaService empresaService;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	private static final String CNPJ = "12345678901234";
	
	
	@Before
	public void test() {
		BDDMockito.given(empresaRepository.findByCnpj(Mockito.anyString())).willReturn(new Empresa());
		BDDMockito.given(empresaRepository.save(Mockito.any(Empresa.class))).willReturn(new Empresa());
	}
	
	@Test
	public void testBuscarPorCNPJ() {
		Empresa empresa =  this.empresaService.buscarPorCnpj(CNPJ);
		
		assertEquals(CNPJ, empresa.getCnpj());
		//verify(empresa).getCnpj().contains(CNPJ);
	}

	@Test
	public void testSave() {
		Empresa empresa =  this.empresaService.persistir(new Empresa());
		
		assertNotNull(empresa);
	}
}
