package com.von.dl;

public class PokemonTrainerDAO {
	
	public static PokemonTrainer addTrainer() {
		
		//this line 
		PokemonTrainer pokemonTrainer = new PokemonTrainer();
		pokemonTrainer.firstName = "Von";
		pokemonTrainer.lastName = "arro";
		pokemonTrainer.age = 35;
		pokemonTrainer.typeFavorite= "grass";
		pokemonTrainer.badges = 5;
		
		System.out.println(pokemonTrainer);
	
		return pokemonTrainer;
	}

}
