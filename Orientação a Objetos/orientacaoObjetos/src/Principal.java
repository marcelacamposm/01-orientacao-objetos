public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O Poderoso Chefão"; //nome
        myMovie.yearOfRelease = 1990; //ano de lançamento
        myMovie.durationMinutes = 180; //duração em minutos

        myMovie.displayInfo();
        myMovie.addRating(8);
        myMovie.addRating(5);
        myMovie.addRating(10);
        System.out.println(myMovie.ratingSum);
        System.out.println(myMovie.ratingCount);
        System.out.println(myMovie.getAverageRating());
    }
}
