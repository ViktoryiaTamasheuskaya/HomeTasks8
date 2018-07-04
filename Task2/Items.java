import java.util.Scanner;

public class Items {


    private String itemName;
    private double itemPrice;
    private int itemNum;
    private double TotalSum;

    public Items(String itemName, double itemPrice, int itemNum, double itemTotalSum){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemNum=itemNum;
        this.TotalSum = itemTotalSum;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemNum(){
        return itemNum;
        }

    public double getItemTotalSum() {
        return TotalSum;
    }

    @Override
    public String toString() {
        return getItemName()+ "  (price: $" + getItemPrice() + ", num: " + getItemNum()+", sum for the item(s) is : $" + getItemTotalSum()+ ")";
    }


}
