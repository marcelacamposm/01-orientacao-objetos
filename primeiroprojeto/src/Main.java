public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int yearOfRelease = 2022;
        System.out.println("Ano de lançamento: " + yearOfRelease);
        boolean incluidoNoPlano = true;

        //Média calculada entre 3 notas.
        double notaDoFilme = 8.5;

        double media = (9.8 + 6.3 + 8) /3;
        System.out.println("Média: " + media);
        String sinopse;
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """ + yearOfRelease;

        System.out.println(sinopse);

        // código omitido

        int classificacao = (int) (media/ 2);
        System.out.println(classificacao);

    }
}