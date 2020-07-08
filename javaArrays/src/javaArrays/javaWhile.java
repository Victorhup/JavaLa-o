package javaArrays;
import java.util.*;
public class javaWhile {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in); 
		int maior=0, menor=0, idade=0;
		
		
		while (idade !=-99) 
		{
			System.out.println("Entre com sua idade: "); 
			idade = ler.nextInt(); 
			if(idade>=50) 
			{
				maior++;
			} 
			if (idade<=21) 
			{
			   menor++;	
			}
		}
		System.out.println("O total de pessoas maiores de 50 anos são: "+maior); 
		System.out.println("O total de pessoas menores de 21 anos são: "+menor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
