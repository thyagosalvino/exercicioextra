package exercicio;
import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int lado1, lado2, lado3;
		    int opcao = 1;
		    System.out.println("Informe os lados do tri�ngulo para saber qual � o tipo de triangulo!\n");
		    
		    while (opcao == 1) {
		        Scanner s = new Scanner(System.in);

		        System.out.println("\nInforme o primeiro lado:");
		        lado1 = s.nextInt();
		        System.out.println("\nInforme o segundo lado:");
		        lado2 = s.nextInt();
		        System.out.println("\nInforme o terceiro lado:");
		        lado3 = s.nextInt();
		      
		        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
		            if (lado1 == lado2 && lado1 == lado3) {
		                System.out.println("Triangulo Equilatero");
		            } else if ((lado1 == lado2) || (lado1 == lado3)) {
		                System.out.println("Triangulo Isosceles");
		            } else
		                System.out.println("Tri�ngulo Escaleno");
		       } else {
		            System.out.println("N�o � um triangulo!");
		        }
		        System.out.println("\nDeseja continuar? 1 = sim, 2 = n�o");
		        opcao = s.nextInt();
		       
		    }
		    System.out.println("\nObrigado");
	}

}
