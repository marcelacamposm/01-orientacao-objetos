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

//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

            case 1:

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

        System.out.println("Digite dois números inteiros:");
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
                        double areaCirculo = (raioCirculo * raioCirculo) * 3.14;
                        System.out.println("A área do círculo é: " + areaCirculo);
                }

               //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
                case 4:

                    System.out.println("Digite o npumero:");
                    int numeroTabuada = scanner.nextInt();

                    for (int i = 1; i <= 10; i++) {
                         System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
                     }

                    //Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

                case 5:

                    System.out.println("Digite um número inteiro:");
                    int numeroP = scanner.nextInt();
                    if (numeroP % 2 == 0)
                        System.out.println("O número é par!");
                     else
                        System.out.println("O número é ímpar!");


                     //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

                case 6:

                    System.out.println("Digite um número:");

                    int numeroF = scanner.nextInt();

                    int fatorial = 1;
                    for (int i = 1; i <= numeroF; i++) {
                        fatorial *= i;
                    }

                    System.out.println("O fatorial de " + numeroF + " é " + fatorial);
                    break;



        }



    }
}