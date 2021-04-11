package inheritance;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int numberOfStars;
    private double price;

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

    //    .....................................Setters and getters................................
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfStars(int numberOfStars) {
        if(numberOfStars >=0 && numberOfStars <=5){
            this.numberOfStars = numberOfStars;
        }else{
            System.out.println("Number of starts should be between 0 and 5");
        }

    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void addReview(){
        int updated = this.getNumberOfStars()+1;
        this.setNumberOfStars(updated);
    }
    //    .....................................To String & other functions................................
    public String toString() {   // to string method
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", price=" + price +
                '}';
    }

}
