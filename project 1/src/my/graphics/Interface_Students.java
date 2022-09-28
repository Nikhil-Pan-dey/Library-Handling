package my.graphics;

import javax.swing.*;

public class Interface_Students extends JFrame{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private javax.swing.JButton Issue_books;
	    private javax.swing.JButton return_books;
	    private javax.swing.JButton book_list;
	    private javax.swing.JLabel jLabel1;

	public void Components() {
		setVisible(true);
		
		jLabel1 = new javax.swing.JLabel();
        Issue_books = new javax.swing.JButton();
        return_books = new javax.swing.JButton();
        book_list = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(153, 255, 204));
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel1.setText("                   What You Want to do?");

        Issue_books.setBackground(new java.awt.Color(153, 255, 204));
        Issue_books.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        Issue_books.setText("Issue Books");
        Issue_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Issue_booksActionPerformed(evt);
            }
        });

        return_books.setBackground(new java.awt.Color(153, 255, 204));
        return_books.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        return_books.setText("Return Books");
        return_books.setPreferredSize(new java.awt.Dimension(91, 22));
        return_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_booksActionPerformed(evt);
            }
        });

        book_list.setBackground(new java.awt.Color(153, 255, 204));
        book_list.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        book_list.setText("List of Issued Books To You");
        book_list.setPreferredSize(new java.awt.Dimension(91, 22));
        book_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_listActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(book_list, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(return_books, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Issue_books, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(Issue_books, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(return_books, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(book_list, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
		
	}
    
    private void Issue_booksActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    }                                        

    private void return_booksActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    }                                        

    private void book_listActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    }                                        
}