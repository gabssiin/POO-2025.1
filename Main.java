import java.util.Scanner;

public class Main {
        
    public static double calculaIMC(double altura, double peso){
        return peso/(altura*altura);

    }
        public static void main (String[] args){
            
            Scanner sc = new Scanner(System.in);
            /* 
            String nome = sc.nextLine();
            System.out.println("Digite seu Nome: " + nome); 
            int idade = sc.nextInt();
            System.out.println("Digite sua idade: " + idade );
            double altura = sc.nextDouble();
            System.out.println("Digite sua altura: " + altura );
         
            System.out.println(" ");
            if (idade < 16){
                System.out.println(nome + " Não poderá votar.");
            }
            else if (idade<18 || idade > 64 ){
                System.out.println(nome + " Tem o voto facultativo");
            }
            else {
                System.out.println(nome + "tem o voto obrigatório");
            }
             */ 
/* 
            Scanner sc = new Scanner(System.in);
            System.out.println("Sistemas de idade, digite quantos anos você tem: ");
            int idade = sc.nextInt();
            for(int i=0; i < idade; i++){
                System.out.println("Feliz Aniversário");
            }
            sc.close();
 */ 

 
System.out.println("Sistema para IMC");
System.out.println("Digite seu peso: ");
double peso = sc.nextDouble();
System.out.println(" ");
System.out.println("Digite sua altura: ");
double altura = sc.nextDouble();
double resultado = calculaIMC(altura, peso);
System.out.println("Seu IMC é: "+ resultado);
sc.close();

    }
}