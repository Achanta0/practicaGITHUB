import java.util.Scanner;

public class parImpar_DidacMontero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, total;
		
		System.out.println("Introduce 3 numeros.");
		
		num1=entrada.nextInt();
		num2=entrada.nextInt();
		num3=entrada.nextInt();
		
		total=num1+num2+num3;
		
		if(total%2==0) {
			
			System.out.println(total+ " es par.");
		}
		
		else {
			
			System.out.println(total+ " 4es impar.");
		}
		
		
	}

}
