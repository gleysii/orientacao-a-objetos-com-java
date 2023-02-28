
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int paginaFolheada);//ao dar o parâmetro se lembrar de que precisa colocar o tipo de parâmetro
    public abstract void avancarPagina();
    public abstract void voltarPagina();
}
