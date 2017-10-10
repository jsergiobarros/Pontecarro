import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Carro extends JFrame implements ActionListener{
    
    int i=1;
 
    JLabel lcarm1 = new JLabel(new ImageIcon(getClass().getResource("carro_medio1.png")));
    JLabel lcarm = new JLabel(new ImageIcon(getClass().getResource("carro_medio.png")));
    JButton but=new JButton("cria carro");
    JTextField caixa = new JTextField(10);
    int x=0;
    
    public void actionPerformed (ActionEvent e){
        //add codigo da thread quando pronto
        int i=1;
        novocar y = new novocar();
        Random v = new Random();
        y.getT(v.nextInt(50)+1,v.nextInt(10)+1);//colocar as coisas do botão aqui
        y.start();
        new JButton("destroi carro"+i);
        i++;
    }
    public Carro(){
        editarJanela();
        editarB();
        novocar x = new novocar();
        x.getT(-10,-5);
        
        
        
        
        
    }
    public void editarB(){
        //licon.setBounds(300, 0, 808, 612);
    }
    public void editarJanela(){
    
        but.addActionListener(this);
        setLayout(null);   //botão
        but.setBounds(100, 500, 100, 20);
        add(but);
        
        add(caixa);
        caixa.setText("tempo de Travessia");
        
        
        setTitle("programa");//janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1400,800);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        
        
        back x = new back();
        add(x);
        //back.add()
        //add(licon);    
        }

    
    
    public class novocar extends Thread{
        int vx,te,i=1;
        boolean t=true;
        JLabel lcar = new JLabel(new ImageIcon(getClass().getResource("carro_medio.png")));
        
        public void getT(int vx,int te){
            this.vx = vx;
            this.te = te;
            
        }
        public int dir = 1;
        public void run() {
            x=0;
            ImageIcon iccarm = new ImageIcon(getClass().getResource("carro_med.png"));
            JLabel lcarm = new JLabel(iccarm);
            ImageIcon iccarm1 = new ImageIcon(getClass().getResource("carro_med1.png"));
            JLabel lcarm1 = new JLabel(iccarm1);
            adcar(lcar);
         
            while(t){
                try{Thread.sleep(vx);}catch(Exception erro){}
                lcar.setBounds(lcar.getX()+this.i, 300, 45, 18);
                
                if(x>10){
                lcar.setIcon(iccarm);
                x++;
                System.out.println(x);}
                if(x<10){
                lcar.setIcon(iccarm1);
                x++;
                System.out.println(x);
                }
                else
                x=0;
               
            
                //lcar = new JLabel(new ImageIcon(getClass().getResource("carro_rapido.png")));
                if(lcar.getX()>=1100 || lcar.getX()<=100){
                    i=-i;
                    try{Thread.sleep(te*1000);}catch(Exception erro){}
                    while(dir==1){
                        try{Thread.sleep(50);}catch(Exception erro){}
                        
                    }
                }    
            }
            
        }
        
    }
    
    
    public void adcar(JLabel x){
        x.setBounds(100, 0, 45, 18);
        add(x);

    }
    public boolean toque(Component a, Component b) {
        int aX = a.getX();
        int aY = a.getY();
        int ladoDireitoA = aX+a.getWidth();
        int ladoEsquerdoA= aX;
        
        int bX = b.getX();
        int bY = b.getY();
        int ladoDireitoB = bX+b.getWidth();
        int ladoEsquerdoB= bX;
        
        boolean toque = false;
        
        boolean cDireita=false;
        boolean cEsquerda=false;
        
        if(ladoDireitoA>=ladoEsquerdoB) {
                
            cDireita=true;
        }
        if(ladoEsquerdoA<=ladoDireitoB) {
            cEsquerda=true;
        }
        
        if(cDireita && cEsquerda ) {
            toque = true;
        }
            
        return toque;
    }
    
    public class back extends JPanel{
        public void paintComponent(Graphics s){
            super.paintComponent(s);        
//            Image img = licon.getImage();
            //s.drawImage(img,0,0,this);
//            s.drawImage(img,0,0,this);
        }
    }
    
    
    
    /*public class principal extends Thread{
        public void run(){
            boolean x = true;
            while(x=true){
                try{sleep(20);}catch(Exception erro){}
                if(toque(lcarm,lcarr))
                    try{sleep(10);}catch(Exception erro){}
                else
                    lcarr.setBounds(lcarr.getX()+2, 300, 45, 15);
                
                lcarm.setBounds(lcarm.getX()+1, 300, 45, 15);
                if(toque(lcarm,lcarr))
                    try{sleep(30);}catch(Exception erro){}
            }
        }
        
    }
    */
    
public static void main(String[] args){
    new Carro();
    
}
}
