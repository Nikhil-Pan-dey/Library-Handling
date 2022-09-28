package my.graphics;
import java.awt.event.ActionEvent;
import Functionality.admin.*;

import javax.swing.*;
public class Interface_Admin extends JFrame {
//	public Interface_Admin(){
//		Components();
//	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	void Components() {
		setVisible(true);
		
		try {
		
		javax.swing.JButton modify_assistant;
	    javax.swing.JButton modify_student;
	    javax.swing.JButton modify_books;
	    javax.swing.JButton issued_books;
	    javax.swing.JLabel jLabel1;
		
		modify_assistant = new javax.swing.JButton();
        modify_student = new javax.swing.JButton();
        modify_books = new javax.swing.JButton();
        issued_books = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Interface");
        setBackground(new java.awt.Color(102, 102, 255));
        setFont(new java.awt.Font("Algerian", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(255, 153, 102));

        modify_assistant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modify_assistant.setForeground(new java.awt.Color(255, 102, 204));
        modify_assistant.setText("Modify Assistants");
        
        modify_student.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modify_student.setForeground(new java.awt.Color(255, 102, 204));
        modify_student.setText("Modify Students");

        modify_books.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modify_books.setForeground(new java.awt.Color(255, 102, 204));
        modify_books.setText("Modify Books");

        issued_books.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        issued_books.setForeground(new java.awt.Color(255, 102, 204));
        issued_books.setText("See Issued Books");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("        What You Want To Do?");

        modify_assistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_assistantActionPerformed(evt);
            }

        });
        modify_student.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		modify_studentActionPerformed(evt);
        	}
        	
        });
        modify_books.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		modify_booksActionPerformed(evt);
        	}
        	
        });
        issued_books.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		issued_booksActionPerformed(evt);
        	}
        	
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(modify_assistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modify_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modify_books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(issued_books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(modify_assistant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(modify_student, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(modify_books, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(issued_books, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	}
	protected void issued_booksActionPerformed(ActionEvent evt) {
		
	}

	protected void modify_booksActionPerformed(ActionEvent evt) {
		
	}

	protected void modify_studentActionPerformed(ActionEvent evt) {
		
	}

	protected void modify_assistantActionPerformed(ActionEvent evt) {
		Modify_Assistant modify_assistant = new Modify_Assistant();
		setVisible(false);
		modify_assistant.Components();
	}

	
	
	}
	
