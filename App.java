import java.util.Scanner;

public class  App {

    public static void main (String[] args) throws Exception {
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
    }
}












/*  if (age < 17) {
    System.out.println(name + " É maior de idade.");    
}
else{
    System.out.println( name +" é menor de idade.");
}
 */