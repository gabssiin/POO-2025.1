import java.util.Scanner;

public class  App {

    public static void main (String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println(" ");
        System.out.println("Seu Nome: " + nome); 
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.println(" ");
        System.out.println("Sua idade: " + idade );
        System.out.println("Digite sua Altura: ");
        double altura = ler.nextDouble();
        System.out.println(" ");
        System.out.println("Sua altura: " + altura );
        ler.close();
        System.out.println(" ");
        if (idade < 16){
            System.out.println(nome + " Não poderá votar.");
        }
        else if (idade<18 || idade > 64 ){
            System.out.println(nome + " Tem o voto facultativo");
        }
        else {
            System.out.println(nome + " tem o voto obrigatório");
        }

/* 
        String name = "Gabs";
        int age = 20;
        double height = 1.30;
        System.out.println("Nome: "+name+" Sua idade é: "+age+ " Sua altura é: "+ height);
        if (age < 16){
            System.out.println(name +" Não poderá votar");

        }
        else if (age < 18 || age > 64) {
            System.out.println(name + " Tem o Voto Facultativo");
        }
        else {
            System.out.println(name + " Tem o voto obrigatório");
        }
*/
    }

}







/* Se preciso rodar em um array de dois em dois pode se usar i += 2 */




/*  if (age < 17) {
    System.out.println(name + " É maior de idade.");    
}
else{
    System.out.println( name +" é menor de idade.");
}
 */