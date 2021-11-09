package com.example.examenlp2.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenlp2.entity.Libros;
import com.example.examenlp2.repository.LibrosRepository;
import com.example.examenlp2service.LibrosService;


@Service
public class LibrosServiceImpl implements LibrosService {
@Autowired
private LibrosRepository librosRepository;
	@Override
	public List<Libros> readall() {
		// TODO Auto-generated method stub
		return librosRepository.findAll();
	}

	@Override
	public Libros create(Libros l) {
		// TODO Auto-generated method stub
		return librosRepository.save(l);
	}

	@Override
	public Libros read(int id) {
		// TODO Auto-generated method stub
		return librosRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		librosRepository.deleteById(id);
		
	}

	@Override
	public Libros update(Libros l) {
		// TODO Auto-generated method stub
		return librosRepository.save(l);
	}

}
