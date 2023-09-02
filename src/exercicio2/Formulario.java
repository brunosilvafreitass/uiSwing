package exercicio2;

import javax.swing.*;

public class Formulario {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLocation(700, 300);
        frame.setSize(390, 400);
        frame.setTitle("FmrPrincipal");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();

        JLabel nome = new JLabel();
        JLabel rsocial = new JLabel();
        JLabel doc = new JLabel();
        JLabel pessoa = new JLabel();

        nome.setText("Nome:               ");
        rsocial.setText("Razão Social:  ");
        doc.setText("Documento:     ");
        pessoa.setText("Pessoa:     ");

        JTextField txtnome = new JTextField();
        JTextField txtrsocial = new JTextField();
        JTextField txtdoc = new JTextField();

        txtnome.setColumns(20);
        txtrsocial.setColumns(20);
        txtdoc.setColumns(20);

        JComboBox<String> combo = new JComboBox<String>();
        combo.addItem("Física");
        combo.addItem("Jurídica");

        panel.add(nome);
        panel.add(txtnome);
        panel.add(rsocial);
        panel.add(txtrsocial);
        panel.add(doc);
        panel.add(txtdoc);
        panel.add(pessoa);
        panel.add(combo);
        frame.add(panel);

    }

}
