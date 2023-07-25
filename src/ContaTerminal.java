import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int number = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Digite a agência da sua conta: ");
        String agency = keyboard.nextLine();

        System.out.print("Digite o seu nome: ");
        String name = keyboard.nextLine();

        System.out.print("Digite o seu saldo: ");
        double saldo = keyboard.nextDouble();

        System.out.println("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.".formatted(name, agency, number, saldo));

    }
}
