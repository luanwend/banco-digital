public class contacorrente extends conta {

    public contacorrente(cliente cliente){
        super(cliente);
    }
    public void imprimirextrato(){
        System.out.println("=== extrato conta corrente ===");
        super.imprimir();
}



}
