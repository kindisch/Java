public class U_2_5_12 {
  public static void main(String args[]) {
    int x = 10;
    int b = 1;
    if (x==0){
      System.out.println("Number cant be Zero");
    }
    else {
      for (int i=1;i<=x;i++){
        b = b * i;
        System.out.println(b);
      }
    }
  }
}
