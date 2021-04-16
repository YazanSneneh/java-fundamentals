package inheritance;

import java.util.ArrayList;

public class Theater  {
    String name;
    int numberOfStars;
    ArrayList<Review> reviewList = new ArrayList<>();
    ArrayList<String> movies = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movie){
          movies.add(movie);
    }
    public void removeMovie(String movie){

          if(movies.remove(movie));
    }
    public void addReview(ReviewMovie review){
        reviewList.add(review);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", reviewList=" + reviewList +
                ", movies=" + movies +
                '}';
    }

}
