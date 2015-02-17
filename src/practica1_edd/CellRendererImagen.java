/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView.TableRow;
 
public class CellRendererImagen extends DefaultTableCellRenderer {
 
    private static final long serialVersionUID = 1L;
 
    static class TableModel extends DefaultTableModel{
 
    private static final long serialVersionUID = 1L;
 
        public TableModel(){
            addColumn("Imagen");
            
        }
    }
    public CellRendererImagen() {
        super();
    }
    @Override
    public void setValue(Object value) {
  
            if(value.toString().equals("OK")){
                 String path="/imagenes/planta1.png";
          URL url=this.getClass().getResource(path);
          ImageIcon icon=new ImageIcon(url);//modf
          setIcon(icon);
            }else{
            }
        
    }
    static class Frame extends JFrame{
        private static final long serialVersionUID = 1L;
 
        public Frame(){
            TableModel tableModel = new TableModel();
            JTable table = new JTable(tableModel);
            table.getColumnModel().getColumn(0).setCellRenderer(new CellRendererImagen());
            JScrollPane scrollPane=new JScrollPane(table);
            getContentPane().add(scrollPane);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,200);
            TableColumn columna;
            columna=table.getColumnModel().getColumn(0);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);
            columna=table.getColumnModel().getColumn(0);
            columna.setPreferredWidth(100);
            columna.setMaxWidth(100);
            columna.setMinWidth(100);
            table.setRowHeight(100);
                    
            tableModel.addRow(new Object[]{"OK"});
          
        }
        public static void main(String args[]){
            SwingUtilities.invokeLater(new Runnable() {
 
                @Override
                public void run() {
                    new Frame().setVisible(true);
 
                }
            });
        }
    }
}
