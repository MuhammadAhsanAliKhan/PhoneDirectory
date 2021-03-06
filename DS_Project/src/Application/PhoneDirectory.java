package Application;

import DataStructure.HashTable;
import DataStructure.BST;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class PhoneDirectory extends javax.swing.JFrame {
    static HashTable HT;
    
    /**
     * Creates new form PhoneDirectory
     */
    DefaultTableModel dtm;
    public PhoneDirectory() {
        initComponents();
        HT= new HashTable(500);
        try{
            File ObjReader = new File("ContactList.txt");
            Scanner myReader = new Scanner(ObjReader);
            int i=10;
            String[] arr;
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                arr=data.split("  ");
                Contact c;
                if(arr.length == 3){
                    c= new Contact(arr[0],arr[1],arr[2]);
                }
                else{
                    c= new Contact(arr[0],arr[1],"");
                }
                HT.insert(c);
            }
            myReader.close();
        }
        catch (IOException e) {
         System.out.println("An error occurred.");
        }
            
        
    }
    
    public HashTable get_HT(){
        return HT;
    }
    
    public void populate(String name, String Number_1, String Number2){
        dtm = (DefaultTableModel) ContactTable.getModel();
        String[] arr = {name, Number_1, Number2};
        dtm.addRow(arr);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ContactTable = new javax.swing.JTable();
        Edit = new javax.swing.JButton();
        Add_Contact = new javax.swing.JButton();
        Remove_Contact = new javax.swing.JButton();
        Search_Contact = new javax.swing.JTextField();
        Go = new javax.swing.JToggleButton();
        Show_Contact = new javax.swing.JButton();
        Sort_Contacts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Number_2 = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Number_1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        Clear_All = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        ContactTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Primary Number", "Secondary Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ContactTable);

        Edit.setText("Edit Contact");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Add_Contact.setText("Add Contact");
        Add_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ContactActionPerformed(evt);
            }
        });

        Remove_Contact.setText("Remove Contact");
        Remove_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_ContactActionPerformed(evt);
            }
        });

        Search_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ContactActionPerformed(evt);
            }
        });

        Go.setText("Go");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        Show_Contact.setText("Show Contacts");
        Show_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_ContactActionPerformed(evt);
            }
        });

        Sort_Contacts.setText("Sort Contacts");
        Sort_Contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sort_ContactsActionPerformed(evt);
            }
        });

        jLabel1.setText("Search Contact:");

        jLabel2.setText("Name:");

        jLabel3.setText("Primary Number:");

        jLabel4.setText("Secondary Number:");

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Clear_All.setText("Clear All");
        Clear_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_AllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edit)
                            .addComponent(Show_Contact)
                            .addComponent(Sort_Contacts)
                            .addComponent(Remove_Contact))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number_1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Add_Contact)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Go)
                                .addGap(203, 203, 203)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number_2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clear_All)))
                .addGap(230, 230, 230))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Search_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(Go))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Add_Contact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Refresh)
                            .addComponent(Clear_All))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Edit)
                        .addGap(18, 18, 18)
                        .addComponent(Remove_Contact)
                        .addGap(18, 18, 18)
                        .addComponent(Show_Contact)
                        .addGap(18, 18, 18)
                        .addComponent(Sort_Contacts)
                        .addGap(157, 157, 157))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        try{
            dtm = (DefaultTableModel) ContactTable.getModel();
            dtm.setRowCount(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Table is empty");
        }
        String contacts=HT.list();
        String[] arr= contacts.split("  ");
        String num1=HT.list2();
        String[] arr2= num1.split("  ");
        String num2 = HT.list3();
        String[] arr3 = num2.split("  ");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equalsIgnoreCase("empty") )  populate(arr[i],arr2[i],arr3[i]);
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void Remove_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_ContactActionPerformed
        // TODO add your handling code here:
        RemoveContact RC = new RemoveContact();
        RC.setVisible(true);
        //this.hide();
        
    }//GEN-LAST:event_Remove_ContactActionPerformed

    private void Add_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ContactActionPerformed
        // TODO add your handling code here:
        JFrame f;
        Contact c= new Contact(Name.getText(),Number_1.getText(),Number_2.getText());
        if(Number_1.getText().isBlank() && Number_2.getText().isBlank()){
            f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please add atleast one Contact Number to Continue");
        }
        else if (Number_1.getText().isBlank() && !Number_2.getText().isBlank()){
            Number_1.setText(Number_2.getText());
            Number_2.setText("");
            if(Name.getText().isBlank()) Name.setText("Contact: " + Number_1.getText());
            c = new Contact(Name.getText(),Number_1.getText(), "");
            HT.insert(c);
            f=new JFrame();
            JOptionPane.showMessageDialog(f, "Contact Added Sucessfully");
            Name.setText("");
        Number_1.setText("");
        Number_2.setText("");
        }
        else{
        HT.insert(c);
        f=new JFrame();
            JOptionPane.showMessageDialog(f, "Contact Added Sucessfully");
            Name.setText("");
        Number_1.setText("");
        Number_2.setText("");
        }
//        try {
//            FileWriter myWriter = new FileWriter("ContactList.txt", true);
//            myWriter.write(Name.getText() + "  " + Number_1.getText() + "  " + Number_2.getText()+"\n");
//            myWriter.close();
//        } catch (Exception e) {
//            System.out.println("An error Occured.");
//            e.printStackTrace();
//        }
        
    }//GEN-LAST:event_Add_ContactActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        EditContact k = new EditContact();
        k.show();
        
    }//GEN-LAST:event_EditActionPerformed

    private void Show_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_ContactActionPerformed
        // TODO add your handling code here:
        String contacts=HT.list();
        String[] arr= contacts.split("  ");
        String num1=HT.list2();
        String[] arr2= num1.split("  ");
        String num2 = HT.list3();
        String[] arr3 = num2.split("  ");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equalsIgnoreCase("empty"))  populate(arr[i],arr2[i],arr3[i]);
        }
    }//GEN-LAST:event_Show_ContactActionPerformed

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
        // TODO add your handling code here:
        String n = Search_Contact.getText();
        JFrame f;
        try {
            Contact c = HT.search(n);
            Details d = new Details();
            d.listing(c);
            d.show();
        } catch (NullPointerException e) {
            f = new JFrame();  
            JOptionPane.showMessageDialog(f, "Contact " +'"'+n +'"'+ " Does Not Exist.");
        }
        //populate(c.name, c.Num1, c.Num2);
    }//GEN-LAST:event_GoActionPerformed

    private void Search_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_ContactActionPerformed

    private void Clear_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_AllActionPerformed
        // TODO add your handling code here:
        try{
            dtm = (DefaultTableModel) ContactTable.getModel();
            dtm.setRowCount(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Table is empty");
        }
    }//GEN-LAST:event_Clear_AllActionPerformed

    private void Sort_ContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sort_ContactsActionPerformed
        // TODO add your handling code here:
//        try{
//            FileReader fileReader = new FileReader("ContactList.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            ArrayList<String> lines = new ArrayList<>();
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                lines.add(line);
//            }
//            bufferedReader.close();
//
//            Collections.sort(lines, Collator.getInstance());
//
//            FileWriter writer = new FileWriter("SortedContactList.txt"); 
//            for(String str: lines) {
//              writer.write(str + "\r\n");
//            }
//            writer.close();
//        }catch(FileNotFoundException e){
//            System.out.println("An error occurred");
//            e.printStackTrace();
//        }catch(IOException e){
//            System.out.println("An error occurred");
//            e.printStackTrace();
//        }
//        
//        String[] arr;
//        try{
//            File ObjReader = new File("SortedContactList.txt");
//            Scanner myReader = new Scanner(ObjReader);
//            while (myReader.hasNextLine()) 
//            {
//                String data = myReader.nextLine();
//                arr = data.split("  ");
//                if(arr.length == 2)
//                    populate(arr[0], arr[1], "");
//                else
//                    populate(arr[0], arr[1], arr[2]);
//                
//            }
//        }catch(Exception e){
//            System.out.println("An error occured.");
//            e.printStackTrace();
//        }
        BST<String> BST=new BST<>();
        String s= HT.list();
        String[] arr= s.split("  ");
        String s2= HT.list2();
        String[] arr2= s2.split("  ");
        String s3= HT.list3();
        String[] arr3= s3.split("  ");
        for(int i=0; i<arr.length;i++)
        {
            BST.insert(arr[i], arr2[i], arr3[i]);
        }
        BST.LNR(BST.getRoot());
    }//GEN-LAST:event_Sort_ContactsActionPerformed

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
            java.util.logging.Logger.getLogger(PhoneDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(() -> {
            new PhoneDirectory().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Contact;
    private javax.swing.JButton Clear_All;
    private javax.swing.JTable ContactTable;
    private javax.swing.JButton Edit;
    private javax.swing.JToggleButton Go;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Number_1;
    private javax.swing.JTextField Number_2;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Remove_Contact;
    private javax.swing.JTextField Search_Contact;
    private javax.swing.JButton Show_Contact;
    private javax.swing.JButton Sort_Contacts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
