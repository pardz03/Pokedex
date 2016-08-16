package com.core.pokedex.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.core.pokedex.dto.PokedexDto;
import com.core.pokedex.model.Pokemon;
import com.core.pokedex.service.JsonProcessorInterface;
import com.core.pokedex.util.PokedexConstants;

@Controller
public class PokedexController {
	
	@Autowired
	JsonProcessorInterface jsonProcessor;
	
	@RequestMapping(value = PokedexConstants.poketableMainForm)
	public ModelAndView onLoad(ModelAndView mv){
		PokedexDto dto = new PokedexDto();
		
		List<Pokemon> pokelist = jsonProcessor.convertJSONtoPokemon(jsonProcessor.getJSONdata());		
		dto.setPokelist(pokelist);
		mv.addObject(PokedexConstants.objectMainForm, dto);
		mv.setViewName(PokedexConstants.mainPage);
		return mv;
	}

}
