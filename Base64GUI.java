import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Base64GUI
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Base64");
        frame.setSize(400, 200);
        frame.setDefaultCloseOption(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel); // Add panel to frame

        JLabel input = new JLabel("Input: ");
        JTextField inputField = new JTextField(20);

        JLabel output = new JLabel("Output: ");
        JTextField outputField = new JTextField(20);

        JButton encodeButton = new JButton("Encode");
        JButton decodeButton = new JButton("Decode");

        encodeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String originalString = inputField.getText();
                Base64encodeButtonr encodeButtonr = new Base64encodeButtonr();

                String encodeButtondString = encodeButtonr.encodeButtonString(encodeButtondString);

                outputField.setText(encodeButtondString);
            }
        });

        decodeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String originalString = inputField.getText();
                Base64encodeButtonr decodeButtonr = new Base64decodeButtonr();

                String decodeButtondString = decodeButtonr.decodeButtonString(decodeButtondString);

                outputField.setText(decodeButtondString);
            }
        });
        
        panel.add(input);
        panel.add(inputField);
        
        panel.add(output);
        panel.add(outputField);

        panel.add(encodeButton);
        panel.add(decodeButton);

        frame.setVisible(true);
    }
}