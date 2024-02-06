package com.sinensia.pollosalegres.backend.business.services.impl;

import static org.mockito.Mockito.when;

import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sinensia.pollosalegres.backend.business.model.Establecimiento;
import com.sinensia.pollosalegres.backend.integration.model.EstablecimientoPL;
import com.sinensia.pollosalegres.backend.integration.repositories.EstablecimientoPLRepository;

@ExtendWith(MockitoExtension.class)
public class EstablecimientoServicesImplTest {

	@Mock
	private EstablecimientoPLRepository establecimientoPLRepository;
	
	@Mock
	private DozerBeanMapper mapper;
	
	@InjectMocks
	private EstablecimientoServicesImpl establecimientoServicesImpl;
	
	private Establecimiento establecimiento1;
	private EstablecimientoPL establecimientoPL1;
	
	@BeforeEach
	void init() {
		initObjects();
	}
	
	@Test
	void create_establecimiento_ok() {
		
		establecimiento1.setCodigo(null);
		establecimientoPL1.setCodigo(null);
		
		when(mapper.map(establecimiento1, EstablecimientoPL.class)).thenReturn(establecimientoPL1);
		
		
	}
	
	// *************************************************
	//
	// Private Methods
	//
	// *************************************************
	
	private void initObjects() {
		
		establecimiento1 = new Establecimiento();
		establecimiento1.setCodigo(100L);
		establecimiento1.setNombreComercial("NOMBRE COMERCIAL ESTABLECIMIENTO 1");
		
		establecimientoPL1 = new EstablecimientoPL();
		establecimientoPL1.setCodigo(100L);
		establecimientoPL1.setNombreComercial("NOMBRE COMERCIAL ESTABLECIMIENTO 1");
	}
}