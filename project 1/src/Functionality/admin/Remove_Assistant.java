package Functionality.admin;

import javax.swing.*;

import logic.connection;

public class Remove_Assistant extends JFrame {
	/**
	 * 
	 */
	connection ConnectionObj = new connection();
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton submit;
    private javax.swing.JLabel Enter_id;
    private javax.swing.JTextField jTextField1;
	public void Components() {
		setVisible(true);
        Enter_id = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Enter_id.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Enter_id.setText("Enter the id of the employee to delete his/her data");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Enter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Enter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(submit)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
	}
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {   
    	try {
    	ConnectionObj.making_connection();
    	int id1 = Integer.valueOf(jTextField1.getText());
    	ConnectionObj.pst = ConnectionObj.con.prepareStatement("delete from employees where id= ?");
    	ConnectionObj.pst.setInt(1, id1);
		int c = ConnectionObj.pst.executeUpdate();
		System.out.println(c+ " rows affected");
		JLabel label1 = new JLabel("data deleted successfully");
		label1.setBounds(100, 100, 70, 20);
		add(label1);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }                                        

}


