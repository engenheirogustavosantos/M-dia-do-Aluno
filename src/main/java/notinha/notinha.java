package notinha;

import java.util.Scanner;


public class notinha {

  public static void main(String[] args) {
  //Primeira nota
  
  
  double primeira;
  Scanner nota1 = new Scanner(System.in);
  System.out.println("Digite aqui a Primeira Nota:");
   
  primeira = nota1.nextDouble();
  
  //Segunda nota
  
  Scanner nota2 = new Scanner(System.in);
  double segunda;
  
  System.out.println("Digite aqui a Segunda Nota:");
   
   segunda = nota2.nextDouble();
   
  double resultado = (primeira + segunda)/2;
  
  System.out.print("Sua média é: ");
  System.out.println(resultado);
  
  if(resultado < 7){
    System.out.println("Reprovado");
  }
  else{
    System.out.println("Aprovado");
  }
}
}