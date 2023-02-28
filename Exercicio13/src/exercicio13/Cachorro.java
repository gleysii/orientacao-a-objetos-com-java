package exercicio13;

public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if("Toma Comida".equals(frase)|| "Olá".equals(frase)){
            System.out.println(" Abanando e latindo ");
        }else{
            System.out.println(" Rosnando ");
        }
    }
    
    public void reagir(int hora, int minuto){
        if (hora < 12) {
            System.out.println(" Abanando ");
        } else if(hora >= 18) {
            System.out.println(" Ignorando ");
        }else{
            System.out.println(" Abanar e latir ");
        }
    }
     
    public void reagir(boolean dono){
        if (dono == true) {
            System.out.println(" Abanando ");
        } else {
            System.out.println(" Rosnando e latindo ");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade < 5 ) {
            if (peso < 10) {
                System.out.println(" Abanar ");
            } else {
                System.out.println(" Latir ");
            }
        } else {
            if (peso < 10) {
                System.out.println(" Rosnar ");
            } else {
                System.out.println("Ignorar");
            }
        }
        
    }
    
               
    /*public void reagir (int x, int y) - para ser sobrecarga não posso ter dois métodos com duas assinaturas iguais, ou seja, a mesma quantidade e os mesmos tipos*/
}
