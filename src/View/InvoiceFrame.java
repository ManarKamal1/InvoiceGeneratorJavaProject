package View;

import Controller.Controller;
import Model.Invoice;
import Model.InvoicesTableModel;

import java.util.ArrayList;
import javax.swing.*;


public class InvoiceFrame extends javax.swing.JFrame {
    public InvoiceFrame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane jScrollPane1 = new JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoiceTable.getSelectionModel().addListSelectionListener(controller);
        invoiceTable.setModel(getInvoicesTableModel());
        // Variables declaration - do not modify//GEN-BEGIN:variables
        JButton createInvoiceButton = new JButton();
        createInvoiceButton.addActionListener(controller);
        JButton deleteInvoiceButton = new JButton();
        deleteInvoiceButton.addActionListener(controller);
        JLabel numberLabel1 = new JLabel();
        JLabel dateLabel2 = new JLabel();
        JLabel customerLabel3 = new JLabel();
        JLabel totalLabel4 = new JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        invoiceNumLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        lineTable = new javax.swing.JTable();
        JButton createLineButton = new JButton();
        createLineButton.addActionListener(controller);
        JButton deleteLineButton = new JButton();
        deleteLineButton.addActionListener(controller);
        JMenuBar sMenuBar1 = new JMenuBar();
        JMenu saveMenu1 = new JMenu();
        JMenuItem loadFileMenuItem = new JMenuItem();
        loadFileMenuItem.addActionListener(controller);
        JMenuItem saveFileMenuItem = new JMenuItem();
        saveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setBackground(this.getContentPane().getBackground());

        invoiceTable.setBackground(this.getContentPane().getBackground());
        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        createInvoiceButton.setBackground(this.getContentPane().getBackground());
        createInvoiceButton.setText("Create New Invoice");

        deleteInvoiceButton.setBackground(this.getContentPane().getBackground());
        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.setOpaque(false);

        numberLabel1.setBackground(this.getContentPane().getBackground());
        numberLabel1.setText("Invoice Number");
        numberLabel1.setOpaque(true);

        dateLabel2.setBackground(this.getContentPane().getBackground());
        dateLabel2.setText("Invoice Date");
        dateLabel2.setOpaque(true);

        customerLabel3.setBackground(this.getContentPane().getBackground());
        customerLabel3.setText("Customer Name");
        customerLabel3.setOpaque(true);

        totalLabel4.setBackground(this.getContentPane().getBackground());
        totalLabel4.setText("Invoice Total");
        totalLabel4.setOpaque(true);

        customerNameLabel.setBackground(this.getContentPane().getBackground());
        customerNameLabel.setOpaque(true);

        invoiceDateLabel.setBackground(this.getContentPane().getBackground());
        invoiceDateLabel.setOpaque(true);

        invoiceNumLabel.setBackground(this.getContentPane().getBackground());
        invoiceNumLabel.setOpaque(true);

        invoiceTotalLabel.setBackground(this.getContentPane().getBackground());
        invoiceTotalLabel.setOpaque(true);

        jScrollPane2.setBackground(this.getContentPane().getBackground());

        lineTable.setBackground(this.getContentPane().getBackground());
        lineTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane2.setViewportView(lineTable);

        createLineButton.setBackground(this.getContentPane().getBackground());
        createLineButton.setText("Create New Item");

        deleteLineButton.setBackground(this.getContentPane().getBackground());
        deleteLineButton.setText("Delete Item");

        saveMenu1.setText("File");

        loadFileMenuItem.setText("Load File");
        saveMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save File");
        saveMenu1.add(saveFileMenuItem);

        sMenuBar1.add(saveMenu1);

        setJMenuBar(sMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(createInvoiceButton)
                                                .addGap(131, 131, 131)
                                                .addComponent(deleteInvoiceButton)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(totalLabel4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(invoiceTotalLabel))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(numberLabel1)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(invoiceNumLabel))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(dateLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(invoiceDateLabel))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(customerLabel3)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(customerNameLabel)))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(createLineButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteLineButton)
                                                .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(numberLabel1)
                                                        .addComponent(invoiceNumLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(dateLabel2)
                                                        .addComponent(invoiceDateLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(customerLabel3)
                                                        .addComponent(customerNameLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalLabel4)
                                                        .addComponent(invoiceTotalLabel))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteInvoiceButton)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(createInvoiceButton)
                                                .addComponent(createLineButton)
                                                .addComponent(deleteLineButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new InvoiceFrame().setVisible(true));
    }

    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel invoiceNumLabel;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JTable lineTable;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Invoice> invoices;
    private final Controller controller = new Controller(this);
    private InvoicesTableModel invoicesTableModel;

    public ArrayList<Invoice> getInvoices() {
        if (invoices == null) invoices = new ArrayList<>();
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public InvoicesTableModel getInvoicesTableModel() {
        if (invoicesTableModel == null) {
            invoicesTableModel = new InvoicesTableModel(getInvoices());
        }
        return invoicesTableModel;
    }

    public void setInvoicesTableModel(InvoicesTableModel invoicesTableModel) {
        this.invoicesTableModel = invoicesTableModel;
    }

    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }

    public JLabel getInvoiceDateLabel() {
        return invoiceDateLabel;
    }

    public JLabel getInvoiceNumLabel() {
        return invoiceNumLabel;
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public JLabel getInvoiceTotalLabel() {
        return invoiceTotalLabel;
    }

    public JTable getLineTable() {
        return lineTable;
    }

    public Controller getController() {
        return controller;
    }

    public int getNextInvoiceNum() {
        int num = 0;

        for (Invoice invoice : getInvoices()) {
            if (invoice.getNum() > num)
                num = invoice.getNum();
        }

        return ++num;
    }



}
