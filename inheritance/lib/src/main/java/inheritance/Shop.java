package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    int numberOfStars;
    private ArrayList<Review> reviewList = new ArrayList<>();

    Shop( String name, String description, int numberOfStars){
        this.name = name;
        this.description = description;
        this.numberOfStars = numberOfStars;
    }

    public void addReview(Review review){
        if(!this.reviewList.contains(review)){
            if( this.numberOfStars >=5){
                this.numberOfStars =5;
            }else if(this.numberOfStars <0){
                this.numberOfStars = 0;
            }else {
                this.numberOfStars ++;
            }
        }
        this.reviewList.add(review);
    }
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", number of Stars=" + numberOfStars +
                '}';
    }
}