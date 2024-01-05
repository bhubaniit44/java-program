import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the distance in kilometers");
        float km= sc.nextFloat();
        float miles=(float)(0.6213711922*km);
        System.out.println("Distance in miles will be:"+miles);
    }
}
