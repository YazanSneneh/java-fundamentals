package inheritance;

import java.util.ArrayList;

public class Theater {
    String name;
    int numberOfStars;
    ArrayList<Review> reviewList = new ArrayList<>();
    ArrayList<String> movies = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movie){
        System.out.println("added "+ movie);
          movies.add(movie);
    }
    public void removeMovie(String movie){
        System.out.println("removed :" + movie);
          if(movies.remove(movie));
    }
    public void addReview(ReviewMovie review){
        reviewList.add(review);
    }

    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", reviewList=" + reviewList +
                ", movies=" + movies +
                '}';
    }

}
