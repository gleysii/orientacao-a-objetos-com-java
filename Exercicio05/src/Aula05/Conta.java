
package Aula05;
public class Conta {
    //Atributos 
    private float saldo;
    private String dono;
    public int numCon; 
    protected String tipo;
    private boolean status; 
    
    
    //metodos personalizados
    
    
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumCon());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    public void abrirConta(String t){//Ao abrir a conta vai setar para cc ou cp, e, se for cp vai colocar 150 reais, cc 50 reais
      this.setTipo(t);
      this.status = true;
      System.out.print("Conta aberta com sucesso");
        if ("CC".equals(t)) { //esse equals é a mesma coisa que = 
            this.setSaldo(50); 
        } else if ("CP".equals(t)) {
            this.setSaldo(150); 
        }
    }
    
    public void fecharConta(){//Conta só fecha se o saldo for = 0; 
 
        if (this.getSaldo() != 0) {
            if (this.getSaldo() > 0) {
                 System.out.print("Conta não pode fechada porque ainda há dinheiro");
            } else if (this.getSaldo() < 0){
                System.out.print("Conta não pode fechada pois há débito");
            }
        } else {
            this.setStatus(false);
            System.out.print("Conta fechada");
        }
    }
    
    public void depositar(float v){//para depositar dinheiro na conta é primeiramente necessário verificar se ela está aberta, se sim, saldo recebe saldo valor,se não, dá um erro
        if(this.getStatus()){//verificação de conta aberta
            this.setSaldo(this.getSaldo() + v);
            System.out.print("Depósito realizado na conta de" + this.getDono());
        }else{
            System.out.print("Conta inativa");
        }
    }
    
    public void sacar(float v){//para depositar dinheiro na conta é primeiramente necessário verificar se ela está aberta e se tem dinheiro, se sim, saldo recebe saldo valor
        if(this.getStatus()){//verificação de conta aberta
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.printf("Saque realizado na conta de" + this.getDono());
            }else{
                System.out.printf("Valor indisponível");
            }
        }else{
              System.out.printf("Impossível sacar o valor de uma conta fechada");
        }
    }
    
    public void pagarMensalidade(int v){//se a mensalidade for de cp, o valor é 20reais, se for cc é 12  reais, verificar se a conta tem saldo e se está aberta 
        if("CC".equals(this.getTipo())){
            v = 12; 
        }else if("CP".equals(this.getTipo())){
            v = 20; 
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.printf("Mensalidade paga com sucesso por" + this.getDono());
        }else{
            System.out.printf("Impossível pagar mensalidade de uma conta inexistente");
        }
    }
    
    //métodos especiais 
    //constructor!!
    public Conta(){
        this.saldo=0;
        this.status=false;       
    }
    
     
    //setters e getters 
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumCon() {
        return numCon;
    }

    public void setNumCon(int numCon) {
        this.numCon = numCon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    
}
    
    
