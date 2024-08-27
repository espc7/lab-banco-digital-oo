import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		Cliente espc = new Cliente("Espc");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(espc);
		Banco b = new Banco();
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(cc);
		contas.add(poupanca);
		b.setContas(contas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println("Listando contas:");
		b.getContas().forEach(conta -> System.out.println(conta.getNumero()));

		System.out.println("Lista de Clientes:");
		b.getClientes().forEach(cliente -> System.out.println(cliente.getNome()));
	}

}
