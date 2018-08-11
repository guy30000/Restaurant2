package exercises.Retake.restaurant;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    public static int selectionV;
    public static Scanner inV;

    public String run = "true";
    String myNameVV, myDescriptionVV, myCategoryVV;
    public double myPriceVV;
    public LocalDate myDateVV;


//menu item contains Price description, category and weather new

   public Menu(String nameVV, double priceVV, String descriptionVV, String categoryVV, LocalDate dateVV)
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
    public LocalDate getDateVV() { return myDateVV; }

    public static void main(String[] args) {

        ArrayList<Menu> menuItem = new ArrayList<Menu>();

        LocalDate dateV = (java.time.LocalDate.now());
        menuItem.add( new Menu("Potato",3.25,"astinkin potato", "app",dateV) );
        menuItem.add( new Menu("Nachos",7.25,"Chips beaf, beens and cheese", "app",dateV) );
        menuItem.add( new Menu("burger",6.00,"Burger no cheese", "entry",dateV) );
        menuItem.add( new Menu("Chicken Sangwich",6.00,"Chickin thing", "entry",dateV) );
        menuItem.add( new Menu("Taco",6.00,"BA frikin taco", "entry",dateV) );
        menuItem.add( new Menu("Bud",1.00,"Beer", "Alcohol",dateV) );
        ////test parts



        do {

            System.out.println("--Menu--\n");
            System.out.println("1. View Menu");
            System.out.println("2. View Item");
            System.out.println("3. Add item");
            System.out.println("4. Exit\n");
            inV = new Scanner(System.in);
            selectionV = inV.nextInt();

            if (selectionV < 1 || selectionV > 4) {         //////////////////////////
                System.out.println("*Invalid selection*\n");
                continue;
            }
            if (selectionV == 1) {
                MenuController.viewMenu(menuItem);
            }
            if (selectionV == 2) {
                MenuController.viewItem(menuItem);
            }

            if (selectionV == 3) {
                MenuController.addItem(menuItem);
            }
            if (selectionV == 4) {
                MenuController.exit();
             }




        } while (inV !=null);
    }


}