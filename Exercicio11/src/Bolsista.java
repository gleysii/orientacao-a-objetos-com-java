public class Bolsista extends Aluno {
    
    private float bolsa;
    
    //métodos personalizados
    public void renovarBolsa(){
        System.out.println(" Renovando bolsa de " + this.nome);
    }
    
    @Override //sobreposição de método
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista, pagamento facilitado");
    }
    
    //constructor 

    public Bolsista(float bolsa, String curso, String no, int id, String se) {
        super(curso, no, id, se);
        this.bolsa = bolsa;
    }
    
    //getter and setter

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
   
}
