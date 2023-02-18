import java.util.Scanner;

public class Frase_DidacMontero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		char letra;
		
		int cont=0;
		
		System.out.println("Introduce una frase.");
		frase = entrada.nextLine();

		if (frase.length()<1) {
			
			System.out.println("La longitud del caracter tiene que ser mayor o igual a 1.");
		}
		
		else {	
			
			System.out.println("Introduce la letra que quieres cambiar.");
			letra = entrada.next().charAt(0);
			
			for (int i=0; i<frase.length(); i++){
				
			    if (letra==frase.charAt(i)) {
			    	
			    	cont++;
			    }	    
			}
			
			if (cont>=1) {
				
				frase=frase.replace(letra, '*');
				System.out.println(frase);
			}
			
			else {
				
				System.out.println("El caracter no existe.");
			}
		}
		
		
	}

}
