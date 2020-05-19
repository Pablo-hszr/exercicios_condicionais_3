package exerciciocondicional3;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int matricula;
		double w, x, y, z, conta;
		
		System.out.println ("Digite sua matrícula.");
		matricula= leitor.nextInt();
		
		System.out.println ("Digite suas notas de física.");
		w= leitor.nextDouble();
		x= leitor.nextDouble();
		y= leitor.nextDouble();
		z= leitor.nextDouble();
		
		conta = (w + x + y + z)/4;
		
		if (conta >=7)
		{
			System.out.println ("Aprovado.");
		}
		if (conta >= 3.5 && conta >=7) 
		{
			System.out.println ("Recuperação.");
		}
		if (conta <3.5)
		{
			System.out.println ("Reprovado.");
		}
	}

}
