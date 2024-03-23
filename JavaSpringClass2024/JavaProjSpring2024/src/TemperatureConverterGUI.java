/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Program Name: Temperature Converter GUI
    Programmer: Sheridan McKisick
    Date: March 23, 2024
    Synposis: GUI application to convert temperatures between F and C
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TemperatureConverterGUI extends JFrame {
    private JTextField celsiusInput;
    private JTextField fahrenheitInput;
    public TemperatureConverterGUI() {
        setTitle("Temperature Converter");
        setSize(400, 350);
        setMinimumSize(new Dimension(350, 350));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        int FONT_SIZE = 16;
        Font boldFont = new Font("Sans-Serif", Font.BOLD, FONT_SIZE);
        Font largeFont = new Font("Sans-Serif", Font.PLAIN, FONT_SIZE + 4);

        JLabel celsiusLabel = new JLabel("Temperature in Celsius");
        celsiusLabel.setFont(boldFont);
        
        celsiusInput = new JTextField();
        celsiusInput.addKeyListener(new CelsiusKeyListener());
        celsiusInput.setFont(largeFont);
        
        JLabel celsiusAbbrv = new JLabel("°C");
        celsiusAbbrv.setFont(boldFont);
        
        JLabel fahrenheitLabel = new JLabel("<html><br />Temperature in Fahrenheit</html>");
        fahrenheitLabel.setFont(boldFont);
        
        JLabel fahrenheitAbbrv = new JLabel("°F");
        fahrenheitAbbrv.setFont(boldFont);
        
        fahrenheitInput = new JTextField();
        fahrenheitInput.addKeyListener(new FahrenheitKeyListener());
        fahrenheitInput.setFont(largeFont);
        
        JLabel numberFormatNote = new JLabel("Temperatures are accurate to one decimal point.");
        
        JButton resetButton = new JButton("Clear all changes");
        resetButton.setFont(boldFont);
        resetButton.addActionListener(new ResetButtonListener());
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = FONT_SIZE;
        add(celsiusLabel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = FONT_SIZE + 10;
        gbc.gridwidth = 4;
        add(celsiusInput, gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(celsiusAbbrv, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.ipady = FONT_SIZE;
        add(fahrenheitLabel, gbc);
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipady = FONT_SIZE + 10;
        add(fahrenheitInput, gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 4;
        gbc.gridy = 3;
        add(fahrenheitAbbrv, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(numberFormatNote, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 5;
        add(resetButton, gbc);
        setVisible(true);
    }
    private class CelsiusKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
        }
        public void keyPressed(KeyEvent e) {
        }
        public void keyReleased(KeyEvent e) {
            try {
                double celsius = Double.parseDouble(celsiusInput.getText());
                double fahrenheit = celsiusToFahrenheit(celsius);
                fahrenheitInput.setText(String.format("%.2f", fahrenheit)); 
            } catch (NumberFormatException ex) {
                fahrenheitInput.setText("");
            }
        }
    }
    private class FahrenheitKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
        }
        public void keyPressed(KeyEvent e) {
        }
        public void keyReleased(KeyEvent e) {
            try {
                double fahrenheit = Double.parseDouble(fahrenheitInput.getText());
                double celsius = fahrenheitToCelsius(fahrenheit);
                celsiusInput.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                celsiusInput.setText("");
            }
        }
    }
    private class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            celsiusInput.setText("");
            fahrenheitInput.setText("");
        }
    }
    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    private double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TemperatureConverterGUI());
    }
}
