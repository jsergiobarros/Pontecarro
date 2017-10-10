import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Window extends Carro {
    String nomes;
    int i=0;
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JButton bota;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Window window = new Window();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Window() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(10, 11, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(10, 42, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        
        JButton btnNewButton = new JButton("bot\u00E3o");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                novocar y = new novocar();
                Random v = new Random();
                y.getT(v.nextInt(50)+1,v.nextInt(10)+1);//colocar as coisas do botão aqui
                y.start();
                criBot(bota);
                System.out.println("umbó");
            }
        });
        btnNewButton.setBounds(10, 73, 89, 23);
        frame.getContentPane().add(btnNewButton);
        
}
    
    public void criBot(JButton bota){
        String x=" destruir Carro"+i;
        i++;
        JButton btn = new JButton(x);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                btn.remove(0);
                
            }
        });
        frame.getContentPane().add(btn);
        btn.setBounds(10, 90+25*i+10, 150, 20);
    }
    public void removeButton(String name) {
        
    }
        /*bota = new JButton("butao2");
        bota.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("umbó");
            }
        });
        bota.setBounds(100, 107, 89, 23);
        frame.getContentPane().add(bota);
        System.out.println("umbó");
}*/
    }
