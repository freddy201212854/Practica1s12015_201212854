/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.URL;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author KRATOS
 */
class OutputPanel extends JFrame {
     public void MostrarImagenes(String img,JLabel imagen)
    {
         String path="/imagenes/"+img;
          URL url=this.getClass().getResource(path);
          ImageIcon icon=new ImageIcon(url);
          imagen.setIcon(icon);
    }
    public OutputPanel(Vector parsedOutput) {

        this.setTitle("Output");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel content = new JPanel(new GridLayout(0, 1));

        for (int i = 0; i < 100; i++) {    
            JLabel sectionLabel = new JLabel("hello " + i);
            content.add(sectionLabel);
        }
        JScrollPane scrollPane = new JScrollPane(content);
        this.add(scrollPane);
        this.pack();
        this.setVisible(true);

    }
    
}

class Test {
 public static URL url;
 public static String path;
    public static void main(String[] args) {
       // new OutputPanel(null);
     JLabel lab[]=new JLabel[10];
   
     JFrame frame = new JFrame();

        JPanel panel = new JPanel(new GridLayout(0,1));
       for (int i = 0; i < 10; i++) {   
            
            lab[i]=new JLabel();
            lab[i].setBounds(10,10,100,100);
            lab[i].setIcon(new ImageIcon("planta2.png"));
            MostrarImagenes("planta1.png",lab[i]);
            panel.add(lab[i]);
            
        }
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(100, 100, 300, 300);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500, 400));
        contentPane.add(scrollPane);
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static String nombre()
    {
        String path2="/imagenes/planta1.png";
          return path2;
    }
    public static void MostrarImagenes(String img,JLabel imagen)
    {
         String path3="/imagenes/"+img;
          ImageIcon icon=new ImageIcon("portada2.jpg");
          imagen.setIcon(icon);
    }
}