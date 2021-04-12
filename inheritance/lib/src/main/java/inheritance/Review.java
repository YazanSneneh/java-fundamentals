package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStars;

//    .....................................constructor................................\
    public Review(){}
    public Review(String body,String  author,int reviewStars){
         this.body = body;
         this.author = author;
         this.numberOfStars = reviewStars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }


    public String toString() {

        return "" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", number Of Stars=" + numberOfStars +'\'' +
                '}';
    }
}