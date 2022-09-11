import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println("Nome: ");
        conta1.nome = leia.nextLine();
        System.out.println("Saldo: ");
        conta1.saldo = leia.nextFloat();
        System.out.println("Limite: ");
        conta1.limite = leia.nextFloat();
        System.out.println("Tipo: ");
        conta1.tipo = leia.next().charAt(0);
        
        conta1.cadastraDados();
        System.out.println("Digite o valor a ser depositado: ");
        float valorDeposito = leia.nextFloat();
        conta1.depositar(valorDeposito);
        System.out.println("Digite o valor a ser sacado: ");
        float valorSaque = leia.nextFloat();
        conta1.sacar(valorSaque);
        System.out.println(conta1.imprimeDados());
        
        System.out.println("Nome: ");
        String nome = leia.nextLine();
        System.out.println("Saldo: ");
        float saldo = leia.nextFloat();
        System.out.println("Limite: ");
        float limite = leia.nextFloat();
        System.out.println("Tipo: ");
        char tipo = leia.next().charAt(0);
        ContaCorrente conta2 = new ContaCorrente(nome, saldo, limite, tipo);
        
        conta2.cadastraDados();
        System.out.println("Digite o valor a ser depositado: ");
        valorDeposito = leia.nextFloat();
        conta2.depositar(valorDeposito);
        System.out.println("Digite o valor a ser sacado: ");
        valorSaque = leia.nextFloat();
        conta2.sacar(valorSaque);
        System.out.println(conta2.imprimeDados());

        System.out.println("Nome: ");
        nome = leia.nextLine();
        System.out.println("Saldo: ");
        saldo = leia.nextFloat();
        System.out.println("Tipo: ");
        tipo = leia.next().charAt(0);
        ContaCorrente conta3 = new ContaCorrente(nome, saldo, tipo);
        
        conta3.cadastraDados();
        System.out.println("Digite o valor a ser depositado: ");
        valorDeposito = leia.nextFloat();
        conta3.depositar(valorDeposito);
        System.out.println("Digite o valor a ser sacado: ");
        valorSaque = leia.nextFloat();
        conta3.sacar(valorSaque);
        System.out.println(conta3.imprimeDados());

        leia.close();
    }

}
