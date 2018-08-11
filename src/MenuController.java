import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {


    /////////////////////////////////////////Menu choice
        public static void viewMenu(ArrayList<exercises.Retake.restaurant.Menu> menuItem){
            for (int i = 0; i < menuItem.size(); i++) {
                System.out.println(menuItem.get(i).getNameVV() + " - " + menuItem.get(i).getDescriptionVV() +
                        "   $" + menuItem.get(i).getPriceVV());
            }
        }

    public static void viewItem(ArrayList<exercises.Retake.restaurant.Menu> menuItem) {
            System.out.println("Select item # to view more details\n");
            for (int i = 0; i < menuItem.size(); i++) {
                System.out.println(i + ". " + menuItem.get(i).getNameVV());

            }
            exercises.Retake.restaurant.Menu.inV = new Scanner(System.in);
            int menuItemSelection = exercises.Retake.restaurant.Menu.inV.nextInt();
            for (int i = 0; i < menuItem.size(); i++) {
                if (menuItemSelection == i) {
                    System.out.println(i + ". Item: " + menuItem.get(i).getNameVV() + " **Price: " + menuItem.get(i).getPriceVV() + " **Categoty: " +
                            menuItem.get(i).getCategoryVV() + " **Last Modified: " + menuItem.get(i).getDateVV() + "\n Description: " + menuItem.get(i).getDescriptionVV());
                }
            }
        }

    public static void addItem(ArrayList<exercises.Retake.restaurant.Menu> menuItem) {
            System.out.println("***Add New Item***\nName of item/entree");
            String nameAdd;
            String categotyAdd = "";
            String descriptionAdd;
            int categotySelectionNum;
            double pticeAdd;
            exercises.Retake.restaurant.Menu.inV = new Scanner(System.in);
            nameAdd = exercises.Retake.restaurant.Menu.inV.nextLine();
            System.out.println("Item Description");
            exercises.Retake.restaurant.Menu.inV = new Scanner(System.in);
            descriptionAdd = exercises.Retake.restaurant.Menu.inV.nextLine();
            do {
                System.out.println("Select Category: \n1. Appatizer\n2. Entree\n3. Desert\n4. A La Carte\n5. Non-Alcoholic Drink\n6. Alcohol");
                exercises.Retake.restaurant.Menu.inV = new Scanner(System.in);
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

            LocalDate dateVV = (LocalDate.now());
            menuItem.add( new exercises.Retake.restaurant.Menu(nameAdd,pticeAdd,descriptionAdd, categotyAdd ,dateVV) );

        }

    public static void exit() {   //Exet option
            System.exit(0);}   ///////////////////////////////////////// End Menu choice
}

