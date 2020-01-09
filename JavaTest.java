import java.util.Scanner; 

  public class JavaTest{
    public static void main(String[] args){
      System.out.println("This Test app has started!");

      boolean x=true;
      while (x){ 
        System.out.println("This is a test of OpenJDK.\nPlease print something for the app to echo.\nEntering \"qapp\" + Enter should cancel this app.");
        Scanner fun = new Scanner(System.in);
        String input = fun.nextLine();
        String quitString = "qapp";
        if (input.equals(quitString)) {
          x=false;
          System.out.println("Boolean is set to: " + x);
        }else if(input.equals(quitString +"\n")){
          x=false;
          System.out.println("Boolean is set to: " + x +  "+\"n\"");
        }else{
          System.out.println("You entered: "+input+"\n\n");
        }
      }
      System.out.println("Exiting test app"); 
    }
  }
