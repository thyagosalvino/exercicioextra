package exercicio;
import java.util.Scanner;
//class suma{
public class quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d,e,f,g,h,i,j,soma=0, quadrada, diferenca;
					
		Scanner entrada = new Scanner(System.in); //recebendo a entrada de valor
		System.out.printf("\nInforme dez n�meros: ");
		System.out.printf("\n#1 N�mero: ");
		a = entrada.nextInt();
		System.out.printf("\n#2 N�mero: ");
		b = entrada.nextInt();
		System.out.printf("\n#3 N�mero: ");
		c = entrada.nextInt();
		System.out.printf("\n#4 N�mero: ");
		d = entrada.nextInt();
		System.out.printf("\n#5 N�mero: ");
		e = entrada.nextInt();
		System.out.printf("\n#6 N�mero: ");
		f = entrada.nextInt();
		System.out.printf("\n#7 N�mero: ");
		g = entrada.nextInt();
		System.out.printf("\n#8 N�mero: ");
		h = entrada.nextInt();
		System.out.printf("\n#9 N�mero: ");
		i = entrada.nextInt();
		System.out.printf("\n#10 N�mero: ");
		j = entrada.nextInt();
		
		soma = (a+b+c+d+e+f+g+h+i+j);
		quadrada = soma * soma;
		diferenca = quadrada - soma;
		
		System.out.printf("\nA soma dos seu n�meros �: " + soma);
		System.out.printf("\nA soma ao quadrado �:  " + quadrada);
		System.out.printf("\nA A diferen�a entre a soma ao quadrado e a soma � :  " + diferenca);
		}
			
}
	
	
