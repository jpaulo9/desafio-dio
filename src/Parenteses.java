import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Parenteses {


        public static void main(String[] args) {

            Scanner scanner= new Scanner(System.in);

            boolean caracter = ehValido(scanner.nextLine());

            System.out.println(caracter);
        }

        public static boolean ehValido(String s) {

            Map<Character,Character> caracteres = new HashMap<Character,Character>();
            caracteres.put(')', new Character('('));
            caracteres.put(']', new Character('['));
            caracteres.put('}', new Character('{'));

            Stack<Character> open = new Stack<>();



            for(int c =0 ; c<s.length(); c++){
                Character paran = s.charAt(c);

                if (caracteres.containsKey(paran)){// fechamento
                    if((open.isEmpty()) ||  open.peek() != caracteres.get(paran).charValue()){

                        return false;

                    }
                    open.pop();

                }else {
                    open.push(paran);
                }



            }
            return open.isEmpty();



            //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        }






}
