import java.util.Scanner;
import javax.swing.*;
public class DistanceFromAverage
{
   public static void main(String[] args)
   {
      double avg = 0;
      double input;
      double distance;
      double lastNum = 0;
      int count = 0;
      
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Please enter a number or 9999 to quit.\nProgram will average all entered numbers\nand display the distance from the\nlast entered number to the average.");
      input = inputDevice.nextDouble();
      while(input!=9999)
      {
         avg+=input;
         count++;
         System.out.println("Please enter a number or 9999 to quit.\nProgram will average all entered numbers\nand display the distance from the\nlast entered number to the average.");
         input = inputDevice.nextDouble();
         if(input!=9999)
         {
            lastNum = input;
         }
      }
      avg = avg / count;
      if(avg <= lastNum)
      {
         distance = lastNum - avg;
      }
      else
      {
         distance = avg - lastNum;
      }
      if(count == 0)
      {
         System.out.println("No numbers input.");
      }
      else
      {
         System.out.printf("The distance of the last entered number from the average is %f", distance);
      }
   }
   
   public static double checkDistanceFromAvg(double someNum)
   {
      double avg;
      
      avg = 0;
      return avg;
   }
}