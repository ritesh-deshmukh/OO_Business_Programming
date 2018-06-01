// Name: Ritesh Deshmukh

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw1{
    public static void main(String args[])throws IOException {

        // For user input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Initializing variables to store and display the name and age of the first person
        String first_person_firstname;
        first_person_firstname = JOptionPane.showInputDialog("First Name:");
        String first_person_lastname;
        first_person_lastname = JOptionPane.showInputDialog("Last Name:");
        int first_person_age;
        first_person_age = Integer.parseInt(JOptionPane.showInputDialog("Age of "+ first_person_firstname +":"));

        // Initializing variables to store and display the name and age of the second person
        String second_person_firstname;
        second_person_firstname = JOptionPane.showInputDialog("First Name:");
        String second_person_lastname;
        second_person_lastname = JOptionPane.showInputDialog("Last Name:");
        int second_person_age;
        second_person_age = Integer.parseInt(JOptionPane.showInputDialog("Age of "+ second_person_firstname +":"));

        // Storing the names and ages for comparison to display the specified result
        String result1;
        result1 = "First Person: " + first_person_lastname +", " + first_person_firstname + " (" + first_person_age +")";
        String result2;
        result2 = "Second Person: " + second_person_lastname +", " + second_person_firstname + " (" + second_person_age +")";
        String result3 = null;
        if (first_person_age < second_person_age)
        {
            result3 = first_person_lastname +" is younger than "+ second_person_lastname;
        }
        else if(first_person_age == second_person_age)
        {
            result3 = first_person_lastname +" is of same age as "+ second_person_lastname;
        }
        else if (first_person_age > second_person_age)
        {
            result3 = first_person_lastname +" is older than "+ second_person_lastname;
        }

        // Displaying the required result in a window using JOptionPane
        JOptionPane.showMessageDialog(null, result1 +"\n"+ result2 +"\n"+ result3);

    }
}
