package exerciciocondicional3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.println ("Digite tr�s numeros.");
		x= leitor.nextDouble();
		y= leitor.nextDouble();
		z= leitor.nextDouble();
		
		if (x ==y && x ==z)
		{
			System.out.println ("Tri�ngulo Equil�tero");
		}
		
		if (x ==y && x != z)
		{
			System.out.println ("Tri�ngulo Is�sceles");
		}
		if (x ==z && x != y)
		{	
		    System.out.println ("Tri�ngulo Is�sceles");
		}
		if (y ==z && y !=x)
		{
			System.out.println ("Tri�ngulo Is�sceles");
		}
        if (x !=y && x != z && y !=z)
        {
        	System.out.println ("Tri�ngulo Escaleno");
        }
	}

}
