import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        //Recebe um nome de usuario
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        //Recebe um numero positivo
        int n;
        System.out.println("Digite um numero positivo: ");
        n = sc.nextInt();

        //valida se o numero é positivo
        if(n < 0){
            System.out.println("Numero invalido, encerrando a operação!");
            return;
        }

        //Exibe o numero de forma decrescente (n ate 0)
        System.out.println("\n Contagem decrescente: ");
        int contador = n;

        while(contador > 0){
            System.out.println(contador);
            contador--;
        }

        //Varifica o tamanho do nome
        System.out.println("\n Exibe o nome: ");

        if(nome.length() > 8){
            // se o nome tiver mais que 8 letras, vai exibir algumas vezes
            for(int i = 1; i < n; i++){
                System.out.println(i + " - " + nome);
            }
        }else {
            //Se tiver menos que 8 letras vai exibir uma vez so
            System.out.println(nome);
        }
        sc.close();

    }
}