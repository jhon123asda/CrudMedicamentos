package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repositoy.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
	
	
	@Autowired
	private MedicamentoRepository repository;

	@Override
	public List<Medicamento> listaMedicamento() {
		
		return repository.findAll();
	}

	@Override
	public Medicamento insertarMedicament(Medicamento obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public Optional<Medicamento> obtenerPorId(int idMedicamento) {
		
		return repository.findById(idMedicamento);
	}
	

	
	
	
}
