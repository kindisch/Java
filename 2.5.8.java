public class kleinsterWert {

    public static void main(String[] args) {
      int x = 15;
      int potenz = 0;
        for (int n = 1;potenz <= x; n++){
          potenz = (int) Math.pow(2, n);
          System.out.println(n);
        }

    }

}
