/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args){

        // Restaurant test and toString method
        Restaurant ramoony = new Restaurant("ramoony",0,20.5);
        System.out.println(ramoony.getNumberOfStars());
        System.out.println(ramoony.toString());

        // Review test and toString method
        Review restaurant2 = new Review("This is such a cool resurant and great service", "Yazan",1, " review resturant", 3, 50.5 );
        System.out.println(restaurant2.toString());
        System.out.println("confirm that add review method work......");
        restaurant2.addReview();
        System.out.println(restaurant2.toString());




    }
}