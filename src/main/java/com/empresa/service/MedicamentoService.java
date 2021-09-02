package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public abstract List<Medicamento> listaMedicamento();
	public abstract Medicamento insertarMedicament(Medicamento obj);
	public abstract Optional<Medicamento> obtenerPorId(int idMedicamento );
}
