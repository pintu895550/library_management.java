//import java.util.Scanner;
//import java.util.ArrayList;
public class library {

    public static  class Library{
           String[] books;
           int no_of_books;
            Library(){
                this.books = new String[100];
                this.no_of_books = 0; 
            }
             
            public void addBooks(String book){
                this.books[no_of_books] = book;
                no_of_books++;
                System.out.println(book+ "has been added ");
            }

            void showAvailable(){
                System.out.println("THE AVAILABLE BOOKS ARE ");
                for (String book:  this.books){
                      if (book == null){
                        continue;
                      }
                      System.out.println("* " + book);
                }
            }

            void issueBook(String book){
               for (int i = 0;i<this.books.length;i++){
               if (this.books[i].equals(book)){
                System.out.println("The book has been issued  = " + book);
                    this.books[i] = null;
                    return ;
               }   
            }
           
            System.out.println("THis book does not exist ");
           
            }
        
        }
            public static void main(String[] args) {
        Library centLibrary = new Library();
        centLibrary.addBooks("think and grow rich ");
        centLibrary.addBooks("C++ ");
        centLibrary.addBooks("JAVA ");
        centLibrary.addBooks("MATH  ");
        centLibrary.addBooks("DBMS "); 
        centLibrary.addBooks("DCCN ");
        centLibrary.addBooks("MEFA ");
        centLibrary.showAvailable();   
        centLibrary.issueBook("MEFA"); 
        centLibrary.showAvailable(); 
    }
}
