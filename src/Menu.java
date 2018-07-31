package exercises.Retake.restaurant;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Menu {
    public static int selectionV;
    private static Scanner inV;

    public String run = "true";
    String myNameVV, myDescriptionVV, myCategoryVV;
    private double myPriceVV;
    private Calendar myDateVV;

//menu item contains Price description, category and weather new

   public Menu( String nameVV, double priceVV, String descriptionVV, String categoryVV, Calendar dateVV)
   {
       myNameVV = nameVV;
       myPriceVV = priceVV;
       myDescriptionVV = descriptionVV;
       myCategoryVV = categoryVV;
       myDateVV = dateVV;
   }
    public String getNameVV() { return myNameVV; }
    public double getPriceVV() { return myPriceVV; }
    public String getDescriptionVV() { return myDescriptionVV; }
    public String getCategoryVV() { return myCategoryVV; }
    public Calendar DateVV() { return myDateVV; }

    public static void main(String[] args) {





        ArrayList<Menu> menuItem = new ArrayList<Menu>();
        Calendar dateV = Calendar.getInstance();
        menuItem.add( new Menu("Potato",3.25,"astinkin potato", "app",dateV) );
        menuItem.add( new Menu("Nachos",7.25,"Chips beaf, beens and cheese", "app",dateV) );
        ////test parts



        do {

            System.out.println("--Menu--\n");
            System.out.println("1. View Menu");
            System.out.println("2. View Item");
            System.out.println("3. Add item");
            System.out.println("4. Exit\n");
            inV = new Scanner(System.in);
            selectionV = inV.nextInt();

            if (selectionV < 1 || selectionV > 4) {
                System.out.println("*Invalid selection*\n");
                continue;
//                inV = new Scanner(System.in);
//                selectionV = inV.nextInt();
            }
            if (selectionV == 1) {
                System.out.println("one -" + selectionV);
            }
            if (selectionV == 2) {
                System.out.println("2 -" + selectionV);
            }
            if (selectionV == 3) {
                System.out.println("3 -" + selectionV);
            }
            if (selectionV == 4) {   //done
                System.exit(0);
            }




        } while (inV !=null);
    }
}