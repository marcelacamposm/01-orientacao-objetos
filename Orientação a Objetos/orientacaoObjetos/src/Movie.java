public class Movie {
    String name; //nome
    int yearOfRelease; //ano de lançamento
    boolean inThePlan; //booleano de incluído no plano
    double ratingSum; // soma de avaliação
    int ratingCount; //total de avaliações
    int durationMinutes; //duração em minutos

    void displayInfo() { //maneira de imprimir infos
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
    }

    void addRating(double rating) { //maneira de adicionar notas
        ratingSum += rating;
        ratingCount++;
    }

    double getAverageRating() { //maneira de calculara media de notas
        return ratingSum / ratingCount;
    }
}


