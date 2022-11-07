import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListaCrimes {


    public static void main(String[] args) {

        List<String> perguntas = Arrays.asList("1 - Telefonou para vítima?", "2 - Esteve no Local do Crime",
                "3 - Mora perto da vítima?", "4 - Devia para a vítima?", "5 - Já trabalhou com a vítima?");

        int rep= 0;
        Scanner sc= new Scanner(System.in);
        for(int i =0; i<perguntas.size();i++){
            System.out.println(" "+perguntas.get(i));
            System.out.println("Digite para 1 - Sim e 2 - Não");
            int r = sc.nextInt();

            if(r==1){
                rep++;
            }

        }

        if(rep==2){
            System.out.println("Classificação - Suspeita");

        }else if(rep==3 || rep==4){
            System.out.println("Classificação - Cúmplice");

        }else if(rep==5){
            System.out.println("Classificação - Assassina");
        }



    }
}

