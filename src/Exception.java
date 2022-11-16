import javax.swing.*;

public class Exception {


    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");

        String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            int dividir = Integer.parseInt(a)/Integer.parseInt(b);

            JOptionPane.showMessageDialog(null, "Resultado "+dividir);
        }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Dados de entrada inválido "+e.getMessage());
        }finally {
            JOptionPane.showMessageDialog(null, "Execução Finalizada");
        }

    }
}
