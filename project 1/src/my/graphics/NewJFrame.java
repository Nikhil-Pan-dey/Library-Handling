package my.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class NewJFrame extends javax.swing.JFrame  {
	
//		Interface_Admin obj = new Interface_Admin();
		Password_checker check = new Password_checker();
		 private javax.swing.JButton admin;
		 private javax.swing.JButton assistant;
		 private javax.swing.JButton student;
		 static String temp;
//		 private JLabel l;
//	    public NewJFrame() {
//	        initComponents();
//	    }

	        public void initComponents() {
	        	java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                setVisible(true);
		            }
		        });
	        	
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setTitle("Online Library");
	        setBackground(new Color(153, 255, 204));
	        setForeground(new Color(0, 153, 255));
	        
//	        l = new JLabel("Welcome To The Library");
//	        l.setBounds(425, 150, 50, 20);
//	        add(l);

	        admin = new JButton();
	        assistant = new JButton();
	        student = new JButton();
	        
	        admin.setBounds(100, 100, 100, 100);
	        assistant.setBounds(100, 100, 100, 100);
	        student.setBounds(100, 100, 100, 100);
	        
	        
	        admin.setFont(new Font("Arial Narrow", 1, 16));
	        admin.setForeground(new Color(255, 0, 51));
	        admin.setText("Login As Library Admin");
	        
	        assistant.setFont(new Font("Arial Narrow", 1, 16)); 
	        assistant.setForeground(new Color(255, 0, 51));
	        assistant.setText("Login As Library Assistant");
	        
	        student.setFont(new java.awt.Font("Arial Narrow", 1, 16)); 
	        student.setForeground(new Color(255, 0, 51));
	        student.setText("Login As Student");
	        
	        
	        add(admin);
	        add(assistant);
	        add(student);
	        
	        
	        admin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                setVisible(false);
	                temp=admin.getText();
	                check.check_password();
	                
	            }
	        });
	        
	        assistant.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	setVisible(false);
	                temp=assistant.getText();
	                check.check_password();
	            }
	        });

	        
	        student.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	setVisible(false);
	                temp=student.getText();
	                check.check_password();
	            }
	        });

	        GroupLayout layout = new GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(24, 24, 24)
	                .addComponent(admin)
	                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(assistant)
	                .addGap(24, 24, 24))
	            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(student)
	                .addGap(145, 145, 145))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(81, 81, 81)
	                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                    .addComponent(admin, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
	                    .addComponent(assistant, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
	                .addGap(37, 37, 37)
	                .addComponent(student, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(98, Short.MAX_VALUE))
	        );

	        pack();
	    }                                                               
//
//	    public static void main(String args[]) {
//	        
//	        try {
//	            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//	                if ("Nimbus".equals(info.getName())) {
//	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//	                    break;
//	                }
//	            }
//	        } catch (Exception ex) {
//	        	ex.printStackTrace();
//	        }
//	        
//	        java.awt.EventQueue.invokeLater(new Runnable() {
//	            public void run() {
//	                new NewJFrame().setVisible(true);
//	            }
//	        });
//	    }

	    // Variables declaration - do not modify                     
	   
	    // End of variables declaration                   
	}


