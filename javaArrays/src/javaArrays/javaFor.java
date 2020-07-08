package javaArrays;
import java.util.*;
public class javaFor {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in); 
		 
		int numero, contpar=0, contimpar=0;
		
		
		
		for (int i = 1; i <= 10; i ++) 
		{
			System.out.println ("Digite um número: " + i + "°numero");
			numero = ler.nextInt();	
			if (numero %2==0) 
			{
				contpar++; 	
			}
			if (numero %2==1) 
			{
				contimpar++;
			}
		
			
	          
	
	}
		System.out.println ("Foram digitados "+contpar+ " de número pare(s)");
        System.out.println ("Foram digitados "+contimpar+ " de números impar(es)");
		}
	}
