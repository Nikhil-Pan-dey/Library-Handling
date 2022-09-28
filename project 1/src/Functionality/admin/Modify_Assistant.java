package Functionality.admin;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class Modify_Assistant extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public void Components() {
		setVisible(true);
		
		try {
		
		javax.swing.JButton add_assistant;
	    javax.swing.JButton remove_assistant;
	    javax.swing.JButton update_assistant;
	    javax.swing.JButton list_assistant;
	    javax.swing.JLabel jLabel1;
		
		add_assistant = new javax.swing.JButton();
        remove_assistant = new javax.swing.JButton();
        update_assistant = new javax.swing.JButton();
        list_assistant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Modify Assistant");
        setBackground(new java.awt.Color(102, 102, 255));
        setFont(new java.awt.Font("Algerian", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(255, 153, 102));

        add_assistant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add_assistant.setForeground(new java.awt.Color(255, 102, 204));
        add_assistant.setText("Add Assistant");
        
        remove_assistant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        remove_assistant.setForeground(new java.awt.Color(255, 102, 204));
        remove_assistant.setText("Remove Assistant");

        update_assistant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        update_assistant.setForeground(new java.awt.Color(255, 102, 204));
        update_assistant.setText("Update Assistant");

        list_assistant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        list_assistant.setForeground(new java.awt.Color(255, 102, 204));
        list_assistant.setText("List Assistants");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("        What You Want To Do?");

        add_assistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_assistantActionPerformed(evt);
            }

        });
        remove_assistant.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		remove_assistantActionPerformed(evt);
        	}
        	
        });
        update_assistant.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		update_assistantActionPerformed(evt);
        	}
        	
        });
        list_assistant.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		list_assistantActionPerformed(evt);
        	}
        	
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(add_assistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove_assistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_assistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(list_assistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(add_assistant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(remove_assistant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(update_assistant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(list_assistant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	}
	protected void list_assistantActionPerformed(ActionEvent evt) {
		
	}

	protected void update_assistantActionPerformed(ActionEvent evt) {
		Update_Assistant updateAssistant = new Update_Assistant();
		setVisible(false);
		updateAssistant.Components();
	}

	protected void remove_assistantActionPerformed(ActionEvent evt) {
		Remove_Assistant removeAssistant = new Remove_Assistant();
		setVisible(false);
		removeAssistant.Components();
	}

	protected void add_assistantActionPerformed(ActionEvent evt) {
		Add_Assistant add_Assistant = new  Add_Assistant();
		setVisible(false);
		add_Assistant.Components();
	}
	
}
