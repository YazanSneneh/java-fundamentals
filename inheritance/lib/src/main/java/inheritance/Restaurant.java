package inheritance;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
//extends Place
public class Restaurant {
    private String name;
    private int numberOfStars;
    private double price;
    private ArrayList<Review> reviewList = new ArrayList<>();

    //    .....................................constructor................................
    Restaurant(String name, int stars, double price){   // constructor
        this.name = name;

        if(stars >=0 && stars <=5){
            this.numberOfStars = stars;
        }
        else if(stars >5){
            this.numberOfStars = 5;
        }else if(stars < 5){
            this.numberOfStars = 0;
        }
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    //    .....................................To String & other functions................................
    public String toString() {   // to string method
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", number Of Stars=" + numberOfStars +
                ", price=" + price +'\'' +
                reviewList +
                '}';
    }
}
