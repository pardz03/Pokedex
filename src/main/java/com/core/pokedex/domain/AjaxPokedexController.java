package com.core.pokedex.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.pokedex.model.Pokemon;
import com.core.pokedex.service.JsonProcessorInterface;
import com.core.pokedex.util.PokedexConstants;
/**
 * 
 * @author joliveros
 *	this controller is used for json tables
 */
@RestController
public class AjaxPokedexController {
	@Autowired
	JsonProcessorInterface jsonProcessor;
	
	@RequestMapping(value = PokedexConstants.poketableAjaxMapping)
	public List<Pokemon> onLoad(){
		List<Pokemon> pokelist = jsonProcessor.convertJSONtoPokemon(jsonProcessor.getJSONdata());		
		return pokelist;
	}

}
