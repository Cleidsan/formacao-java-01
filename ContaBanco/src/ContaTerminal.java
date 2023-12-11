import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // System.out.println("Por favor, digite o número da Agência !");
        // String numero = args [0];//teclado.nextInt();

        // System.out.println("Por favor, digite seu Nome");
        // String nomeCliente = args [1]; //teclado.next();

        // System.out.println("Por favor, digite seu Sobrenome");
        // String agencia = args [2];//"067-8";

        // String saldo = args [3];//0;
    
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = teclado.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = teclado.next();

        System.out.println("Por favor, digite seu Nome");
        String nomeCliente = teclado.next();

        System.out.println("Por favor, digite seu Saldo");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque");
    }
}
