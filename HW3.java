// Name: Ritesh Deshmukh

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW3 {

    public static double findCharge(int kwh) throws IOException {
        int t_charge = 0;
        if(kwh <= 300){
            t_charge = 9 * kwh / 100;
        }
        if(kwh > 300 && kwh <= 600){
            t_charge = 8 * kwh / 100;
        }
        if(kwh > 600 && kwh <= 1000){
            t_charge = 6 * kwh / 100;
        }
        if(kwh > 1000){
            t_charge = 5 * kwh / 100;
        }
        return t_charge;
    }

    public static void main(String args[])throws IOException{

        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int c_number = 0, kwh = 0;
        int counter = 0;
        int kwhsum = 0;
        double charge = 0;
        StringBuilder sb = new StringBuilder();

        c_number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a customer number or -999 to quit: "));

        sb.append("<html><table><tr><td>Customer No.</td><td>Usage in KWH.</td><td>Total Charges</td></tr>");
        sb.append("<hr style=\"border-top: dotted 1px;\" />");
        while(c_number != -999)
        {
                counter++;
                kwh = Integer.parseInt(JOptionPane.showInputDialog("Please enter the usage in KWH: "));
                sb.append("<tr>");
                sb.append("<td>").append(c_number).append("</td>").toString();
                sb.append("<td>").append(kwh).append("</td>").toString();
                sb.append("<td>").append(findCharge(kwh)).append("</td>").toString();
                sb.append("</tr><br/>");
                kwhsum = kwh + kwhsum;
                charge = findCharge(kwh) + charge;
            c_number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a customer number or -999 to quit: "));
        }
        sb.append("<tr><td colspan=\"3\"><hr style=\"border-top: dotted 1px;\" /><td></tr>");
        sb.append("<tr>");
        sb.append("<td>").append(counter).append("</td>").toString();
        sb.append("<td>").append(kwhsum).append("</td>").toString();
        sb.append("<td>").append(charge).append("</td>").toString();
        sb.append("</tr></table></html>");


        if(c_number == -999){

            JOptionPane.showMessageDialog(null,sb);

        }
    }
}
