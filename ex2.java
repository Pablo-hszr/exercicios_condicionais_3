package exerciciocondicional3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;
		
		System.out.println ("Digite a idade do nadador.");
		idade=leitor.nextInt();
		
		if(idade >=5 && idade<=10)
		
			System.out.println ("Categoria Infantil.");
		
		if(idade >= 11 && idade<=17)
			
			System.out.println ("Categoria Juvenil");
		
		if (idade >=18)
			
			System.out.println ("Categoria Adulto");
			
		
	}

}
