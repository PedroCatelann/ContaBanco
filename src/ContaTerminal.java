import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Numero:");
        Integer numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a Agencia:");
        String agencia = sc.nextLine();

        System.out.print("Digite o Nome do Cliente:");
        String nome = sc.nextLine();

        System.out.print("Digite o Saldo:");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome +
                        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}