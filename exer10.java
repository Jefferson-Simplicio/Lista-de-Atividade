package exe10;

import javax.swing.*;

public class exer10 {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Digite um número");
        if (dia != null) {
            try {
                int diadasemana = Integer.parseInt(dia);
                if (diadasemana == 1)
                    dia = "Domingo";
                else if (diadasemana == 2)
                    dia = "Segunda-Feira";
                else if (diadasemana == 3)
                    dia = "Terça-Feira";
                else if (diadasemana == 4)
                    dia = "Quarta-Feira";
                else if (diadasemana == 5)
                    dia = "Quinta-Feira";
                else if (diadasemana == 6)
                    dia = "Sexta-Feira";
                else if (diadasemana == 7)
                    dia = "Sabádo";
                else
                    dia = "Desconheço";
                JOptionPane.showMessageDialog(null, dia);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Formato Inválido");
            }
        }
    }
}