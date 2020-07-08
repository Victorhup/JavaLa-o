package javaArrays;
import java.util.*;
public class JavaDoWhile { 
	public static void main (String args[]) {
		Scanner  ler = new Scanner (System.in); 
		int num, soma=0; 
		
	
	do {
		
		System.out.println ("Entre com um número");
		num = ler.nextInt(); 
		soma = soma+num;
		} while (num!=0); 
	System.out.println ("Soma dos números: "+soma);
	}

}
