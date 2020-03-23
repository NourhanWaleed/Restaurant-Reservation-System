import java.io.File;
import java.util.*;
public class Main {
    public static void main(String[] args){
       final Formatter x;
      try {
          x = new Formatter("input.txt");
          System.out.println("File created");
      }catch (Exception e){
          System.out.println("File couldnt be created");
      }
    }
}
