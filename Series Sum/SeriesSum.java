import java.util.Scanner;

public class SeriesSum{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number of test cases: ");
      int t = sc.nextInt();
      
      for(int i=1;i<=t;i++){
         
         System.out.print("Case "+i+": Enter n"+i+": ");
         int n = sc.nextInt();
         
         StringBuilder s = new StringBuilder();
         for(int j=1;j<=n;j++){
            s.append(j);
            if(j<n) s.append("+");
         }
         
         int sum = n*(n+1)/2;
         
         System.out.println(s + " = " + sum);
      }
      
     sc.close();
   }
}
