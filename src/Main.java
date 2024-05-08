import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie>movies=new ArrayList<>();
        System.out.println(movies.isEmpty());
        System.out.println(movies.size());

        movies.add(new Movie("Movie 1",2024,"Science",7));
        movies.add(new Movie("Movie 2",2023,"Fiction",5));
        movies.add(new Movie("Movie 3",2022,"Science",1));
        System.out.println(movies.size());

        for(Movie temp:movies){
            System.out.println(temp);
        }
        movies.remove(new Movie("Movie 2",2023,"Fiction",5));

        System.out.println();
        for (Movie temp:movies){
            System.out.println(temp);
        }
        movies.set(0,new Movie("Movie1",2010,"Fiction",5));
        System.out.println();
        for(Movie temp:movies){
            System.out.println(temp);
        }

        System.out.println();
        for (Movie temp:movies){
            temp.setRatings(temp.getRatings()+1);
            System.out.println(temp);
        }

    }
}