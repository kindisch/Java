import javax.swing.*; //Import um Jtable zu nutzen
public class U_2_5_13 {

    public static void main(String[] args) {
      Object [][] zeilenSumme = new Integer [10][10];
      String [] columnNames = new String [10]; 
      for(int i = 0;i<10;i++){ //for Schleife, die den ersten Multiplikator(i) hochzählt 
        for (int g = 0 ;g<10;g++){ //for Schleife, die den zweiten Multiplikator (g) hochzählt 
          zeilenSumme [i][g] = (i+1)*(g+1);
        }
        columnNames[i] = Integer.toString(i+1);
      }
      JTable table = new JTable(zeilenSumme, columnNames);
      JFrame frame = new JFrame("HelloWorldSwing");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(table);
      frame.pack();
      frame.setVisible(true);
    }
}


