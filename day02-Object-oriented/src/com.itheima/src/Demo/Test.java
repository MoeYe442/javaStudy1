package Demo;

public class Test {
    public static void main(String[] args){
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1,"《唐顿庄园》",2018,"安妮海瑟薇");
        movies[1] = new Movie(2,"《唐顿庄园》",2018,"安妮海瑟薇");
        movies[2] = new Movie(3,"《唐顿庄园》",2018,"安妮海瑟薇");
        movies[3] = new Movie(4,"《唐顿庄园》",2018,"安妮海瑟薇");
        movies[4] = new Movie(5,"《唐顿庄园》",2018,"安妮海瑟薇");
        movies[5] = new Movie(6,"《唐顿庄园》",2018,"安妮海瑟薇");


        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();

    }




}
