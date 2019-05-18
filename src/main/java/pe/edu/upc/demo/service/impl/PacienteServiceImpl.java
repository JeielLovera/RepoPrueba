package pe.edu.upc.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.demo.entity.Paciente;
import pe.edu.upc.demo.repository.PacienteRepository;
import pe.edu.upc.demo.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {


	@Autowired
	private PacienteRepository pacienteRepo;
	
	@Transactional(readOnly = true)
	@Override
	public List<Paciente> findAll() throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepo.findAll();
	}

	@Transactional
	@Override
	public Paciente save(Paciente t) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepo.save(t);
	}

	@Transactional
	@Override
	public Paciente update(Paciente t) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepo.save(t);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Paciente> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepo.findById(id);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		pacienteRepo.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		pacienteRepo.deleteAll();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Paciente> FindByNombre(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return pacienteRepo.FindByNombre(nombre);
	}

}
