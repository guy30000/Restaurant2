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
    public Calendar getDateVV() { return myDateVV; }

    public static void main(String[] args) {





        ArrayList<Menu> menuItem = new ArrayList<Menu>();
        Calendar dateV = Calendar.getInstance();
        menuItem.add( new Menu("Potato",3.25,"astinkin potato", "app",dateV) );
        menuItem.add( new Menu("Nachos",7.25,"Chips beaf, beens and cheese", "app",dateV) );
        menuItem.add( new Menu("burger",6.00,"Burger no cheese", "entry",dateV) );
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
//                inV = new Scanner(System.in);
//                selectionV = inV.nextInt();
            }
            if (selectionV == 1) {
                     for (int i = 0; i < menuItem.size(); i++) {
                        System.out.println(menuItem.get(i).getNameVV() + " - " + menuItem.get(i).getDescriptionVV() +
                        "   $" + menuItem.get(i).getPriceVV());
                }


            }
            if (selectionV == 2) {                     ///////////////////////////View  item////////////////
                System.out.println("Select iterm # to view more details\n");
                for (int i = 0; i < menuItem.size(); i++) {
                    System.out.println(i + ". " + menuItem.get(i).getNameVV());

                }
                inV = new Scanner(System.in);
                int menuItemSelection = inV.nextInt();
                for (int i = 0; i < menuItem.size(); i++) {
                    if (menuItemSelection == i) {
                        System.out.println(i + ". Item: " + menuItem.get(i).getNameVV() + " *Price: " + menuItem.get(i).getPriceVV() + " *Categoty: " +
                                menuItem.get(i).getCategoryVV() + "\n Description: " + menuItem.get(i).getDescriptionVV() + getDateVV);
                    }
                }
            }


            if (selectionV == 3) { ///////////////////////////add item
                System.out.println("***Add New Item***\nName of item/entre");
                String nameAdd, descriptionAdd, categotyAdd;
                double pticeAdd;
                inV = new Scanner(System.in);
                nameAdd = inV.nextLine();
                System.out.println("Item Description");
                inV = new Scanner(System.in);
                descriptionAdd = inV.nextLine();
                System.out.println("Category");
                inV = new Scanner(System.in);
                categotyAdd = inV.nextLine();
                System.out.println("Price *Enter prices in 0.00 format");
                inV = new Scanner(System.in);
                pticeAdd = inV.nextDouble();


                menuItem.add( new Menu(nameAdd,pticeAdd,descriptionAdd, categotyAdd,dateV) );

            }
            if (selectionV == 4) {   /////////////////////////////Done
                System.exit(0);
            }                       ///////////////////////////// This is actually doneDone




        } while (inV !=null);
    }
}