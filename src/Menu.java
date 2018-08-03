package exercises.Retake.restaurant;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static int selectionV;
    private static Scanner inV;

    public String run = "true";
    String myNameVV, myDescriptionVV, myCategoryVV;
    private double myPriceVV;
    private LocalDate myDateVV;

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
        SimpleDateFormat formatterV = new SimpleDateFormat("yyyy-MM-dd");
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
                        System.out.println(i + ". Item: " + menuItem.get(i).getNameVV() + " **Price: " + menuItem.get(i).getPriceVV() + " **Categoty: " +
                                menuItem.get(i).getCategoryVV() + " **Last Modified: " + menuItem.get(i).getDateVV() + "\n Description: " + menuItem.get(i).getDescriptionVV());
                    }
                }
            }


            if (selectionV == 3) { ///////////////////////////add item
                System.out.println("***Add New Item***\nName of item/entree");
                String nameAdd;
                String categotyAdd = "";
                String descriptionAdd;
                int categotySelectionNum;
                double pticeAdd;
                inV = new Scanner(System.in);
                nameAdd = inV.nextLine();
                System.out.println("Item Description");
                inV = new Scanner(System.in);
                descriptionAdd = inV.nextLine();
                do {
                    System.out.println("Select Category: \n1. Appatizer\n2. Entree\n3. Desert\n4. A La Carte\n5. Non-Alcoholic Drink\n6. Alcohol");
                    inV = new Scanner(System.in);
                    Scanner scan = new Scanner(System.in);///These 4 lines reject input that isnt an int
                    while(!scan.hasNextInt()) {   ///These 3 lines reject input that isnt an int
                        scan.next();                    }
                    categotySelectionNum = scan.nextInt();
                    if (categotySelectionNum > 0 && categotySelectionNum < 7) {
                        if (categotySelectionNum == 1) {
                            categotyAdd = "Appatizer"; }
                        if (categotySelectionNum == 2) {
                            categotyAdd = "Entree"; }
                        if (categotySelectionNum == 3) {
                            categotyAdd = "Desert"; }
                        if (categotySelectionNum == 4) {
                            categotyAdd = "A La Carte"; }
                        if (categotySelectionNum == 5) {
                            categotyAdd = "Non-Alcoholic Drink"; }
                        if (categotySelectionNum == 6) {
                            categotyAdd = "Alcohol"; }
                        if (categotySelectionNum > 6 || categotySelectionNum < 0) {
                            System.out.println("Invalid selection: Please choose from list"); }

                    }
                } while (categotySelectionNum > 6 || categotySelectionNum < 0);

                System.out.println("Price *Enter prices in 0.00 format");
                Scanner scanV = new Scanner(System.in);///These 3 lines reject input that isnt an Double
                while(!scanV.hasNextDouble()) {
                    scanV.next(); }
                pticeAdd = scanV.nextDouble();

                LocalDate dateVV = (java.time.LocalDate.now());
                menuItem.add( new Menu(nameAdd,pticeAdd,descriptionAdd, categotyAdd ,dateVV) );

            }
            if (selectionV == 4) {   /////////////////////////////Done
                System.exit(0);
            }                       ///////////////////////////// This is actually doneDone




        } while (inV !=null);
    }



}