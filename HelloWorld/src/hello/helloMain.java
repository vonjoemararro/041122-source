package hello;

import com.von.dl.PokemonTrainer;
import com.von.dl.PokemonTrainerDAO;

public class helloMain {
	
	int x;
	
	public helloMain() {
		
		x = 5;
		
	}

	
	static void myMethod() {
		
		System.out.println("My Cat is fluffy");
	}
	
	public static void main(String[] args) {

		
		PokemonTrainerDAO.addTrainer();
		
		//System.out.println(pokemonTrainer);
	}


	

}
