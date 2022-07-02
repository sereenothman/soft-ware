/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.veiw;

import SIG.controller.ActionHandler;
import SIG.model.InvoiceHeader;
import SIG.model.InvoiceHeaderTable;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author seren
 */
public class invoice extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public invoice() {
        this.handler = new ActionHandler(this);
        initComponents();
    }

    /**
    * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoHeader = new javax.swing.JTable();
        invoHeader.getSelectionModel().addListSelectionListener(handler);
        newInvoice = new javax.swing.JButton();
        newInvoice.addActionListener(handler);
        delInvoice = new javax.swing.JButton();
        delInvoice.addActionListener(handler);
        jScrollPane2 = new javax.swing.JScrollPane();
        invoLine = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        newItem = new javax.swing.JButton();
        deltem = new javax.swing.JButton();
        deltem.addActionListener(handler);
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenuItem();
        loadMenu.addActionListener(handler);
        saveMenu = new javax.swing.JMenuItem();
        saveMenu.addActionListener(handler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        invoHeader.setOpaque(false);
        invoHeader.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                invoHeaderAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                invoHeaderAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(invoHeader);

        newInvoice.setText("New Invoice");
        newInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInvoiceActionPerformed(evt);
            }
        });

        delInvoice.setText("Delete Invoice");
        delInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delInvoiceActionPerformed(evt);
            }
        });

        invoLine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invoLine);

        jLabel1.setText("Num");

        jLabel2.setText("Customer");

        jLabel3.setText("Date");

        jLabel4.setText("Total");

        numLabel.setText("jLabel5");

        customerLabel.setText("jLabel6");

        dateLabel.setText("jLabel7");

        totalLabel.setText("jLabel8");

        newItem.setText("New Item");

        deltem.setText("Delete Item");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jMenu1.setText("File");

        loadMenu.setText("Load File");
        jMenu1.add(loadMenu);

        saveMenu.setText("Save File");
        saveMenu.setToolTipText("");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(newInvoice)
                        .addGap(39, 39, 39)
                        .addComponent(delInvoice))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(totalLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(customerLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(newItem)
                        .addGap(38, 38, 38)
                        .addComponent(deltem)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(customerLabel)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dateLabel)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newInvoice)
                            .addComponent(delInvoice)
                            .addComponent(newItem)
                            .addComponent(deltem))
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuActionPerformed

    private void delInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delInvoiceActionPerformed

    private void newInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newInvoiceActionPerformed

    private void invoHeaderAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_invoHeaderAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_invoHeaderAncestorAdded

    private void invoHeaderAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_invoHeaderAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_invoHeaderAncestorRemoved

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton delInvoice;
    private javax.swing.JButton deltem;
    private javax.swing.JTable invoHeader;
    private javax.swing.JTable invoLine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JButton newInvoice;
    private javax.swing.JButton newItem;
    private javax.swing.JLabel numLabel;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
private ActionHandler handler ;
private ArrayList<InvoiceHeader>invList;
private InvoiceHeaderTable InvHTable;

    public ActionHandler getHandler() {
        return handler;
    }

    public ArrayList<InvoiceHeader> getInvList() {
        return invList;
    }

    public void setInvList(ArrayList<InvoiceHeader> invList) {
        this.invList = invList;
        InvHTable =new InvoiceHeaderTable(invList);
        this.invoHeader.setModel(InvHTable);
    }
     
    public javax.swing.JTable getInvoHeader() {
        return invoHeader;
    }
    
    public javax.swing.JTable getInvoLine() {
        return invoLine;
    }
    

    
    
    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    
    
    

}
