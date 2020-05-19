package exerciciocondicional3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double x;
		
		System.out.println ("Digite o seu salário.");
		x=leitor.nextDouble();
		
		if (x >=0 && x<=1000)
		{
			
			 System.out.println("15%");
		
        System.out.println(   ( x+ ( (x*15)/100 ) )   );
        
		}
        if (x >=1000.01 && x<=2500.00)
        {
        	 System.out.println("7%");
        
        System.out.println(   ( x+ ( (x*7)/100 ) )    );
        }
        if (x >=2500)
        {
        	System.out.println("Sem aumento");
        	
			
			
		
		
		

        }
	}

}
