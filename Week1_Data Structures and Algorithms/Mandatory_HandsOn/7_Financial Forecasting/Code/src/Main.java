import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Main extends JFrame {
    private JTextField presentField, rateField, yearsField;
    private JTextArea resultArea;

    public Main() {
        setTitle("📈 Financial Forecasting Tool");
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel with vertical layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20)); // padding

        // Input Fields
        presentField = new JTextField();
        rateField = new JTextField();
        yearsField = new JTextField();

        mainPanel.add(new JLabel("💰 Present Value (e.g. 1000):"));
        mainPanel.add(presentField);
        mainPanel.add(Box.createVerticalStrut(10));

        mainPanel.add(new JLabel("📈 Annual Growth Rate (e.g. 0.05 for 5%):"));
        mainPanel.add(rateField);
        mainPanel.add(Box.createVerticalStrut(10));

        mainPanel.add(new JLabel("📅 Number of Years:"));
        mainPanel.add(yearsField);
        mainPanel.add(Box.createVerticalStrut(15));

        // Button
        JButton calculateButton = new JButton("🧮 Calculate");
        calculateButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(calculateButton);
        mainPanel.add(Box.createVerticalStrut(15));

        // Result area
        resultArea = new JTextArea(4, 30);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        mainPanel.add(scrollPane);

        // Button Action
        calculateButton.addActionListener(e -> calculateForecast());

        // Add panel to frame
        add(mainPanel);
    }

    private void calculateForecast() {
        try {
            double present = Double.parseDouble(presentField.getText());
            double rate = Double.parseDouble(rateField.getText());
            int years = Integer.parseInt(yearsField.getText());

            double recursive = FinancialForecast.futureValue(present, rate, years);
            double memoized = ForecastRecursive.futureValueMemoized(present, rate, years);

            DecimalFormat df = new DecimalFormat("#.##");
            resultArea.setText("📉 Recursive Result: ₹" + df.format(recursive) +
                    "\n💾 Memoized Result: ₹" + df.format(memoized));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
