package com.example.examenlp2service;

import java.util.List;

import com.example.examenlp2.entity.Libros;



public interface LibrosService {
	List<Libros> readall();
	Libros create(Libros l);
	Libros read(int id);
	void delete(int id);
	Libros update(Libros l);
}
