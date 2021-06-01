package br.com.hfdev.centraRpgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hfdev.centraRpgl.repository.PostagemRepository;

@RestController @RequestMapping("/postagens") @CrossOrigin ("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	

}
