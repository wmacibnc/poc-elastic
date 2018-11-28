package com.stefanini.pocelastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "tag", type = "tag", shards = 1)
public class Tag {

	@Id
	private String id;
	private String texto;

	public Tag() {
		super();
	}

	public Tag(String id, String texto) {
		super();
		this.id = id;
		this.texto = texto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
