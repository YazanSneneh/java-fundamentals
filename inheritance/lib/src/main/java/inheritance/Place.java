package inheritance;

public class Place {
    private String name ="Unkown";
    private int numberOfStars =0;

    public Place(String name, int stars) {
        this.name = name;
        this.name = name;

        if(stars >=0 && stars <=5){
            this.numberOfStars = stars;
        }
        else if(stars >5){
            this.numberOfStars = 5;
        }else if(stars <0 ){
            this.numberOfStars = 0;
        }


    }
}
