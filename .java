import java.util.Scanner;
import java.util.Random;
public class Magic8{

  int integerStore;
  boolean confirmStart;

  public Magic8(){
  }

  public static void main(String[] args){
    Magic8 run = new Magic8();

    if (run.confirmStart() == true){
      run.randomizerSwitch();
    }
    
  }

  public boolean confirmStart(){
    Scanner requestConfirm = new Scanner(System.in);
    System.out.println("Think of a question");
    System.out.println("When you are ready to hear the answer press any key!");

    String shake = requestConfirm.nextLine();
    boolean shakeResult = Boolean.parseBoolean(shake);

    if (shakeResult = true){
      return true;
    }

    else{
      System.out.println("No input was recieved!");
      return false;
    }
  }

  public void randomizerSwitch(){
    int upperBound = 11;

    Random randomInteger = new Random();
    integerStore = randomInteger.nextInt(upperBound);

    switch (integerStore){

      case 1:
        System.out.println("Yes");
        break;

      case 2:
        System.out.println("No");
        break;

      case 3:
        System.out.println("Possibly");
        break;

      case 4:
        System.out.println("It is uncertain");
        break;

      case 5:
        System.out.println("Most definitly!");
        break;

      case 6:
        System.out.println("Your future is clouded");
        break;

      case 7:
        System.out.println("I wouldn't count on it");
        break;

      case 8:
        System.out.println("Ask again later");
        break;

      case 9:
        System.out.println("It is certain");
        break;

      case 10:
        System.out.println("Why would you leave your fate up to a computer?");
        break;

      default:
        System.out.println("System Error: I can not actually predict the future.");
    }
  }
}
