import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Numero !");
        int numero = sc.nextInt();

        // utilizei essa linha para receber o \n enviado pelo numero
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Nome Cliente !");
        String nome = sc.nextLine();
        
        System.out.println("Por favor, digite o número da Saldo !");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
