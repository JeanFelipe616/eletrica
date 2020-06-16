package eletrica;

import javax.swing.JOptionPane;

public class ClassEletrica {

    double leitura_anterior;
    double leitura_nova;
    double diferenca;
     
    public double getLeituraAnterior(){
        return leitura_anterior;
    }
    
    public void setLeituraAnterior(double leitura_anterior){
        this.leitura_anterior = leitura_anterior;
    }
    
    public double getLeituraAtual(){
        return leitura_nova;
    }
    
    public void setLeituraAtual(double leitura_nova){
        this.leitura_nova = leitura_nova;
    }
    
      
    public double Diferenca(double leitura_anterior, double leitura_nova){
        this.diferenca = leitura_nova - leitura_anterior;
    
    return diferenca;
    }
    
    public double Calculo(double diferenca){
 
        double taxa_tusd = diferenca * 0.30; 
        double taxa_te = diferenca * 0.29;  
        double taxaFinal = (taxa_tusd + taxa_te)*1.25;
        return taxaFinal;
    }
   
    public void calculabandeira(double diferenca,double taxaFinal){
        double total;
        
        if (diferenca<=100){
            total=taxaFinal; 
            
            JOptionPane.showMessageDialog(null,"Consumo: " + diferenca
            + "\nO valor sem bandeira é: R$" + taxaFinal
            + "\nO valor da sua conta é: R$" + total
            + "\nBandeira verde");
        }
        else if(diferenca>100 && diferenca<=150){
            total= ((diferenca*0.013)*1.25)+taxaFinal;
            
            JOptionPane.showMessageDialog(null,"Consumo: " + diferenca
            + "\nO valor sem bandeira é: R$" + taxaFinal
            + "\nO valor da sua conta é: R$" + total
            + "\nBandeira amarela");
        
        }
        else if (diferenca>150 && diferenca<=200){
            total= ((diferenca*0.042)*1.25)+taxaFinal;
            
            JOptionPane.showMessageDialog(null,"Consumo: " + diferenca
            + "\nO valor sem bandeira é: R$"+ taxaFinal +"\nO valor da sua conta é: R$"
            + total +"\nBandeira vermelha 1");
        
        }
        else {
            total= ((diferenca*0.062)*1.25)+taxaFinal;
            
            JOptionPane.showMessageDialog(null,"Consumo: " + diferenca
            + "\nO valor sem bandeira é: R$" + taxaFinal + "\nO valor da sua conta é: R$" 
            + total + "\nBandeira vermelha 2");
        
        }
   
      }

   

  
    
    
    
}
