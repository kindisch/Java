public class 2.5.13 {

    public static void main(String[] args) {
    int [][] zeilenSumme = new int [10][10];
    int [] columnNames = new int [10]; //typumwandlung int zu string notwendig?
      for(int i = 0;i<10;i++){ //for Schleife, die den ersten Multiplikator(i) hochzählt 
        for (int g = 0 ;g<10;g++){ //for Schleife, die den zweiten Multiplikator (g) hochzählt 
          zeilenSumme [i][g] = (i+1)*(g+1);
        }
      columnNames[i] = i+1;
      }
      JTable table = new JTable(zeilenSumme, columnNames);
    }
}
