import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Nome de Usuario: ");
        String nameUser = teclado.next();

        System.out.println("Por favor, digite a senha da Conta !");
        int password = teclado.nextInt();

        String nameClient = "Cleidsan dos Santos Freire";
        String agencia = "068-8";
        int conta = 78781;

        double saldo = 500;

        if (nameUser == "dsan" || password == 01) {
            System.out.println();
            System.out.println("------------------------");
            System.out.println("Bem vindo ao Banco FicPro");
            System.out.println("Ola " + nameClient + ".\n" + "Seus dados a seguir: >> \n" +
                               "Agencia: " + agencia + " " +
                               "Conta:" + conta + ".\n" +
                               "Saldo disponivel: "+ saldo);
            System.out.println("Você deseja Depositar [Digite 1] ou Sacar [Digite 2].");
            int operacao = teclado.nextInt();

            if (operacao == 1) {
                System.out.println("Digite a quantidade de deposito desejado:");
                int qtddepos = teclado.nextInt();
                if (qtddepos > 0) {
                    saldo += qtddepos;
                    System.out.println("Deposito efetivado com sucesso saldo ja disponivel: " + qtddepos);
                }else {
                    System.out.println("Digite uma quantidade maior que 0");
                }

            }else if (operacao == 2) {
                System.out.println("Saldo disponivel: "+ saldo);
                System.out.println("Digite a quantidade de saque desejado:");
                int qtdsaque = teclado.nextInt();
                if (qtdsaque <= saldo) {
                    saldo -= qtdsaque;
                    System.out.println("Saque efetivado com sucesso!!. Saque realizado: " + qtdsaque);
                }else {
                    System.out.println("Saldo indisponivel");
                }
            }

        }else {
            System.out.println("Nome de Usuario ou Senha Incorreta!");
        }

        System.out.println("Saldo atual disponivel: " + saldo);
    }
}
