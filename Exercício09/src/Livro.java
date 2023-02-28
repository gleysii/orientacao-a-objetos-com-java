
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor; 
    
    //métodos personalizados 
    
    /*public void detalhes(){
        System.out.print("Titulo:" + this.getTitulo());
        System.out.print("Autor:" + this.getAutor());
        System.out.print("Total de paginas: " + this.getTotalPaginas());
        System.out.print(" \nPagina Atual: " + this.getPaginaAtual());
        System.out.print(" \nLivro está aberto?: " + this.getAberto());
        System.out.println(" \nLeitor: " + this.getLeitor());
    }*/

    
    /*no lugar do método "detalhes" poderia ser utilizadoo método toString(), da seguinte forma:*/
    
    
    public String detalhes(){//renomeado 
        return "Livro{" + "Titulo:" + titulo + "Autor:" + autor + "\nTotal paginas: " + totalPaginas + 
                "\nPagina Atual: " + paginaAtual + "\nAberto: " + aberto + "\nLeitor:" 
                + leitor.getNome() + ", idade: " + leitor.getIdade() + ", sexo: " + leitor.getSexo() + '}';
    }
        
   
           
    //constructor 

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {//lógico:quando for instanciar os únicos atributos que não vai pedir é se o livro está aberto ou qual a página atual
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.paginaAtual = 0;
        this.aberto = false; 
    }
    
    
   
    //métodos especiais
    
    //getters & setters
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //métodos encapsulados
    @Override
    public void abrir() {
        this.aberto = true; 
    }

    @Override
    public void fechar() {
        this.aberto = false; 
    }

    @Override
    public void folhear(int paginaFolheada) {//avançar até uma página específica 
        if (paginaFolheada > totalPaginas) {
            System.out.println("Não é possivel folhear alem das páginas totais do livro");
        } else {
            this.paginaAtual = paginaFolheada; 
        }
       
    }

    @Override
    public void avancarPagina() {
        this.setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        this.setPaginaAtual(getPaginaAtual() - 1);
    }
    
    
    
    
}





