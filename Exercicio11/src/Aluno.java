public class Aluno extends Pessoa {
    protected int Matricula;
    protected String curso;
    
    //método personalizado
    public void fazerMatricula(){
            System.out.println("Fazendo matrícula");
    }
 
    public void pagarMensalidade(){//se eu coloco um "void final" o método fica como um método final, então não posso depois dar um @override e os métodos ou as classes não podem ser substituídas 
            System.out.println("Mensalidade paga");
    }
    
    //constuctor 

    public Aluno(String curso, String no, int id, String se) {
        super(no, id, se);
        this.curso = curso; 
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    private void SetMatricula(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}



