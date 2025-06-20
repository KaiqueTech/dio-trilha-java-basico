import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ContaTerminal cliente = new ContaTerminal();

        System.out.println("Preencha os dados da sua conta: ");
        System.out.print("Nome: ");
        var nome = cliente.nomeCliente = input.nextLine();
        System.out.print("Agencia: ");
        var agencia = cliente.agencia = input.nextLine();
        System.out.print("Numero da conta: ");
        var numeroConta = cliente.number = input.nextInt();
        System.out.print("Saldo da conta: ");
        var saldoConta = cliente.saldo = input.nextDouble();

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo é de R$ " + saldoConta + " e ja esta disponivel para saque!");
    }
}
