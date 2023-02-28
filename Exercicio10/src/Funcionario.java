public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando; 
    
    //métodos personalizados    
    public void mudarTrablho(){
        this.trabalhando = ! this.trabalhando; //inverte 
    }
    
    //getters & setters  
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
    
}
