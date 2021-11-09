package com.example.examenlp2.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenlp2.entity.Autor;
import com.example.examenlp2.repository.AutorRepository;
import com.example.examenlp2service.AutorService;



@Service
public class AutorServiceImpl implements AutorService {
	@Autowired
	private AutorRepository autorRepository;
	@Override
	public List<Autor> readall() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}

	@Override
	public Autor create(Autor au) {
		// TODO Auto-generated method stub
		return autorRepository.save(au);
	}

	@Override
	public Autor read(int id) {
		// TODO Auto-generated method stub
		return autorRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		autorRepository.deleteById(id);
	}

	@Override
	public Autor update(Autor au) {
		// TODO Auto-generated method stub
		return autorRepository.save(au);
	}

}
