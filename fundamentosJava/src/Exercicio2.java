public class Exercicio2 {
    public static void main(String[] args) {

        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        double nota1 = 8.9;
        double nota2 = 10.4;

        double resultado = (nota1 + nota2) / 2;

        System.out.println("O resultado é: " + resultado);

        /*Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e
        imprima o resultado na tela. */

        double variavelDouble = 10.2;
        int variavelInt = (int) variavelDouble; /*Aqui, estamos forçando o programa a entender que queremos que a double
         seja mudada para int */

        System.out.println("A variável int é: " + variavelInt);

        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas
         variáveis e concatene-as em uma mensagem. */

        char letra = 'O';
        String palavra = "Java";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);

        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor
        total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem. */

        double precoProduto = 10.5;
        int quantidade = 3;

        resultado = precoProduto * quantidade;

        System.out.println("O resultado é : " + resultado);

        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que
         o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/

        double valorEmDolares = 10.5;
        double valorEmReais = valorEmDolares * 4.94;

        System.out.printf("O valor em reais é: %.2f", valorEmReais);

        /* Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando
        o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um
        valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
        aplique-o ao preço original e imprima o novo preço com desconto.*/

        double precoOriginal = 100.0;
        double percentualDesconto = 20;

        double valorDoDesconto = precoOriginal * percentualDesconto / 100;

        double novoPreco = precoOriginal - valorDoDesconto;

        System.out.println("Novo Preço= " + novoPreco);

    }
}

