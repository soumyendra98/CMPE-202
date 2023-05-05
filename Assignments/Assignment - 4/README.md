PROBLEM STATEMENT 

Consider the following 2 classes - BookRental and MovieRental.

a. Identify a code smell in the following Java code (2 points)

b. Explain how you will refactor the code to get rid of the code smell (4 points)

c. Write the re-factored code (14 points)

public class BookRental {
   private String bookTitle;
   private String author;
   private Date rentDate;
   private Date dueDate;
   private double rentalFee;
   public boolean isOverdue() {
       Date now = new Date();
       return dueDate.before(now); 
   }
}
public class MovieRental {
   private String movieTitle;
   private int classification;
   private Date rentDate;
   private Date dueDate;
   private double rentalFee;
   public boolean isOverdue() {
       Date now = new Date();
       return dueDate.before(now); 
   } 
}
Submit your solutions on Canvas


SOLUTION

Document Link -

Java File Link - 