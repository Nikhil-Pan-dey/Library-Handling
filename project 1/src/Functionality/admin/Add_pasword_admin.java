package Functionality.admin;

import java.sql.SQLException;

import javax.swing.*;

import logic.connection;

public class Add_pasword_admin extends JFrame {
    
	connection ConnectionObj = new connection();
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton submit_password1;
	private javax.swing.JLabel enter_password1;
	private javax.swing.JPasswordField jPasswordField11;
	
    public void initComponents() {
    	setVisible(true);
        
        enter_password1 = new javax.swing.JLabel();
        submit_password1 = new javax.swing.JButton();
        jPasswordField11 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enter_password1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        enter_password1.setText("Enter Password for employee");
        enter_password1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        submit_password1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit_password1.setText("Submit");
        submit_password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_passwordActionPerformed(evt);
            }
        });

        jPasswordField11.setText(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(submit_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enter_password1)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPasswordField11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(enter_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submit_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }                   

    public void submit_passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	char[] Password_field  = jPasswordField11.getPassword();
    	int b=0;
    	try {
    	ConnectionObj.making_connection();
    	ConnectionObj.pst = ConnectionObj.con.prepareStatement("Insert into password values(?,?,'Assistant');");
		ConnectionObj.pst.setString(1, Add_Assistant.Username);
		ConnectionObj.pst.setString(2,String.valueOf(Password_field));
		b=ConnectionObj.pst.executeUpdate();
    	} catch (SQLException e) {
			e.printStackTrace();
		}  
		if(b>0) {
			System.out.println("Data Inserted Successfully");
			remove(submit_password1);
			JLabel label2=new JLabel("Data Inserted Successfully");
			label2.setBounds(200, 200, 60, 20);
			add(label2);
		
		}else {
			
		}
    }                                        
}