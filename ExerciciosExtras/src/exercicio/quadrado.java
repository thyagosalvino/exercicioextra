package exercicio;
import java.util.Scanner;
//class suma{
public class quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d,e,f,g,h,i,j,soma=0, quadrada, diferenca;
					
		Scanner entrada = new Scanner(System.in); //recebendo a entrada de valor
		System.out.printf("\nInforme dez números: ");
		System.out.printf("\n#1 Número: ");
		a = entrada.nextInt();
		System.out.printf("\n#2 Número: ");
		b = entrada.nextInt();
		System.out.printf("\n#3 Número: ");
		c = entrada.nextInt();
		System.out.printf("\n#4 Número: ");
		d = entrada.nextInt();
		System.out.printf("\n#5 Número: ");
		e = entrada.nextInt();
		System.out.printf("\n#6 Número: ");
		f = entrada.nextInt();
		System.out.printf("\n#7 Número: ");
		g = entrada.nextInt();
		System.out.printf("\n#8 Número: ");
		h = entrada.nextInt();
		System.out.printf("\n#9 Número: ");
		i = entrada.nextInt();
		System.out.printf("\n#10 Número: ");
		j = entrada.nextInt();
		
		soma = (a+b+c+d+e+f+g+h+i+j);
		quadrada = soma * soma;
		diferenca = quadrada - soma;
		
		System.out.printf("\nA soma dos seu números é: " + soma);
		System.out.printf("\nA soma ao quadrado é:  " + quadrada);
		System.out.printf("\nA A diferença entre a soma ao quadrado e a soma é :  " + diferenca);
		}
			
}
	
	
