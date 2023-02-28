public class Exercício9 {
    
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l  = new Livro[3];
        
        p[0] = new Pessoa("Gleysi ", 23, "F "); 
        p[1] = new Pessoa("Sara ", 25, "F ");
        l[0] = new Livro("Joyland \n", "Stephen King \n", 240, p[1]);//quando no constructor o atributo é definido como 0 ou false, não precisa colocar no instanciamento 
        l[1] = new Livro("Mr. Mercedes \n", "Stephen King \n", 255, p[0]);
        l[2] = new Livro("Depois \n", "Stephen King \n", 280, p[0]);
        
            
        l[0].abrir();
        l[0].folhear(240);
        System.out.print(l[0].detalhes()); 
                
        
        
        
        
        
    }
    
}
