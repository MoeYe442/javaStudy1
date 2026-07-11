package Demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies){
        this.movies = movies;

    }
    public void printAllMovies(){
        for(int i =0; i<movies.length; i++){
            Movie m = movies[i];
            System.out.println(m.getId()+"  "+m.getName()+" "+m.getPrice()+"    "+m.getActor());
        }
    }
    public void searchMovieById(){
        System.out.println("请输入要查询的电影id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for(int i =0; i<movies.length; i++){
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println(m.getId()+"  "+m.getName()+" "+m.getPrice()+"    "+m.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
