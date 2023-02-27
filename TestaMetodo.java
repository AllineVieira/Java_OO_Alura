package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(1000);
		
		if(segundaConta.transfere(300, conta)) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou saldo");
		}
		System.out.println(segundaConta.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "Alline Vieira";
		System.out.println(conta.titular);
	}
}
