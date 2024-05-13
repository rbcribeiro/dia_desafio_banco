package banco;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");
        Cliente amanda = new Cliente();
        amanda.setNome("Amanda");

        banco.adicionarCliente(venilton);
        banco.adicionarCliente(maria);
        banco.adicionarCliente(carlos);
        banco.adicionarCliente(amanda);


        Conta ccVenilton = new ContaCorrente(venilton);
        Conta poupancaVenilton = new ContaPoupanca(venilton);
        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);

        ccVenilton.depositar(1000);
        ccVenilton.sacar(500);
        ccVenilton.transferir(200, poupancaVenilton);

        ccMaria.depositar(1500);
        ccMaria.sacar(200);
        System.out.println("--------------------------------------");
        System.out.println("Extrato da Conta Corrente de Venilton:");
        ccVenilton.imprimirExtrato();
        System.out.println("--------------------------------------");
        System.out.println("Extrato da Conta Poupança de Venilton:");
        poupancaVenilton.imprimirExtrato();
        System.out.println("--------------------------------------");
        System.out.println("Extrato da Conta Corrente de Maria:");
        ccMaria.imprimirExtrato();
        System.out.println("--------------------------------------");
        System.out.println("Extrato da Conta Poupança de Maria:");
        poupancaMaria.imprimirExtrato();
        System.out.println("--------------------------------------");

        banco.exibirClientes();
    }
}
