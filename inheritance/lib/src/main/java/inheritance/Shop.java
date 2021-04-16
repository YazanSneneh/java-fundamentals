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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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