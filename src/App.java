import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de JLabels e JTextFields");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        
        // Criando JLabels
        JLabel label1 = new JLabel("Label 1:");
        JLabel label2 = new JLabel("Label 2:");
        JLabel label3 = new JLabel("Label 3:");
        
        // Criando JTextFields
        JTextField textField1 = new JTextField(15); // 15 é o número de colunas do campo
        JTextField textField2 = new JTextField(15);
        JTextField textField3 = new JTextField(15);

        // Adicionando JLabels e JTextFields ao painel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}

