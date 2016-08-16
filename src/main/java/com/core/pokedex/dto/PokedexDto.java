package com.core.pokedex.dto;

import java.util.List;

import com.core.pokedex.model.Pokemon;

public class PokedexDto {
	
	public PokedexDto(){}
	
	private List<Pokemon> pokelist;
	
	public List<Pokemon> getPokelist() {
		return pokelist;
	}

	public void setPokelist(List<Pokemon> pokelist) {
		this.pokelist = pokelist;
	}

}
