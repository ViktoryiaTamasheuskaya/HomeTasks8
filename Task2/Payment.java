import java.util.ArrayList;
import java.util.Scanner;

public class Payment {


    ArrayList<Items> itemsList;
    Scanner sc;

    public Payment() {
        itemsList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

   public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public void addItems() {
        String answer = "yes";
        while(!answer.equals("no")){
            Items item = Payment.enterItem();
            itemsList.add(item);
            System.out.println("Add one more item? (yes or no)");
            answer = sc.nextLine();
        }
    }
    public static Items enterItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String itemName = sc.nextLine();
        System.out.println("How much does it cost?");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        double itemPrice = sc.nextDouble();
        System.out.println("How much " + itemName +" items do you want to buy?");
        int itemNum=sc.nextInt();
        double itemSum=itemPrice*itemNum;
        Items item = new Items(itemName, itemPrice, itemNum, itemSum);
        return item;
    }

    public void printCheck(){
        double sum=0;
        System.out.println("Your order includes: ");
        System.out.println ("-------------------------------------------------------");
        for (Items item: itemsList) {
            System.out.println(item.toString());
            System.out.println ("-------------------------------------------------------");
            sum=sum+item.getItemTotalSum();

        }
        System.out.println("Total sum of your order is: $" + sum);
    }



}
