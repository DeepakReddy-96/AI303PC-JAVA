import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }catch(ArithmeticException be){
            System.out.println(be);
        }catch(Exception e){
            System.out.println(e.getClass().getName());
        }
    }
}
