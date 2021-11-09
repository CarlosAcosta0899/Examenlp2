package com.example.examenlp2service;

import java.util.List;

import com.example.examenlp2.entity.Editorial;



public interface EditorialService  {
	List<Editorial> readall();
	Editorial create(Editorial e);
	Editorial read(int id);
	void delete(int id);
	Editorial update(Editorial e);
}
