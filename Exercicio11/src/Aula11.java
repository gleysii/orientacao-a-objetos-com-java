public class Aula11 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ads", "Joana", 23, "Feminino");
        Bolsista b1 = new Bolsista (50f, "Ads", "Marta", 18, "Feminino");
        a1.pagarMensalidade();
        a1.setNome("Claudio");
        a1.setMatricula(1111); 
        a1.setCurso("Informática");
        b1.pagarMensalidade(); 
    }
    
}
