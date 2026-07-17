import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Shop shop = new Shop();

       
        shop.addProduct(new Mobile(201,"Samsung A55",450,50));
        shop.addProduct(new Mobile(202,"iPhone 15",1200,48));

        int choice;

        do{

            System.out.println("\n====== ELECTRONIC SHOP ======");
            System.out.println("1. Show Products");
            System.out.println("2. Buy Product");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice=input.nextInt();

            switch(choice){

                case 1:

                    shop.showProducts();
                    break;

                case 2:

                    System.out.print("Enter Product ID: ");
                    int id=input.nextInt();

                    shop.buyProduct(id);

                    break;

                case 3:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        }while(choice!=3);

        input.close();
    }
}