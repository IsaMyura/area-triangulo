import java.util.Scanner;

//Declare as variaveis: base, altura e area
//Peça ao usuario para inserir a base e a altura desejada
//Leia as informaçoes dadas: base e altura
//Calcule a area: muliplicando a base e a altura e dividindo por dois
//Printe ao usuario a area do triangulo


 class CalculoTriangulo {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    	  Double base, altura, area;
		  
		    System.out.print("Insira a base do triangulo");
		    base = teclado.nextDouble();
			
			System.out.print("Insira a altura do triangulo");
		    altura = teclado.nextDouble();
			
			area = (base * altura) / 2;
    
    		System.out.printf("A area do seu triangulo eh de " + area + "cm"); 

    		System.exit(0);
		
	}

}
