/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//sdsdsdsdsdsds



package a_ponte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Betim
 */
public class janela_caro extends javax.swing.JFrame {   
    int i=0;
    private JButton bota;

    /**
     * Creates new form janela_caro
     */
    public janela_caro() {
       
        
        initComponents();
        setSize(650,550);
        novocar x = new novocar();
        x.getT(10,5);
        x.start();
        
    }
// fdffdfdfd
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setText("Adicionar Carro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 340, 130, 30);

        jLabel1.setForeground(new java.awt.Color(255, 5, 5));
        jLabel1.setText("Tempo de travesia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 280, 120, 20);

        jTextField1.setName("velocidade"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 300, 100, 30);

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Tempo de espera");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 280, 110, 14);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(300, 300, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a_ponte/p7irh6n6j186ih4s90k26o7g0tq7ok6ja.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 870, 440);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 370, 10, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                novocar y = new novocar();
                if(recebeval(y)){
                    y.start();
                    criBot(bota,y);}
                else
                    y.t=false;
                
//                Random v = new Random();
//                y.getT(v.nextInt(50)+1,v.nextInt(10)+1);//colocar as coisas do botão aqui
                
                
                //System.out.println("umbó");
        
    }//GEN-LAST:event_jButton1ActionPerformed
        ImageIcon iccarm = new ImageIcon(getClass().getResource("carro_medio.png"));
        JLabel lcarm = new JLabel(iccarm);
        ImageIcon iccarm1 = new ImageIcon(getClass().getResource("carro_medio1.png"));
        JLabel lcarm1 = new JLabel(iccarm1);
        ImageIcon iccard = new ImageIcon(getClass().getResource("carro_mediod.png"));
        JLabel lcard = new JLabel(iccard);
        ImageIcon iccard1 = new ImageIcon(getClass().getResource("carro_mediod1.png"));
        JLabel lcard1 = new JLabel(iccard1);
       
        public void trocaim(JLabel jl,boolean x){
            if(x){//vem da direita->esquerda e troca para a direita
              jl.setIcon(iccarm);
            }
            else{//vem da esquerda->direita e vira para a esquerda
                jl.setIcon(iccard);
            }
        }
        public int movecar(JLabel jl,boolean x,int y){
            if(x){
                if(y<15){
                    jl.setIcon(iccarm);
                    return y++;
                    }
                if(y>=15|| y<30 ){
                    jl.setIcon(iccarm1);
                    return y++;
                    }
                else return y=0;
            }
            else{
                if(y<15){
                    jl.setIcon(iccard);
                    return y++;
                   }
                if(y>=15|| y<30 ){
                    jl.setIcon(iccard1);
                    return y++;
                    }
                else return y=0;
            }
        } 
   
    
    
        int vetor [] = new int[50];
        public void criBot(JButton bota,novocar y){
            if(recebeval(y)){
                int v,mudou=0;
                String x=" destruir Carro"+i;
                i++;
                for(v=1;v<=i+1;v++){
                    if (vetor[v]==1)                 
                        System.out.println("rojão azul"+vetor[v]);
                    if (vetor[v]!=1){    
                        vetor[v]=1;
                        y.posic = v;
                        break;
                    }
                }
                JButton btn = new JButton(x);
                btn.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        y.t=false;
                        y.lcar.setVisible(false);
                        removefila(y);
                        btn.setVisible(false);
                        vetor[y.posic]=0;
                    }
                });
                jLabel3.add(btn);
                int posx=(50+160*(v-1)),posy=(420);
                if (posx > 50+160*3){
                    posy -= 25;
                    posx -=160*4;
                }
                btn.setBounds(posx, posy, 150, 20);
                System.out.println("posx"+posx +" posy " + posy);
        }
        }
    public boolean recebeval(novocar y){
        int vx, te;
        try{ 
        vx=Integer.parseInt(jTextField1.getText());
        te=Integer.parseInt(jTextField2.getText());
        y.getT(vx, te);
        return true;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "digite um valor válido");
        return false;
        }
    }       
    
    public boolean bateu(novocar a, novocar b) {
        try{
        int aX = a.lcar.getX();
        int aY = a.lcar.getY();
        int ladoDireitoA = aX+a.lcar.getWidth();
        int ladoEsquerdoA= aX;

        int bX = b.lcar.getX();
        int bY = b.lcar.getY();
        int ladoDireitoB = bX+b.lcar.getWidth();
        int ladoEsquerdoB= bX;

        boolean bateu = false;

        boolean cDireita=false;
        boolean cEsquerda=false;

        if(ladoDireitoA>=ladoEsquerdoB) {
                cDireita=true;
        }
        if(ladoEsquerdoA<=ladoDireitoB) {
                cEsquerda=true;
        }

        if(cDireita && cEsquerda) {
                bateu = true;
        }

        return bateu;}catch(Exception e){}
        
        return false;
}

    
    
    
    
    novocar vetorn[] = new novocar[50];
    int controlefila;
    public int addfila(novocar y){
        int aux = controlefila++;
        vetorn[aux]=y;
        return aux;
    
    }
    
    public int removefila(novocar y){
        int aux = y.local;
        for(int v=aux;v<=controlefila;v++){
            vetorn[v] = vetorn[v+1];
            
        }  
        return controlefila--;
            
    }
    
    
        
        
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    public class novocar extends Thread{
        int vx,te,i=1,posic,x=0,local;
        boolean t=true, direcao=false;
        JLabel lcar = new JLabel(new ImageIcon(getClass().getResource("carro_medio.png")));
        long travessia,tempoNow = System.currentTimeMillis(),tempo;
        public void getT(int vx,int te){
            this.vx = vx;
            this.te = te;
        }
        public int dir = 1;
        public void run() {
            adcar(lcar);
          //semaforos
            local = addfila(this);
            while(t){
                if(local!=0){
                    for(int aux=0;local>aux ? aux<=controlefila:aux<local;aux++){
                          if(local==aux)
                            continue;
                        while(bateu(vetorn[local],vetorn[aux])){  
                            try{Thread.sleep(vx);}catch(Exception erro){}
                            System.out.println(bateu(vetorn[local],vetorn[aux]));
                            movecar(lcar,direcao,x);
                            x++;
                            if(x==30)
                                x=0;
                        }
                    }
                }
                for(int i=0;i<=400;i++){
                    tempoNow = System.currentTimeMillis();
                    travessia=0;
                    while(travessia<vx*2){
                        tempo = System.currentTimeMillis();
                        travessia = tempo-tempoNow;
                        //System.out.println(travessia+" "+vxx*2+" "+i );
                        }
                    lcar.setBounds(lcar.getX()+this.i, 150, 45, 20);
                    System.out.println(i);
                    movecar(lcar,direcao,x);
                    x++;
                    if(x==30)
                        x=0;
                    }
                if(lcar.getX()>=500 || lcar.getX()<=100){
                    i=-i;
                    if(direcao)
                        direcao=false;
                    else
                        direcao=true;
                    trocaim(lcar,direcao);
                    removefila(this);
                    System.out.println(controlefila);
                    int espera=1000;
                    while(espera!=0){
                        try{Thread.sleep(te);}catch(Exception erro){}
                        espera--;
                        movecar(lcar,direcao,x);
                        x++;
                        if(x==30)
                            x=0;
                    }
                   
                    
                    
                }
            }
        }
    }     
    public void adcar(JLabel x){
        x.setBounds(100,150, 45, 20);
            add(x);
            jLabel3.add(x);
                

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janela_caro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new janela_caro().setVisible(true);
     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
