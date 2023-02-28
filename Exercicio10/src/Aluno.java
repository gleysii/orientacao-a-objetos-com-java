public class Aluno extends Pessoa{
    private boolean matricula;
    private String Curso; 
    
    
    //métodos personalizados
    public void cancelarMatricula(){
        if (this.matricula = false){
            System.out.println("Aluno não esta matriculado");
        }else {
            this.matricula = false;
            System.out.println("Matricula cancelada");
        }
    }
 
    //constructor
    
             
    //getter & setter 

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    
}
