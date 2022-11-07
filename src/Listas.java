import java.util.*;

public class Listas {


    public static void main(String[] args) {

        List<Double> temps = new ArrayList<>();
        Scanner tp = new Scanner(System.in);
        List<String> meses =  Arrays.asList("Janeiro", "Fevereiro", "Março", "Maio", "Junho");

        for(int i = 0; i<6;i++){
            System.out.println("Mês "+(i+1)+"\n informe a temperatura: ");
            temps.add(tp.nextDouble());
        }

        Iterator<Double> iterator = temps.iterator();

        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }

        Double med = soma/temps.size();
        System.out.println("Média de temperatura semestral: "+med);




       for (int i=0; i<temps.size(); i++){

           Double next = temps.get(i);

           if(next>med) {
               System.out.println("Mês "+(i+1)+" - "+meses.get(i)+"" +
                       " "+next+"acima da temperatura média "+med);

           }


       }

    }
}
