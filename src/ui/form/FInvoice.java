/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import controller.Controller;
import domain.Invoice;
import domain.InvoiceItem;
import domain.MeasurementUnit;
import domain.Product;
import domain.User;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import ui.component.table.model.InvoiceTableModel;
import ui.component.table.model.ProductTableModel;

/**
 *
 * @author student1
 */
public class FInvoice extends javax.swing.JDialog {

    /**
     * Creates new form FInvoice
     */
    public FInvoice(FMain form, boolean modal) throws Exception {
        super(form, modal);
        initComponents();
        setLocationRelativeTo(null);
        populateCurrentUser();
        prepareForm();
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtCreatedDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtCreatedUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtAmount = new javax.swing.JTextField();
        jpanelInvoiceItem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblInvoice = new javax.swing.JTable();
        jbtnRemoveInvoiceItem = new javax.swing.JButton();
        jpanelProducts = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblProducts = new javax.swing.JTable();
        jpanelProduct = new javax.swing.JPanel();
        jtxtCurrentProductName = new javax.swing.JTextField();
        jtxtCurrentProductId = new javax.swing.JTextField();
        jtxtCurrentProductQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Date:");

        jtxtCreatedDate.setEditable(false);

        jLabel2.setText("User:");

        jtxtCreatedUser.setEditable(false);

        jLabel3.setText("Amount:");

        jtxtAmount.setEditable(false);

        jpanelInvoiceItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice item:"));

        jtblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblInvoice);

        jbtnRemoveInvoiceItem.setText("-");
        jbtnRemoveInvoiceItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveInvoiceItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelInvoiceItemLayout = new javax.swing.GroupLayout(jpanelInvoiceItem);
        jpanelInvoiceItem.setLayout(jpanelInvoiceItemLayout);
        jpanelInvoiceItemLayout.setHorizontalGroup(
            jpanelInvoiceItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelInvoiceItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnRemoveInvoiceItem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jpanelInvoiceItemLayout.setVerticalGroup(
            jpanelInvoiceItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelInvoiceItemLayout.createSequentialGroup()
                .addGroup(jpanelInvoiceItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelInvoiceItemLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtnRemoveInvoiceItem))
                    .addGroup(jpanelInvoiceItemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelProducts.setBorder(javax.swing.BorderFactory.createTitledBorder("Select product"));

        jtblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProductsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblProducts);

        javax.swing.GroupLayout jpanelProductsLayout = new javax.swing.GroupLayout(jpanelProducts);
        jpanelProducts.setLayout(jpanelProductsLayout);
        jpanelProductsLayout.setHorizontalGroup(
            jpanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelProductsLayout.setVerticalGroup(
            jpanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Current product"));

        jtxtCurrentProductName.setEditable(false);

        jtxtCurrentProductId.setEditable(false);

        jtxtCurrentProductQuantity.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jtxtCurrentProductQuantity.setText("0");

        jLabel4.setText("Name:");

        jLabel5.setText("ID:");

        jLabel6.setText("Quantity:");

        jbtnAdd.setText("Add product");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Change");

        javax.swing.GroupLayout jpanelProductLayout = new javax.swing.GroupLayout(jpanelProduct);
        jpanelProduct.setLayout(jpanelProductLayout);
        jpanelProductLayout.setHorizontalGroup(
            jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelProductLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCurrentProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelProductLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCurrentProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelProductLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCurrentProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelProductLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97))
                            .addGroup(jpanelProductLayout.createSequentialGroup()
                                .addComponent(jbtnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jpanelProductLayout.setVerticalGroup(
            jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtCurrentProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtCurrentProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelProductLayout.createSequentialGroup()
                        .addGroup(jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtxtCurrentProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelProductLayout.createSequentialGroup()
                        .addGroup(jpanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAdd)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtCreatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtCreatedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpanelInvoiceItem, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpanelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jpanelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtCreatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtCreatedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpanelInvoiceItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductsMouseClicked
        Product product = getSelectedProduct();
        viewProduct(product);
    }//GEN-LAST:event_jtblProductsMouseClicked

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        // TODO add your handling code here:
        try {
            Product product = getSelectedProduct();
            BigDecimal quantity = new BigDecimal(jtxtCurrentProductQuantity.getText().trim());
            TableModel tm = jtblInvoice.getModel();
            InvoiceTableModel itm = (InvoiceTableModel) tm;
            itm.addProduct(product, quantity);
            BigDecimal amount=getAmount();
            jtxtAmount.setText(String.valueOf(amount));
            populateForm();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnRemoveInvoiceItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveInvoiceItemActionPerformed
        // TODO add your handling code here:
        InvoiceTableModel itm=(InvoiceTableModel) jtblInvoice.getModel();
        int row=jtblInvoice.getSelectedRow();
        if(row!=-1){
            itm.removeSelectedItem(row);
            BigDecimal amount=getAmount();
            jtxtAmount.setText(String.valueOf(amount));
        } else { 
            JOptionPane.showMessageDialog(this, "First select item!", "WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnRemoveInvoiceItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            InvoiceTableModel itm=(InvoiceTableModel) jtblInvoice.getModel();
            Invoice invoice=itm.getInvoice();
            SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
            invoice.setCreatedDate(sdf.parse(jtxtCreatedDate.getText().trim()));
            invoice.setAmount(getAmount());
          
            invoice=Controller.getInstance().saveInvoice(invoice);
            JOptionPane.showMessageDialog(this, "Invoice is saved with No: "+invoice.getId());
            
            Controller.getInstance().getMap().put("uc_view_invoice", invoice);
           // prepareForm(FormMode.FORM_VIEW);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private Product getSelectedProduct() {
        // TODO add your handling code here:
        int selectedRow = jtblProducts.getSelectedRow();
        if (selectedRow != -1) {
            TableModel tm = jtblProducts.getModel();
            ProductTableModel ptm = (ProductTableModel) tm;
            Long productId = (Long) jtblProducts.getValueAt(selectedRow, 0);
            Product product = ptm.getProduct(productId);
            return product;
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnRemoveInvoiceItem;
    private javax.swing.JPanel jpanelInvoiceItem;
    private javax.swing.JPanel jpanelProduct;
    private javax.swing.JPanel jpanelProducts;
    private javax.swing.JTable jtblInvoice;
    private javax.swing.JTable jtblProducts;
    private javax.swing.JTextField jtxtAmount;
    private javax.swing.JTextField jtxtCreatedDate;
    private javax.swing.JTextField jtxtCreatedUser;
    private javax.swing.JTextField jtxtCurrentProductId;
    private javax.swing.JTextField jtxtCurrentProductName;
    private javax.swing.JTextField jtxtCurrentProductQuantity;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() throws Exception {
        List<Product> products = Controller.getInstance().getAllProducts();
        TableModel tm = new ProductTableModel(products);
        jtblProducts.setModel(tm);

        jtblInvoice.setModel(new InvoiceTableModel(new Invoice()));
        populateForm();
    }

    private void viewProduct(Product product) {
        jtxtCurrentProductId.setText(product.getId() + "");
        jtxtCurrentProductName.setText(product.getName());

    }

    private BigDecimal getAmount() {
        BigDecimal amount=new BigDecimal(0);
        Invoice invoice=((InvoiceTableModel) jtblInvoice.getModel()).getInvoice(); //!!!!!!!!!!!!!!!!!!!!!!!!!!
        for (InvoiceItem it : invoice.getItems()) {
            amount=amount.add(it.getPrice().multiply(it.getQuantity()));
        }
        
        return amount;
    }

    private void populateForm() {
        JComboBox<MeasurementUnit> jcb=new JComboBox<>();
        jcb.setModel(new DefaultComboBoxModel<>(MeasurementUnit.values()));
        TableColumnModel tcm=jtblInvoice.getColumnModel();
        TableColumn columnForMU=tcm.getColumn(5);
        columnForMU.setCellEditor(new DefaultCellEditor(jcb));
    }

    private void populateCurrentUser() {
        jtxtCreatedUser.setText(session.Session.getCurrentUser());
        
    }
}
