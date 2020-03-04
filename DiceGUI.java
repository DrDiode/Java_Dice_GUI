// GUI based version of the PickTwoCards application
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiceGUI extends JFrame implements ActionListener
{
    // Instance objects / variables for this class
    JLabel title = new JLabel("TWO DICE!");
    JLabel DieOneLabel = new JLabel("First Die Roll is: ");
    JLabel DieTwoLabel = new JLabel("Second Die Roll is: ");
    JLabel diceResult = new JLabel();

    JButton button = new JButton("Click to Roll!");

    // Constructor for the TwoDiceGUI class
    public DiceGUI()
    {
        // Use the JFrame constructor to sonstruct THIS object
        super("Two Dice GUI");
        setBounds(640, 480, 200, 240);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout manager for the GUI
        setLayout(new FlowLayout());
        setLayout(new GridLayout(10, 10));

        // Add the instance object to the frame
        add(title);
        add(DieOneLabel);
        add(DieTwoLabel);
        add(diceResult);
        add(button);
        
        // Add the listener method to the button
        button.addActionListener(this);
    }
    
    // ActionPerformed details what should happen whenthe button is clicked on
    @Override
    public void actionPerformed(ActionEvent e)
    {
        playGame();
    }

    // Method that handles the actual Two Dice
    public void playGame()
    {
		// objects 
		Die firstDie = new Die();
		Die secondDie = new Die();
		
		// variables and constants
		int value1 = firstDie.getValue();
		int value2 = secondDie.getValue();
		String msg;
		
		// calculation phase
		if(value1 == value2)
		{
			msg = "The dice are a match!";
		}
		else
		{
			if(value1 > value2)
			{
				msg = "First die roll is greater.";
			}
			else
			{
				msg = "Second die roll is greater.";
			}
		}
		
		// output phase
		DieOneLabel.setText("First die roll is: " + value1);
		DieTwoLabel.setText("Second die roll is: " + value2);
		diceResult.setText(msg);
    }
    
    // creates an object from the DiceGUI class
    public static void main(String[] args)
    {
        DiceGUI game1 = new DiceGUI();
        // Make the application visable
        game1.setVisible(true);
    }
}