public class Condicional {
    public static void main(String[] args) {
        int yearOfRelease = 1900;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;
        String tipoPlano = "plus";

        if (yearOfRelease >= 2022 ){
            System.out.println("Lançamento que os clientes estão curtindo !");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true  && tipoPlano.equals("pluss")) {
            System.out.println("Filme Liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }



    }
}

