package inheritance;


public class ReviewMovie extends Review {
        String movie;
        public ReviewMovie(String body,String  author,int reviewStars, String movie){
        super(body, author, reviewStars);
        this.movie =movie;
    }

    @Override
    public String toString() {
        return "ReviewMovie{" +
                "movie='" + movie + '\'' +
                "body='" + this.getBody() + '\'' +
                ", author='" + this.getAuthor() + '\'' +
                ", numberOfStars=" + this.getNumberOfStars() +'\'' +
                '}';
    }
}
