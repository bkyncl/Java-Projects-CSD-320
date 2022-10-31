
package CSD_320;


import java.util.Scanner;

import javax.swing.*;


public class Practice {

    public static void main(String[] args) {

        int selection;


        selection = JOptionPane.showConfirmDialog(null, "Would you like to continue?");

        if(selection == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "You entered \"Yes\"");
        }

        if(selection == JOptionPane.NO_OPTION) {

            JOptionPane.showMessageDialog(null, "You answered \"No\"");
        }

        if(selection == JOptionPane.CANCEL_OPTION) {

            JOptionPane.showMessageDialog(null, "You answered \"Cancel\"");
        }

    
        selection = JOptionPane.showConfirmDialog(null, "Choose one", "Yes/No", JOptionPane.YES_NO_OPTION);

        if(selection == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "You answered \"Yes\"");
        }

        if(selection == JOptionPane.NO_OPTION) {

            JOptionPane.showMessageDialog(null, "You answered \"No\"");
        }

      
        
    }
}
