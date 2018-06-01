// Name: Ritesh Deshmukh

import javax.swing.*;
import java.io.IOException;

public class Hw2 {
    public static void main(String args[])throws IOException
    {
        int year = 0;

        while (year != -99)
        {
            year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year or '-99' to exit"));
			
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year != -99)
            {
                JOptionPane.showMessageDialog(null,"Entered year is a leap year");
            }
            if (!(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year != -99)
            {
                JOptionPane.showMessageDialog(null,"Entered year is not a leap year, please try again");
            }
            else  if(year == -99){
                System.exit(0);
            }
        }
    }
}
