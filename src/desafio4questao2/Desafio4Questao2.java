package desafio4questao2;

import javax.swing.JOptionPane;

/**
 * @author Jeferson Leon
 */
public class Desafio4Questao2 {

    /*
    Escreva um algoritmo que leia um vetor inteiro de 30 posições e crie um
segundo vetor, substituindo os valores nulos por 1. Mostre os 2 vetores.
     */
    public static void main(String[] args) {
        int vet1[], vet2[]; //definição
        //criação do vetor - instancia de vetor
        vet1 = new int[30];
        vet2 = new int[30];
        int i; String v1 = "Vetor 1\n",v2 = "Vetor 2\n";

        for (i = 0; i < vet1.length; i++) {
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
        }

        for (i = 0; i < vet1.length; i++) {
            v1 += vet1[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, v1);
        
        
        for (i = 0; i < vet1.length; i++) {
            if (vet1[i] == 0) {
                vet2[i] = 1;
            } else {
            vet2[i] = vet1[i];
            }
             v2 += vet2[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, v2);
    }

}
