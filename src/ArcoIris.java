import java.util.*;

public class ArcoIris {


    public static void main(String[] args) {

        Set<String> arcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarela", "Verde"
                , "Azul", "Azul-Escuro", "Violeta"));

        System.out.println(arcoIris.toString());
        for(String cor:arcoIris){
            System.out.println(cor.toString());
        }


        System.out.println("Quantidade de cores "+arcoIris.size());
        Set<String> ordenado = new TreeSet<>();

        for (String cor :arcoIris) ordenado.add(cor.toString());
        for (String cor:ordenado)System.out.println(cor.toString());



        System.out.println(ordenado.toString());

        List<String> invertido = new ArrayList<>();
        for (String cor:ordenado)invertido.add(cor.toString());
        Collections.reverse(invertido);

        System.out.println(invertido.toString());

        invertido.clear();

        //recebendo lista novamente
        for (String cor:arcoIris)invertido.add(cor.toString());

        for (String cor: invertido) {

            if ( cor.contains("V"))
            {

                System.out.println(cor.toString());


            }else {
                arcoIris.remove(cor);

            }


        }

        System.out.println("Lista sem as cores sem V");
        System.out.println(arcoIris.toString());
        System.out.println("Lista limpa");
        arcoIris.clear();
        System.out.println(arcoIris.toString());


















    }

}



