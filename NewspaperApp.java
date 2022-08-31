
import java.util.ArrayList;
import java.util.*;


public class NewspaperApp{ 

public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
addNewspaper();
   
}

public static void addNewspaper(){

System.out.println("Report");
	List<Newspaper> listOfNewspapers = new ArrayList<>(5);
    listOfNewspapers.add(new Newspaper("Soweto News R", 5000.00, "Martin Matini", "matini@gmail.com"));
    listOfNewspapers.add(new Newspaper("Gauteng Times R", 10000.00, "JF Kean", "kean@gmail.com"));
    listOfNewspapers.add(new Newspaper("Limpopo Times R", 7000.00, "Kenny Jenny", "jenny@gmail.com"));
    listOfNewspapers.add(new Newspaper("Cape Times R", 1000.00, "Oliver Josh", "josh@gmail.com"));
    listOfNewspapers.add(new Newspaper("Jozi Times R", 4000.00, "Peter Porter", "porter@gmail.com"));

    for (int i = 0; i < 5; i++ ) {
    	System.out.println(listOfNewspapers.toString());
    } 
    
    System.out.println("Thank You <3");
}


}
