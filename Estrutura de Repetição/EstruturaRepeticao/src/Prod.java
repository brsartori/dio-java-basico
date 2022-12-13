import java.util.Scanner;

public class Prod {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          double A = sc.nextDouble();
          double B = sc.nextDouble();
      System.out.format("MEDIA = %.5f%n",  (A * 3.5 + B * 7.5) / 11);
    }
  }