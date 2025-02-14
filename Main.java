    import java.util.Scanner;
    public class Main {
    
    
        public static void main (String[] args){
            /* 
            Scanner sc = new Scanner(System.in);
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

            Scanner sc = new Scanner(System.in);
            System.out.println("Sistemas de idade, digite quantos anos você tem: ");
            int idade = sc.nextInt();
            for(int i=0; i < idade; i++){
                System.out.println("Feliz Aniversário");
            }
            sc.close();
            
    }
}