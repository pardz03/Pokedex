package com.core.pokedex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.core.pokedex.model.Pokemon;
@Service
public interface JsonProcessorInterface {
	public String getJSONdata();
	public List<Pokemon> convertJSONtoPokemon(String json);
}
