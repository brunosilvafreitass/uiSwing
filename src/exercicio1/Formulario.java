package exercicio1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formulario {
    
    public static void main(String[] args) {

        JFrame FrmAzul= new JFrame();
        JFrame FrmAmarelo = new JFrame();
        JFrame FrmVermelho= new JFrame();
        JPanel panelazul = new JPanel();
        JPanel panelamarelo = new JPanel();                        
        JPanel panelvermelho = new JPanel();
        

        JFrame FrmPrincipal = new JFrame();
        JPanel panel = new JPanel();
        JButton azulButton = new JButton("Azul", null);
        JButton amareloButton = new JButton("Amarelo", null);
        JButton vermelhoButton = new JButton("Vermelho", null);
        JButton fecharButton = new JButton("Fechar", null);


        FrmPrincipal.setLocation(700, 300);
        FrmPrincipal.setSize(400, 400);
        FrmPrincipal.setTitle("FmrPrincipal");

        FrmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FrmPrincipal.setVisible(true);

        panel.add(azulButton);
        panel.add(amareloButton);
        panel.add(vermelhoButton);
        panel.add(fecharButton);
        FrmPrincipal.getContentPane().add(panel);

        azulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                FrmAzul.setVisible(true);
                FrmAzul.setTitle("FrmAazul");
                FrmAzul.setLocation(1100, 300);
                FrmAzul.setSize(400, 400);
                panelazul.setBackground(Color.blue);
                FrmAzul.getContentPane().add(panelazul);  
            }
        });

        amareloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAmarelo.setVisible(true);                
                FrmAmarelo.setTitle("FrmAmarelo");
                FrmAmarelo.setLocation(1100, 300);
                FrmAmarelo.setSize(400, 400);
                panelamarelo.setBackground(Color.yellow);
                FrmAmarelo.getContentPane().add(panelamarelo);       
            }
        });

        vermelhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                FrmVermelho.setVisible(true);
                FrmVermelho.setTitle("FrmAmarelo");
                FrmVermelho.setLocation(1100, 300);
                FrmVermelho.setSize(400, 400);
                panelvermelho.setBackground(Color.red);
                FrmVermelho.getContentPane().add(panelvermelho); 
            }
        });
    


        fecharButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}