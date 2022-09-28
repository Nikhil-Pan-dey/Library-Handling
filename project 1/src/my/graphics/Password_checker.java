package my.graphics;
import javax.swing.*;
import logic.users;
public class Password_checker extends JFrame {

	private static final long serialVersionUID = 1L;
	private javax.swing.JButton submit_pc;
    private javax.swing.JButton forget;
    private javax.swing.JLabel username_label;
    javax.swing.JLabel invalid;
    private javax.swing.JLabel Password_label;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    
    String Username;
    String Password;
    Interface_Admin interface_admin=new Interface_Admin();
    Interface_Assistant interface_assistant = new Interface_Assistant();
    Interface_Students interface_students = new Interface_Students();
    users user1 = new users();
	void check_password() {
			
			java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                setVisible(true);
	            }
	        });

	        Password_label = new javax.swing.JLabel();
	        username_label = new javax.swing.JLabel();
	        jTextField1 = new javax.swing.JTextField();
	        jTextField2 = new javax.swing.JTextField();
	        submit_pc = new javax.swing.JButton();
	        forget = new javax.swing.JButton();
	        
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Authentication");
	        setBackground(new java.awt.Color(204, 204, 255));

	        username_label.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
	        username_label.setText("Enter Your Username:");

	        jTextField1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
//	        jTextField1.addActionListener(new java.awt.event.ActionListener() {
//	            public void actionPerformed(java.awt.event.ActionEvent evt) {
//	                jTextField1ActionPerformed(evt);
//	            }
//	        });

	        jTextField2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
//	        jTextField2.addActionListener(new java.awt.event.ActionListener() {
//	            public void actionPerformed(java.awt.event.ActionEvent evt) {
//	                jTextField2ActionPerformed(evt);
//	            }
//	        });
	        
	        Password_label.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
	        Password_label.setText("Enter Your Password:");

	        submit_pc.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
	        submit_pc.setForeground(new java.awt.Color(255, 102, 204));
	        submit_pc.setText("Login");
	        submit_pc.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                submit_pcActionPerformed(evt);
	            }
	        });

	        forget.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
	        forget.setText("Forgot Password");
	        forget.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                forgetActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(0, 145, Short.MAX_VALUE)
	                .addComponent(forget)
	                .addGap(155, 155, 155))
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(90, 90, 90)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(username_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(Password_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addGap(42, 42, 42)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,100, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(177, 177, 177)
	                        .addComponent(submit_pc)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(55, 55, 55)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(username_label)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(29, 29, 29)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Password_label)
	                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(24, 24, 24)
	                .addComponent(submit_pc)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(forget)
	                .addContainerGap(96, Short.MAX_VALUE))
	        );

	        pack();
	    }                  

	    private void submit_pcActionPerformed(java.awt.event.ActionEvent evt) {    //button 8 is submit button
	    	boolean result=true;
	    	Username = jTextField1.getText();
	    	Password = jTextField2.getText();
	    	switch (NewJFrame.temp) {
	    	case "Login As Library Admin":
	    		result = user1.Login_Admin(Username,Password);
	    		break;
	    	case "Login As Library Assistant":
	    		result = user1.Login_Assistant(Username,Password);
	    		break;
	    	case "Login As Student":
	    		result = user1.Login_Students(Username,Password);
	    		break;
	    	
	    	}
	    	if(result==true) {
	    		switch (NewJFrame.temp) {
		    	case "Login As Library Admin":
		    		setVisible(false);
		    		interface_admin.Components();
		    		break;
		    	case "Login As Library Assistant":
		    		setVisible(false);
		    		interface_assistant.Components();
		    		break;
		    	case "Login As Student":
		    		setVisible(false);
		    		interface_students.Components();
		    		break;
		    	
		    	}
	    	}else {
	    		jTextField1.setText(null);
	    		jTextField2.setText(null);
	    		invalid = new JLabel("Username or Password is invalid!");
	    		invalid.setBounds(112, 230, 250, 20);
	    		add(invalid);
//	    		check_password();
	    	}
	    	
//	    	while(result==false){
//	    		jTextField1.setText(null);
//	    		jTextField2.setText(null);
//	    		JLabel label4 = new JLabel("Username or Password is invalid!");
//	    		label4.setBounds(112, 230, 250, 20);
//	    		add(label4);
//	    		
//	    	}
	    	
	    }                                        


	    private void forgetActionPerformed(java.awt.event.ActionEvent evt) {   // button 9 is forget button
	    	
	    }                                        
	   
//	    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) { 
//	    	jTextField1.setBounds(250, 100, 250, 20);
//	    }                                           
//
//	    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
//	    }                                           
	}

