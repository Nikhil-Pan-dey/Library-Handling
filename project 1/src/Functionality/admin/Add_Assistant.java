package Functionality.admin;

import java.sql.Date;
import javax.swing.*;
import logic.connection;
public class Add_Assistant extends JFrame{
	connection ConnectionObj = new connection();
	static String Username;
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton submit;
    private javax.swing.JButton reset;
    private javax.swing.JLabel details;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JLabel designationLabel;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel dojLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JTextField AgeTF;
    private javax.swing.JTextField contactTF;
    private javax.swing.JTextField designationTF;
    private javax.swing.JTextField dobTF;
    private javax.swing.JTextField dojTF;
    private javax.swing.JTextField usernameTF;
	
    void Components() {
    	setVisible(true);

        details = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ContactLabel = new javax.swing.JLabel();
        designationLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        dojLabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        AgeTF = new javax.swing.JTextField();
        contactTF = new javax.swing.JTextField();
        designationTF = new javax.swing.JTextField();
        dobTF = new javax.swing.JTextField();
        dojTF = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        details.setBackground(new java.awt.Color(204, 255, 204));
        details.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        details.setForeground(new java.awt.Color(0, 102, 204));
        details.setText("Enter Details Of Assistant");

        nameLabel.setBackground(new java.awt.Color(204, 255, 204));
        nameLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 102, 204));
        nameLabel.setText("Enter Assistant name ");

        idLabel.setBackground(new java.awt.Color(204, 255, 204));
        idLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 102, 204));
        idLabel.setText("Enter Assistant id ");

        ageLabel.setBackground(new java.awt.Color(204, 255, 204));
        ageLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 102, 204));
        ageLabel.setText("Enter Assistant Age");

        ContactLabel.setBackground(new java.awt.Color(204, 255, 204));
        ContactLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        ContactLabel.setForeground(new java.awt.Color(0, 102, 204));
        ContactLabel.setText("Enter Contact Number ");

        designationLabel.setBackground(new java.awt.Color(204, 255, 204));
        designationLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        designationLabel.setForeground(new java.awt.Color(0, 102, 204));
        designationLabel.setText("Enter Designation");

        dobLabel.setBackground(new java.awt.Color(204, 255, 204));
        dobLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(0, 102, 204));
        dobLabel.setText("Date of Birth");

        dojLabel.setBackground(new java.awt.Color(204, 255, 204));
        dojLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        dojLabel.setForeground(new java.awt.Color(0, 102, 204));
        dojLabel.setText("Date of joining");

        nameTF.setBackground(new java.awt.Color(204, 255, 204));
        nameTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        nameTF.setForeground(new java.awt.Color(0, 102, 204));
//        nameTF.setText("nameTF");

        idTF.setBackground(new java.awt.Color(204, 255, 204));
        idTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        idTF.setForeground(new java.awt.Color(0, 102, 204));
//        idTF.setText("idTF");

        AgeTF.setBackground(new java.awt.Color(204, 255, 204));
        AgeTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        AgeTF.setForeground(new java.awt.Color(0, 102, 204));
//        AgeTF.setText("AgeTF");

        contactTF.setBackground(new java.awt.Color(204, 255, 204));
        contactTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        contactTF.setForeground(new java.awt.Color(0, 102, 204));
//        contactTF.setText("contactTF");

        designationTF.setBackground(new java.awt.Color(204, 255, 204));
        designationTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        designationTF.setForeground(new java.awt.Color(0, 102, 204));
//        designationTF.setText("designationTF");

        dobTF.setBackground(new java.awt.Color(204, 255, 204));
        dobTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        dobTF.setForeground(new java.awt.Color(0, 102, 204));
//        dobTF.setText("dobTF");

        dojTF.setBackground(new java.awt.Color(204, 255, 204));
        dojTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        dojTF.setForeground(new java.awt.Color(0, 102, 204));
//        dojTF.setText("dojTF");

        usernameLabel.setBackground(new java.awt.Color(204, 255, 204));
        usernameLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 102, 204));
        usernameLabel.setText("Enter Username ");

        usernameTF.setBackground(new java.awt.Color(204, 255, 204));
        usernameTF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        usernameTF.setForeground(new java.awt.Color(0, 102, 204));
//        usernameTF.setText("usernameTF");

        submit.setBackground(new java.awt.Color(102, 51, 255));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 102, 0));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(idLabel)
                    .addComponent(ageLabel)
                    .addComponent(ContactLabel)
                    .addComponent(dojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(designationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dojTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100 , javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(details)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContactLabel)
                    .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(designationLabel)
                    .addComponent(designationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobLabel)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dojLabel)
                    .addComponent(dojTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {  
    	try {
//		ConnectionObj.con.setAutoCommit(false);		//This line is changed
		
		String name=nameTF.getText();
		int id= Integer.valueOf(idTF.getText());
		int age = Integer.valueOf(AgeTF.getText()) ;
		long number=Long.valueOf(contactTF.getText());
		String Designation=designationTF.getText();
		String SDOB = dobTF.getText();
		String SDOJ = dojTF.getText();
		Username = usernameTF.getText();
		Date sqlDob = Date.valueOf(SDOB);
		Date sqlDoj = Date.valueOf(SDOJ);

		ConnectionObj.making_connection();
		ConnectionObj.pst = ConnectionObj.con.prepareStatement("Insert into employees values (?,?,?,?,?,?,?,?)");
		ConnectionObj.pst.setString(1, name);
		ConnectionObj.pst.setInt(2, id);
		ConnectionObj.pst.setInt(3, age);
		ConnectionObj.pst.setLong(4, number);
		ConnectionObj.pst.setString(5,Designation);
		ConnectionObj.pst.setDate(6, sqlDob);
		ConnectionObj.pst.setDate(7, sqlDoj);
		ConnectionObj.pst.setString(8, Username);
		int a = ConnectionObj.pst.executeUpdate();
		if(a>0) {
		setVisible(false);
		Add_pasword_admin obj = new Add_pasword_admin();
		obj.initComponents();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
    }                                        
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        
                  
}