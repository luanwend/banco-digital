public abstract class conta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static final int agenciapadrao=1;
    private static int SEQUENCIAL=1;
    protected cliente cliente;

    /**
     * 
     */
    public conta(cliente cliente){
        this.agencia=conta.agenciapadrao;
        this.numero=SEQUENCIAL++;
        this.cliente=cliente;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }

    public void sacar( double valor){
        saldo-=valor;

    }
    public void depositar(double valor){
        saldo+=valor;
        
    }
    public void transferir(double valor, conta contadestino){
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    protected void imprimir(){
        System.out.println(String.format("titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %.2f", this.saldo));
    
    }

}
