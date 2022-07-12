public class main {
    public static void main(String[] args) {

        cliente luan =new cliente();
        luan.setNome("luan");
        conta cc= new contacorrente(luan);
        conta poupanca= new contapoupança(luan);
        cc.depositar(100);
        cc.imprimir();
        poupanca.imprimir();
        
    }
}
