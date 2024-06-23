import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Base64GUI
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Base64");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
                Base64Encoder encoder = new Base64Encoder();

                String encodeButtondString = encoder.encodeString(originalString);

                outputField.setText(encodeButtondString);
            }
        });

        decodeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String originalString = inputField.getText();
                Base64Decoder decoder = new Base64Decoder();

                String decodeButtondString = decoder.decodeString(originalString);

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