public class Professor extends Pessoa {
    private String especialidade;
    private double salario; 
    
    //metodos personalizados
    public void receberAumento(float aumento){
        this.salario = this.salario + aumento; 
    }
    
    //constructor
    
    //getter & setter

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
