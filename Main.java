import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int [2]; 


    System.out.println("Please enter the 2 values for the array");
    numbers[0] = sc.nextInt();
    numbers[1] = sc.nextInt();
    
    
    if(numbers[0] > numbers[1]){

      int temp = numbers[0];
      numbers[0] = numbers[1];
      numbers[1] = temp;
    }



    System.out.println("Your numbers in ascending order are "+ numbers[0] + " and " + numbers[1]);
  }
}
