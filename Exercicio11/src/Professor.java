public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    //método personalizado
    public void receberAumento(float aumento){
        this.setSalario(this.getSalario() + aumento); 
    }
    
    //constructor
    public Professor(String especialidade, float salario, String no, int id, String se) {
        super(no, id, se);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
