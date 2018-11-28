package com.stefanini.pocelastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.pocelastic.model.Tag;
import com.stefanini.pocelastic.service.TagService;

@RestController
@RequestMapping("/tag")
@CrossOrigin(origins = "*")
public class TagController {

	@Autowired
	TagService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/obter/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tag> obter(@PathVariable(value = "id") String id){
		return new ResponseEntity<>(service.obter(id), HttpStatus.OK);
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = "/salvar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> salvar(@RequestBody Tag tag){
		service.salvar(tag);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}