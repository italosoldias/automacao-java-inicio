package fremework.selenium.condicional;

public class IfWelse {

	public static void main(String[] args) {
		

		animal("passarinh");
		
		
		
	}
	
	public static void animal(String nomeAnimal) {
		
		if (nomeAnimal == "cão" || nomeAnimal == "gato" || nomeAnimal == "hamister" ) {
			System.out.println("esse é um animau domestico = " + nomeAnimal );
		} else if (nomeAnimal == "passarinh" ||   nomeAnimal == "tubarao") {
			System.out.println("esse um animal que pode ser domesticado");
		} else {
			System.out.println("esse não é um animal");
		}
	}

}
