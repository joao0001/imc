package br.com.etec;

import java.util.Scanner;

public class principal {
      public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      System.out.println("digite o seu peso");
      double peso= scanner.nextDouble();
      System.out.println("digite a sua altura");
      double altura = scanner.nextDouble();
      double imc;
      imc = peso / (altura*altura);
      System.out.println("o seu imc é " + imc);
    if(imc <= 19)
    System.out.println("Voce esta Magro");
    else if(imc < 25 )
        System.out.println("o seu peso esta normal");
    else if(imc <  30)
        System.out.println("Voce esta acima do peso");
    else if(imc < 34 )
        System.out.println("Voce esta obeso");
    else if(imc > 34)
        System.out.println("Voce esta muito obeso");
        
      
      }
      
      
      
}
