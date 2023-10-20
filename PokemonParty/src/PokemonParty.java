import java.util.Scanner;
import java.util.ArrayList;

public class PokemonParty {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Enter pokemon 1: ");
		String pokemon1 = scanner.nextLine();
		
		
		System.out.println("Enter pokemon 2: ");
		String pokemon2 = scanner.nextLine();
		
		
		System.out.println("Enter pokemon 3: ");
		String pokemon3 = scanner.nextLine();
		
		
		System.out.println("Enter pokemon 4: ");
		String pokemon4 = scanner.nextLine();
		
		
		System.out.println("Enter pokemon 5: ");
		String pokemon5 = scanner.nextLine();
		
		
		*/
		
		String[] pokemon = new String[5];
		
		for (int i = 0; i < pokemon.length; i++) {
			System.out.println("Enter the names of the pokemons: " + i);
			pokemon[i] = scanner.nextLine();
		}
		System.out.println("Pokemon 1 is: " + pokemon[0]);
		System.out.println("Pokemon 2 is: " + pokemon[1]);
		System.out.println("Pokemon 3 is: " + pokemon[2]);
		System.out.println("Pokemon 4 is: " + pokemon[3]);
		System.out.println("Pokemon 5 is: " + pokemon[4]);
		
		scanner.close();
		
		
		
	}

}
