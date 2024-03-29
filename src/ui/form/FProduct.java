/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import controller.Controller;
import domain.Manufacturer;
import domain.MeasurementUnit;
import domain.Product;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author student1
 */
public class FProduct extends javax.swing.JDialog {

    /**
     * Creates new form FProduct
     */
    public FProduct(FMain form, boolean modal, FormMode formMode) throws Exception {
        super(form, modal);
        initComponents();

        setLocationRelativeTo(null);

        // TODO: Refactor
        prepareForm(formMode);
        //fillForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabID = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jlabName = new javax.swing.JLabel();
        jlabDescription = new javax.swing.JLabel();
        jlabPrice = new javax.swing.JLabel();
        jtxtPrice = new javax.swing.JTextField();
        jlabMeasurementUnit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtDescription = new javax.swing.JTextArea();
        jcomboMeasureUnit = new javax.swing.JComboBox<>();
        jlabManufacturer = new javax.swing.JLabel();
        jcomboManufacturer = new javax.swing.JComboBox<>();
        jbtnSelectManufacturer = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnEnableChanges = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtProductError = new javax.swing.JTextArea();
        jbtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New product");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("New product"));

        jlabID.setText("id:");

        jlabName.setText("name:");

        jlabDescription.setText("description:");

        jlabPrice.setText("price:");

        jlabMeasurementUnit.setText("measurement unit:");

        jtxtDescription.setColumns(20);
        jtxtDescription.setRows(5);
        jScrollPane1.setViewportView(jtxtDescription);

        jlabManufacturer.setText("manufacturer:");

        jbtnSelectManufacturer.setText("select");
        jbtnSelectManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelectManufacturerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcomboManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSelectManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabMeasurementUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtPrice)
                            .addComponent(jcomboMeasureUnit, 0, 186, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabID)
                    .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabName)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSelectManufacturer)
                    .addComponent(jlabManufacturer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabMeasurementUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcomboMeasureUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        jbtnCancel.setText("Cancel");

        jbtnUpdate.setText(" Update");

        jbtnEnableChanges.setText("Enable changes");

        jtxtProductError.setColumns(20);
        jtxtProductError.setForeground(new java.awt.Color(255, 51, 51));
        jtxtProductError.setRows(5);
        jScrollPane2.setViewportView(jtxtProductError);

        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnCancel)
                        .addGap(67, 67, 67)
                        .addComponent(jbtnEnableChanges)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnDelete)
                        .addGap(26, 26, 26)
                        .addComponent(jbtnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnCancel)
                        .addComponent(jbtnEnableChanges))
                    .addComponent(jbtnDelete)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnSave)
                        .addComponent(jbtnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSelectManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelectManufacturerActionPerformed
        new FManufacturerSelect(null, true).setVisible(true);
    }//GEN-LAST:event_jbtnSelectManufacturerActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed

        try {
            //Long id = Long.parseLong(jtxtID.getText().trim());
            String name = jtxtName.getText().trim();
            String description = jtxtDescription.getText();
            Manufacturer manufacturer = (Manufacturer) jcomboManufacturer.getSelectedItem();
            BigDecimal price = new BigDecimal(jtxtPrice.getText().trim());
            MeasurementUnit mUnit = (MeasurementUnit) jcomboMeasureUnit.getSelectedItem();
            
            Product product = new Product(null, name, description, manufacturer, price, mUnit);
            product=Controller.getInstance().saveProduct(product);
            JOptionPane.showMessageDialog(this, "Product is saved with id: "+product.getId());
            
            Controller.getInstance().getMap().put("uc_view_product", product);
            prepareForm(FormMode.FORM_VIEW);
        } catch (Exception ex) {
            Logger.getLogger(FProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnEnableChanges;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JButton jbtnSelectManufacturer;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox<domain.Manufacturer> jcomboManufacturer;
    private javax.swing.JComboBox<domain.MeasurementUnit> jcomboMeasureUnit;
    private javax.swing.JLabel jlabDescription;
    private javax.swing.JLabel jlabID;
    private javax.swing.JLabel jlabManufacturer;
    private javax.swing.JLabel jlabMeasurementUnit;
    private javax.swing.JLabel jlabName;
    private javax.swing.JLabel jlabPrice;
    private javax.swing.JTextArea jtxtDescription;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPrice;
    private javax.swing.JTextArea jtxtProductError;
    // End of variables declaration//GEN-END:variables

    private void prepareForm(FormMode formMode) throws Exception {
        fillMeasurementUnits();
        fillManufacturers();

        if (formMode.equals(FormMode.FORM_ADD)) {
            jbtnDelete.setVisible(false);
            jbtnEnableChanges.setVisible(false);
            jbtnUpdate.setVisible(false);
            jtxtProductError.setEnabled(false);
            
            jtxtID.setEnabled(false);
        }
        if (formMode.equals(FormMode.FORM_VIEW)) {
            jbtnDelete.setVisible(false);
            jbtnUpdate.setVisible(false);
            jbtnSave.setVisible(false);
            jbtnEnableChanges.setVisible(true);
            jbtnSelectManufacturer.setVisible(false);
            
            jtxtID.setEditable(false);
            jtxtDescription.setEditable(false);
            jtxtName.setEditable(false);
            jtxtPrice.setEditable(false);
            jtxtProductError.setEditable(false);
            jcomboManufacturer.setEditable(false);
            jcomboMeasureUnit.setEditable(false);
            
            Product product=(Product)Controller.getInstance().getMap().get("uc_view_product");
            fillProduct(product);
        }
    }

    private void fillMeasurementUnits() {
        jcomboMeasureUnit.removeAllItems();

        jcomboMeasureUnit.addItem(MeasurementUnit.KG);
        jcomboMeasureUnit.addItem(MeasurementUnit.L);
        jcomboMeasureUnit.addItem(MeasurementUnit.PCS);
    }

    private void fillManufacturers() throws Exception {
        jcomboManufacturer.removeAllItems();

        Controller controller = Controller.getInstance();
        List<Manufacturer> manufacturers = controller.getAllManufacturers();
        for (Manufacturer manufacturer : manufacturers) {
            jcomboManufacturer.addItem(manufacturer);
        }

    }

    private void fillProduct(Product product) {
        
        jtxtID.setText(product.getId().toString());
        jtxtDescription.setText(product.getDescription());
        jtxtName.setText(product.getName());
        jtxtPrice.setText(product.getPrice().toString());
        jcomboManufacturer.setSelectedItem(product.getManufacturer());
        jcomboMeasureUnit.setSelectedItem(product.getMeasurementUnit());
    }
}
