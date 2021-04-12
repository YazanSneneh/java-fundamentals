package inheritance;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int numberOfStars;
    private double price;
    private ArrayList<Review> reviewList = new ArrayList<>() ;

    //    .....................................constructor................................
    Restaurant(String name, int stars, double price){   // constructor
        this.name = name;

        if(stars >=0 && stars <=5){
            this.numberOfStars = stars;
        }
        else{
            System.out.println("Number of starts should be between 0 and 5");
        }
        this.price = price;
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
