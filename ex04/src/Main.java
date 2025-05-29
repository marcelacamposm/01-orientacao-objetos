import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
    Bem Vindo ao Menu!
    Para acessar cada atividade digite o número correspondente.
    1. Positivos e Negativos
    2. Maior e Menor
    3. Cálculo de Área
    4. Tabuada
    5. Par ou Ímpar
    6. Fatorial
    7. Sair
    """);




        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:

    //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
    } else {
            System.out.println("Número negativo");}

        break;

            case 2:

        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
        // iguais, diferentes, o primeiro é maior ou o segundo é maior.

        System.out.println("Agora, digite dois números inteiroos:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Os números são iguais");
        } else if (numero1 < numero2){
            System.out.println("O segundo número é maior");
        } else if (numero1 > numero2){
            System.out.println("O primeiro número é maior");
        }

        break;

            case 3:

        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo"
                // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

                System.out.println("Digite 1 para calcular área do quadrado ou 2 para calcular área do círculo:");
                int opcaoArea = scanner.nextInt();

                switch (opcaoArea){
                    case 1:
                        System.out.println("Digite o lado do quadrado:");
                        double ladoQuadrado = scanner.nextDouble();
                        double areaQuadrado = ladoQuadrado * ladoQuadrado;
                        System.out.println("A área do quadrado é: " + areaQuadrado);
                        break;
                    case 2:
                        System.out.println("Digite o raio do círculo:");
                        double raioCirculo = scanner.nextDouble();
                }





        }
    }
}