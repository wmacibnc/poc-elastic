package com.stefanini.pocelastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.stefanini.pocelastic.model.Tag;

public interface TagRepository extends ElasticsearchRepository<Tag, String> {
	
}
