/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Manage_Farm;

/**
 *
 * @author mhass
 */
public class New_Animal extends javax.swing.JPanel {
    public int userquantity;
    public int userAnimalname; //using 1 for cow and 2 for chicken
    public double userage;
    public double userweight;
    public String userhealthstatus;
    public double inperanimalprice;
    /**
     * Creates new form New_Animal
     */
    public New_Animal() {
        initComponents();
        userAnimalname=0;
    }
    
    public String getuserhealth(){
        return userhealthstatus;
    }
    public double getuserage(){
        return userage;
    }
    public double getuserweight(){
        return userweight;
    }
    public double getinpercow(){
        return inperanimalprice;
    }
    public int getuserquantity(){
        return userquantity;
    }
    public int getuserAnimalname(){
        return userAnimalname;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inage = new javax.swing.JTextField();
        inweight = new javax.swing.JTextField();
        inquantity = new javax.swing.JTextField();
        Add_cow = new javax.swing.JButton();
        Add_chicken = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        instatus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inperanimal = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Animal Addition");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age:   (In months)");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Weight:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");

        inage.setText("00");

        inweight.setText("00");

        inquantity.setText("00");

        Add_cow.setText("Add as Cow");
        Add_cow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_cowActionPerformed(evt);
            }
        });

        Add_chicken.setText("Add as Chicken");
        Add_chicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_chickenActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Health status:");

        instatus.setForeground(new java.awt.Color(102, 102, 102));
        instatus.setText("Healthy or Unhealthy");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("price per animal:");

        inperanimal.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(Add_chicken)
                        .addGap(38, 38, 38)
                        .addComponent(Add_cow))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inquantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(inweight, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inage, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inperanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(inage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(inquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inperanimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_chicken)
                    .addComponent(Add_cow))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Add_cowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_cowActionPerformed
        // TODO add your handling code here:
        userAnimalname=1;
        userage=Double.parseDouble(inage.getText());
        userweight=Double.parseDouble(inweight.getText());
        userquantity=Integer.parseInt(inquantity.getText());
        userhealthstatus=instatus.getText();
        inperanimalprice=Double.parseDouble(inperanimal.getText());
        
        
        
        
        
    }//GEN-LAST:event_Add_cowActionPerformed

    private void Add_chickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_chickenActionPerformed
        // TODO add your handling code here:
        userAnimalname=2;
        userage=Double.parseDouble(inage.getText());
        userweight=Double.parseDouble(inweight.getText());
        userquantity=Integer.parseInt(inquantity.getText());
        userhealthstatus=instatus.getText();
        inperanimalprice=Double.parseDouble(inperanimal.getText());
        
    }//GEN-LAST:event_Add_chickenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_chicken;
    private javax.swing.JButton Add_cow;
    private javax.swing.JTextField inage;
    private javax.swing.JTextField inperanimal;
    private javax.swing.JTextField inquantity;
    private javax.swing.JTextField instatus;
    private javax.swing.JTextField inweight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
