package com.ecomerce.AquiTem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.despertartech.redesocial.model.Postagem;

public interface CategoriaRepository extends JpaRepository<Postagem, Long>{

	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
}