public class ggt{
  public static void main(String args[]) {
    int p = 45;
    int q = 60;
//Ermitteln der kleinsten Zahl
    if (p < q) {
      int x = p;
      p = q;
      q = x;
    }

    while (q != 0){ //sicherstellen, dass nicht durch null geteilt
      int r = p % q;
      p = q;
      q = r;
    }
    System.out.println(p);

  }
}
