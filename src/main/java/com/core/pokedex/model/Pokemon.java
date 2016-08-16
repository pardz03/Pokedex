package com.core.pokedex.model;

import java.util.List;

public class Pokemon {
	
	public Pokemon(){}
	
	private String number;
	private String name;
	private String classification;
	private List<String> typeI;
	private List<String> typeII;
	private List<String> weaknesses;
	private List<String> fastAttacks;
	private List<String> specialAttacks;
	private String weight;
	private String height;
	private NextEvolutionRequirements nextEvolutionRequirements;
	private List<Pokemon> nextEvolutions;
	private List<Pokemon> previousEvolutions;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public List<String> getTypeI() {
		return typeI;
	}

	public void setTypeI(List<String> typeI) {
		this.typeI = typeI;
	}

	public List<String> getTypeII() {
		return typeII;
	}

	public void setTypeII(List<String> typeII) {
		this.typeII = typeII;
	}

	public List<String> getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(List<String> weaknesses) {
		this.weaknesses = weaknesses;
	}

	public List<String> getFastAttacks() {
		return fastAttacks;
	}

	public void setFastAttacks(List<String> fastAttacks) {
		this.fastAttacks = fastAttacks;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public NextEvolutionRequirements getNextEvolutionRequirements() {
		return nextEvolutionRequirements;
	}

	public void setNextEvolutionRequirements(NextEvolutionRequirements nextEvolutionRequirements) {
		this.nextEvolutionRequirements = nextEvolutionRequirements;
	}

	public List<Pokemon> getNextEvolutions() {
		return nextEvolutions;
	}

	public void setNextEvolutions(List<Pokemon> nextEvolutions) {
		this.nextEvolutions = nextEvolutions;
	}

	public List<Pokemon> getPreviousEvolutions() {
		return previousEvolutions;
	}

	public void setPreviousEvolutions(List<Pokemon> previousEvolutions) {
		this.previousEvolutions = previousEvolutions;
	}
	public List<String> getSpecialAttacks() {
		return specialAttacks;
	}
	public void setSpecialAttacks(List<String> specialAttacks) {
		this.specialAttacks = specialAttacks;
	}
}
