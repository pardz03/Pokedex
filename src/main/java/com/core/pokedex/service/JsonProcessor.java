package com.core.pokedex.service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Service;

import com.core.pokedex.model.Pokemon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 
 * @author joliveros
 *	service for processing JSON Data stored information of pokemon
 *
 */
@Service
public class JsonProcessor implements JsonProcessorInterface{
	
	public JsonProcessor(){}
	
	private static final String JSON_PATH = "src/main/resources/pokedata.json";
	
	/**
	 * 
	 * @return JSON data from json file
	 */
	public String getJSONdata(){
		// TODO Auto-generated method stub
		String content = "";
		try{
			content = readFile(JSON_PATH, StandardCharsets.UTF_8);			
		}catch (Exception e){
			System.err.println(e);
		}
		return content;
	}
	
	/**
	 * @return List of Pokemon
	 */
	public List<Pokemon> convertJSONtoPokemon(String json) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		TypeToken<List<Pokemon>> token = new TypeToken<List<Pokemon>>(){};
		List<Pokemon> listOfPokemon = gson.fromJson(json, token.getType());	
		
		return listOfPokemon;
	}
	

	private static String readFile(String path, Charset encoding) throws IOException {
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
	}



	
}
