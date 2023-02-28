public abstract class Animal {//classe abstrata que não poderá ser instanciada, apenas ser progenitora
    
    protected int peso;
    protected int idade;
    protected int membros;
    
    //métodos personalizados
    
    public void locomover(){
        
    }
    
    public void alimentarSe(){
        
    }
    
     public void emitirSom(){
        
    }
    
    //constructor
     
    public Animal(int peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    
    //getter & setter 

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
     
    
    
}
