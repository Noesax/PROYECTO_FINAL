/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;
import INVENTARIO.Inventario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author noesa
 */
public class AgregarInven extends javax.swing.JFrame {

    /**
     * Creates new form AgregarInven
     */
    public AgregarInven() {
        initComponents();
         File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("Inventario.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error de archivo");
            }
        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error de archivo");
            }
        }       
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        regresar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tnombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ttipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        aniadir = new javax.swing.JButton();
        tnombree = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tcodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tprecio = new javax.swing.JTextField();
        tcantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\noesa\\OneDrive\\Escritorio\\ESTE SI PROYECTO\\PROYECTO\\src\\main\\java\\imagenes\\retornar.png")); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Añadir nuevos productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 54));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 130, 31));
        getContentPane().add(tnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 137, 445, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de producto: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 136, 34));

        Ttipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo", "Bebida alcoholica", "Bebida no alcoholica", "Primera necesidad", "Frutas", "Verduras", "Cereales" }));
        getContentPane().add(Ttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 143, 237, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad ingresada");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 208, 130, 35));

        aniadir.setIcon(new javax.swing.ImageIcon("C:\\Users\\noesa\\OneDrive\\Escritorio\\ESTE SI PROYECTO\\PROYECTO\\src\\main\\java\\imagenes\\add.png")); // NOI18N
        aniadir.setText("Añadir");
        aniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirActionPerformed(evt);
            }
        });
        getContentPane().add(aniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, -1));
        getContentPane().add(tnombree, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 100, 237, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo del producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));
        getContentPane().add(tcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 66, 237, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio unitario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, -1, -1));
        getContentPane().add(tprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 177, 237, -1));
        getContentPane().add(tcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 214, 237, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\noesa\\OneDrive\\Escritorio\\ESTE SI PROYECTO\\PROYECTO\\src\\main\\java\\imagenes\\logo_minimarket-1.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 390, 430));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\noesa\\OneDrive\\Escritorio\\ESTE SI PROYECTO\\PROYECTO\\src\\main\\java\\imagenes\\ca.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        MenuPrin menu = new MenuPrin();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void aniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirActionPerformed
        Inventario llenar = new Inventario();
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("Inventario.txt");
        try {
            archivo.createNewFile();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(tcodigo.getText());
            linea.println(tnombree.getText()+" ");
            linea.println(Double.parseDouble(tprecio.getText()+" "));
            linea.println(Ttipo.getSelectedItem().toString()+" ");
            linea.println(tcantidad.getText()+" ");
            linea.close();
            escribir.close();
        } catch (IOException e) {
            System.out.println("Error de archivo");
        }
    }//GEN-LAST:event_aniadirActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarInven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ttipo;
    private javax.swing.JButton aniadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton regresar;
    private javax.swing.JTextField tcantidad;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JLabel tnombre;
    private javax.swing.JTextField tnombree;
    private javax.swing.JTextField tprecio;
    // End of variables declaration//GEN-END:variables
}
