import java.util.Scanner;
public class greeter{
  public static void main(String[] args){
    System.out.println("What is your name? type your name and hit enter");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hello java " + name + "!");
  }  
}