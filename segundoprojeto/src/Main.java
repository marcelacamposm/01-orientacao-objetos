import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Marcela Mendes Campos";
        String tipoConta = "Corrente";
        double saldo = 1000;

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.printf("""
                    ************************************************************************
                    Bem Vindo ao Banco Cenourinha!
                    
                    Nome: %s
                    Tipo de Conta: %s
                    Saldo: %.2f
                    
                    Opções:
                    
                    1. Depósito
                    2. Saque
                    3. Sair
                    ************************************************************************
                    %n""", nome, tipoConta, saldo);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Quanto você deseja depositar?");
                    double novodeposito = scanner.nextDouble();
                    saldo += novodeposito;
                    System.out.println("Seu novo saldo é de " + saldo + "!");
                }
                case 2 -> {
                    System.out.println("Digite o quanto você deseja sacar:");
                    double novosaque = scanner.nextDouble();

                    if (novosaque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= novosaque;
                        System.out.println("Saque completo! Seu novo saldo é de " + saldo + "!");
                    }
                }
                case 3 -> System.out.println("Saindo do sistema... Até mais!");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 3);
    }
}
