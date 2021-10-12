package com.DigitalHouse.blog.repository;

import com.DigitalHouse.blog.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JavaRepository extends JpaRepository <Postagem, Long> {

    // consulta pelo título

    public List<Postagem> findAllByTituloContainingIgnoraCae (String titulo);
}
