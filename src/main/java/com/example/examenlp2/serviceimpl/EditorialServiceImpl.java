package com.example.examenlp2.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenlp2.entity.Editorial;
import com.example.examenlp2.repository.EditorialRepository;
import com.example.examenlp2service.EditorialService;
@Service
public class EditorialServiceImpl implements EditorialService {
@Autowired
private EditorialRepository editorialRepository;
	@Override
	public List<Editorial> readall() {
		// TODO Auto-generated method stub
		return editorialRepository.findAll();
	}

	@Override
	public Editorial create(Editorial e) {
		// TODO Auto-generated method stub
		return editorialRepository.save(e);
	}

	@Override
	public Editorial read(int id) {
		// TODO Auto-generated method stub
		return editorialRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		editorialRepository.deleteById(id);
	}

	@Override
	public Editorial update(Editorial e) {
		// TODO Auto-generated method stub
		return editorialRepository.save(e);
	}

}
