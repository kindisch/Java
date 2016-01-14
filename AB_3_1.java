/*Schreiben Sie ein Programm, dass ein Array mit den Zeugnisnoten in einem Fach für 10 Schüler erstellt. Das Array soll mit verschiedenen Noten initialisiert werden.
Anschliessend soll das Array an eine Methode übergeben werden, das die Durchschnittsnote, sowie die Maximal- und Minimalnote bestimmt und ausgibt.
Die Methode soll mit Arrays unterschiedlicher Länge arbeiten können.*/
import java.util.Arrays;

public class AB_3_1 {

    public static void main(String[] args) {
      int durchschnitt = 0;

      double noten [] = new double []{}; //die gewünschten Noten in die geschweiften Klammern, kommasepariert schreiben
      if (noten.length == 0) {  //Fehlermeldung, falls das Array leer ist
        System.out.println("Keine Noten vorhanden");
        return;
      }
      Arrays.sort(noten);
      for(int i = 0; i < noten.length; i++){
          durchschnitt += noten[i];
      }
      durchschnitt = durchschnitt / noten.length;
      System.out.println("Der Notendurchschnitt ist "+durchschnitt);
      System.out.println(noten[0]);
      System.out.println(noten[noten.length-1]);
    }
}
