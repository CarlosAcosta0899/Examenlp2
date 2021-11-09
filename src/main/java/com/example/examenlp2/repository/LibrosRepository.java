package com.example.examenlp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examenlp2.entity.Libros;
@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer> {

}
