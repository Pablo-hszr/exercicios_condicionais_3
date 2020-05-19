package exerciciocondicional3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.println ("Digite três numeros.");
		x= leitor.nextDouble();
		y= leitor.nextDouble();
		z= leitor.nextDouble();
		
		if (x ==y && x ==z)
		{
			System.out.println ("Triângulo Equilátero");
		}
		
		if (x ==y && x != z)
		{
			System.out.println ("Triângulo Isósceles");
		}
		if (x ==z && x != y)
		{	
		    System.out.println ("Triângulo Isósceles");
		}
		if (y ==z && y !=x)
		{
			System.out.println ("Triângulo Isósceles");
		}
        if (x !=y && x != z && y !=z)
        {
        	System.out.println ("Triângulo Escaleno");
        }
	}

}
