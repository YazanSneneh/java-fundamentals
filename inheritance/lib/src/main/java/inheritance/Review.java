package inheritance;

public class Review extends Restaurant{
    private String body;
    private String author;
    private int numberOfStars;


//    .....................................constructor................................
    public Review(String body,String  author,int reviewStars,String name,int stars,double price){
        super(name, stars , price);
         this.body = body;
         this.author = author;
         this.numberOfStars = reviewStars;
    }

    //    .............................Setters and getters................................
    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }


    //    .....................................To String Other functions................................
    public String toString() {

        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStars +'\'' +
                super.toString() + '\'' +
                '}';
    }
}