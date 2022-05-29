package Basic.GUI_p_1;

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
        String name =  JOptionPane.showInputDialog("Enter your Name: ");
        String father =  JOptionPane.showInputDialog("Enter your Father: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        
        JOptionPane.showMessageDialog(null, "Your name is: "+name);//printing the name or father name.
        JOptionPane.showMessageDialog(null, "Your father name is: "+father);
        JOptionPane.showMessageDialog(null, "Your age is: "+age);        
    }
}
