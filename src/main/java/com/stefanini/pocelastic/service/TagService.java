package com.stefanini.pocelastic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.pocelastic.model.Tag;
import com.stefanini.pocelastic.repository.TagRepository;

@Service
public class TagService {

	@Autowired
	private TagRepository repository;

	public Tag obter(String id) {
		return repository.findOne(id);
	}

	public Tag salvar(Tag tag) {
		return repository.save(tag);
	}
	
}
