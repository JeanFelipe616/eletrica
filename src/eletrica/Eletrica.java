package eletrica;

import javax.swing.JOptionPane;

public class Eletrica {

    public static void main(String[] args) {
       
      ClassEletrica dados = new ClassEletrica();
        
        dados.setLeituraAnterior(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura anterior: ")));
        dados.setLeituraAtual(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura atual: "))); 
        
   
        double difLeitura = dados.Diferenca(dados.getLeituraAnterior(),dados.getLeituraAtual());
        double taxas = dados.Calculo(difLeitura);
        dados.calculabandeira(difLeitura, taxas);
    }
    
    
}