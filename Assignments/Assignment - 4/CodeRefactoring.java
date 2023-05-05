import Java.util.date;

public abstract class Rental {
    protected Date rentDate;
    protected Date dueDate;
    protected Double rentalFee;
    protected String title;

    public boolean isOverdue(){
        if (dueDate != null) {
            Date now = new Date();
            return dueDate.before(now);
        } else {
            return false;
        }
    } 
}

public class BookRental extends Rental{
    private String author;
}

public class MovieRental extends Rental{
    private int classification;
}

public class main (){
    public static void main (String [] args) {
        BookRental book_obj = new Bookrental()
        book_obj.isOverdue();
        MovieRental movie_obj = new Movierental()
        movie_obj.isOverdue(); 
    }
}