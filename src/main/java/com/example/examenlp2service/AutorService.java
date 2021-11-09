package com.example.examenlp2service;

import java.util.List;

import com.example.examenlp2.entity.Autor;



public interface AutorService {
	List<Autor> readall();
	Autor create(Autor au);
	Autor read(int id);
	void delete(int id);
	Autor update(Autor au);
}
