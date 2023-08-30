import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Atributos
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Iremos realizar seu cadastro! Por favor insira seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Insira o número de sua conta: ");
        numero = sc.nextInt();

        System.out.println("Insira a agência de sua conta: ");
        agencia = sc.next();

        System.out.println("Agora insira seu saldo: ");
        saldo = sc.nextDouble();

        //System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo));
    }
}