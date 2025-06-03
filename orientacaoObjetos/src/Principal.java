public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O Poderoso Chefão";
        myMovie.yearOfRelease = 1990;
        myMovie.durationMinutes = 180;

        System.out.println(myMovie.name);
        System.out.println(myMovie.yearOfRelease);
    }
}
