import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a agencia do cliente: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o valor do deposito: ");
        double saldo = scanner.nextDouble();
        


        // passando as informacoes ao usuario

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");
        
        scanner.close();
        
     }
}
