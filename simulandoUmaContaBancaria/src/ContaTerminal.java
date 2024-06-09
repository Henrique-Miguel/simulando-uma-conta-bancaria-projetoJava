import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o nome do cliente:");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeDoCliente);
        System.out.println("Saldo: " + saldo);
    }
}
