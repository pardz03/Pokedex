package pokedexv1;

import java.util.List;

import org.junit.Test;

import com.core.pokedex.model.Pokemon;
import com.core.pokedex.service.JsonProcessor;

public class PokeTester {
	@Test
	public void test(){
		JsonProcessor js = new JsonProcessor();
		
		String jsondata = js.getJSONdata();
		
		List<Pokemon> pokelist = js.convertJSONtoPokemon(jsondata);
		
		try{
			for(Pokemon pokemon : pokelist){
				System.out.println("Name: "+pokemon.getName());
				System.out.println("Number: "+pokemon.getNumber());
				System.out.println("Height: "+pokemon.getHeight());
				System.out.println("Classification: "+pokemon.getClassification());
				System.out.println("Attack: "+pokemon.getFastAttacks());

				if(pokemon.getNextEvolutionRequirements()!= null){
					System.out.println("Next evolution requirements: ");
					System.out.println("	Name: "+pokemon.getNextEvolutionRequirements().getName());
					System.out.println("	Amount: "+pokemon.getNextEvolutionRequirements().getAmount());
					System.out.println();
				}
				System.out.println("Type: "+pokemon.getTypeI() + (pokemon.getTypeII() != null ? ","+pokemon.getTypeII():""));
				
				System.out.println("---------------------");
			}
		}catch(Exception e){
			System.out.println(e);
		}

	}
}
