package fremework.selenium.condicional;

public class SwitchCase {

	public static void main(String[] args) {
		animal("tubarão");
		
	}
	
	public static void animal (String nomeAnimal) {
 		
		switch (nomeAnimal) {
		case "gato":
			System.out.println("esse é um animal guloso " + nomeAnimal );
			break;
		case "cao":
			System.out.println("esse é um animal carente " + nomeAnimal );
			break;
		case "tubarão" :
			System.out.println("esse é um animal feroz " + nomeAnimal );
			break;
		default	:
			System.out.println("isso não é um animal " + nomeAnimal );

		}
	}

}
