// Name: Ritesh Deshmukh

import javax.swing.*;

public class Hw4
{
    public static void main( String[] args )
    {
        Rectangle r; // object variable
        int length = 0, width = 0, perimeter = 0, area = 0;
        int menuoption = 0;

        r = new Rectangle(length, width, perimeter, area);


        menuoption = Integer.parseInt(JOptionPane.showInputDialog(null , "Menu Options \n1 - Set the Length \n" +
                "2 - Set the Width \n" +
                "3 - Get the Length \n" +
                "4 - Get the Width \n" +
                "5 - Get the Perimeter \n" +
                "6 - Get the Area \n" +
                "7 - to print the object as string \n" +
                "0 - to quit "));

        while (menuoption != 0){

            switch (menuoption){
                case 0 :
                    break;
                case 1 :
                    // System.out.println("test");
                    length = Integer.parseInt(JOptionPane.showInputDialog( "Please enter the length of the rectangle" ));
                    r.setLength(length);
                    break;
                case 2 :
                    width = Integer.parseInt(JOptionPane.showInputDialog( "Please enter the width of the rectangle" ));
                    r.setWidth(width);
                    break;
                case 3 :
                    JOptionPane.showMessageDialog(null,"Length = " + r.getLength());
                    break;
                case 4 :
                    JOptionPane.showMessageDialog(null,"Width = " + r.getWidth());
                    break;
                case 5 :
                    r.setPerimeter(perimeter);
                    JOptionPane.showMessageDialog(null,"Perimeter = " + r.getPerimeter());
                    break;
                case 6 :
                    r.setArea(area);
                    JOptionPane.showMessageDialog(null,"Area = " + r.getArea());
                    break;
                case 7 :
                    JOptionPane.showMessageDialog(null,r);
            }
            menuoption = Integer.parseInt(JOptionPane.showInputDialog(null , "Menu Options \n1 - Set the Length \n" +
                    "2 - Set the Width \n" +
                    "3 - Get the Length \n" +
                    "4 - Get the Width \n" +
                    "5 - Get the Perimeter \n" +
                    "6 - Get the Area \n" +
                    "7 - to print the object as string \n" +
                    "0 - to quit "));
        }

    }
}
        