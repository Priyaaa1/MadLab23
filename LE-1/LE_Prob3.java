public class Main {

  public static void main(String[] args) {
    int number;
    number=Integer.parseInt(args[0]);

    for(int i=1;i<=10;i++) {
      
      System.out.println(number+" x "+ i +" = " + number*i);
    }
  }
}
