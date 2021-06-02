package br.com.hfdev.centraRpgl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hfdev.centraRpgl.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
