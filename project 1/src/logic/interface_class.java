package logic;
import java.sql.Date;
import java.util.Scanner;
public class interface_class extends users {
	Scanner scan = new Scanner(System.in);
//	void admin_interface() {
//		System.out.println("Welcome to Admin Interface");
//		System.out.println("1. Modify Assistant");
//		System.out.println("2. Modify Students");
//		System.out.println("3. Modify books");
//		System.out.println("4. See issued books");
//		int choice= scan.nextInt();
//		switch (choice) {
//			case 1:
//				Modify_Assistant();
//				break;
//			case 2:
//				Modify_students();
//				break;
//			case 3:
//				Modify_books();
//				break;
//			case 4:
//				Issued_books();
//				break;
//			default:
//				System.out.println("Wrong choice");
//				admin_interface();
//		}
//	}
	
//	void assistant_interface() {
//		System.out.println("Welcome to Assistant Interface");
//		System.out.println("1. Modify Students");
//		System.out.println("2. Modify books");
//		System.out.println("3. Issue a book to student");
//		System.out.println("4. See list of Issued Books");
//		int choice= scan.nextInt();
//		switch (choice) {
//			case 1:
//				Modify_students();
//				break;
//			case 2:
//				Modify_books();
//				break;
//			case 3:
//				LocalDate DOI=java.time.LocalDate.now();
//				Date SDOI = Date.valueOf(DOI);
//				LocalDate DOR = DOI.plusDays(15);
//				Date SDOR=Date.valueOf(DOR);
//				String Book_name=null;
//				String Student_name=null;
//				System.out.println("Enter the Book_ID: ");
//				int Book_id = scan.nextInt();
//				System.out.println("Enter the student_Id");
//				int Student_id = scan.nextInt();
//				try {		
//					rs=null;
//					pst = con.prepareStatement("Select * from availablebooks where book_id=?");
//					pst.setInt(1, Book_id);
//					rs = pst.executeQuery();
//					if(rs.next()==false) {
//						System.out.println("Book is not available");
//						System.exit(0);
//					}else {
//						do{
//							Book_id=rs.getInt(1);
//							Book_name = rs.getString(2);
//						}while(rs.next());
//					}
//					rs=null;
//					pst = con.prepareStatement("Select * from students where ID =?");
//					pst.setInt(1, Student_id);
//					rs = pst.executeQuery();
//					if(rs.next()==false) {
//						System.out.println("Students Id is wrong");
//						System.exit(0);
//					}else {
//						do {
//							Student_id = rs.getInt(2);
//							Student_name = rs.getString(1);
//						}while(rs.next());
//					}
//					pst=con.prepareStatement("Insert into issue_table values(?,?,?,?,?,?)");
//					pst.setInt(1, Book_id);
//					pst.setString(2, Book_name);
//					pst.setInt(3, Student_id);
//					pst.setString(4, Student_name);
//					pst.setDate(5, SDOI);
//					pst.setDate(6, SDOR);
//					int a=pst.executeUpdate();
//					System.out.println(a+" rows affected");
//					pst = con.prepareStatement("delete from availablebooks where book_id=?");
//					pst.setInt(1, Book_id);
//					int b= pst.executeUpdate();
//					System.out.println(b+" rows affected");
//				}catch(Exception e) {
//					System.out.println(e);
//					e.printStackTrace();
//				}
//				break;
//			case 4:
//				Issued_books();
//				break;
//			default:
//				System.out.println("Wrong choice");
//			assistant_interface();
//		}
//		
//	}
//	void Student_interface() {
//		System.out.println("Welcome to student interface");
//		System.out.println("1. Issue books");
//		System.out.println("2. Return Books");
//		System.out.println("3. list of issued books to you");
//		int choice= scan.nextInt();
//		switch (choice) {
//			case 1:
//				LocalDate DOI=java.time.LocalDate.now();
//				Date SDOI = Date.valueOf(DOI);
//				LocalDate DOR = DOI.plusDays(15);
//				Date SDOR=Date.valueOf(DOR);
//				String Book_name=null;
//				String Student_name=null;
//				System.out.println("Enter the Book_ID: ");
//				int Book_id = scan.nextInt();
//				int Student_id=-1;
//				try {
//					rs=null;
//					pst = con.prepareStatement("Select * from availablebooks where book_id=?");
//					pst.setInt(1, Book_id);
//					rs = pst.executeQuery();
//					if(rs.next()==false) {
//						System.out.println("Book is not available");
//						System.exit(0);
//					}else {
//						do{
//							Book_id=rs.getInt(1);
//							Book_name = rs.getString(2);
//						}while(rs.next());
//					}
//					rs=null;				
//					pst = con.prepareStatement("Select * from students where username=?");
//					pst.setString(1, user1.St_UName);
//					rs = pst.executeQuery();
//					if(rs.next()==false) {
//						System.out.println("Students Id is wrong");
//						System.exit(0);
//					}else {
//						do {
//							Student_id = rs.getInt(2);
//							Student_name = rs.getString(1);
//						}while(rs.next());
//					}
//					pst=con.prepareStatement("Insert into issue_table values(?,?,?,?,?,?)");
//					pst.setInt(1, Book_id);
//					pst.setString(2, Book_name);
//					pst.setInt(3, Student_id);
//					pst.setString(4, Student_name);
//					pst.setDate(5, SDOI);
//					pst.setDate(6, SDOR);
//					int a=pst.executeUpdate();
//					System.out.println(a+" rows affected");
//					pst = con.prepareStatement("delete from availablebooks where book_id=?");
//					pst.setInt(1, Book_id);
//					int b= pst.executeUpdate();
//					System.out.println(b+" rows affected");
//				}catch(Exception e) {
//					System.out.println(e);
//					e.printStackTrace();
//				}
//				break;
//			case 2:
//				System.out.println("Enter the book id to return it");
//				Book_id= scan.nextInt();
//				try {
//					String book_name=null;
//					pst = con.prepareStatement("Select * from issue_table where book_id=?");
//					pst.setInt(1, Book_id);
//					rs= pst.executeQuery();
//					while(rs.next()) {
//					book_name = rs.getString(2);
//					}
//					pst = con.prepareStatement("delete from issue_table where book_id=?");
//					pst.setInt(1, Book_id);
//					int a= pst.executeUpdate();
//					System.out.println(a+" rows affected");
//					pst = con.prepareStatement("Insert into availablebooks values(?,?)");
//					pst.setInt(1, Book_id);
//					pst.setString(2, book_name);
//					int b = pst.executeUpdate();
//					System.out.println(b+" rows affected");
//				}catch(Exception e) {
//					System.out.println(e);
//				}
//				break;
//			case 3:
//				try {
//				pst = con.prepareStatement("Select * from issue_table where student_id=(select id from students where username=?)");
//				pst.setString(1, user1.St_UName);
//				rs= pst.executeQuery();
//				while(rs.next()) {
//					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getDate(5)+" "+rs.getDate(6));
//				}
//				}catch(Exception e)
//				{
//					System.out.println(e);
//				} 
//				break;
//			default:
//				System.out.println("Wrong choice");
//				Student_interface();	
//			}	
//	}
//	
	void Modify_Assistant() {
		try {
		System.out.println("1. Add Assistant");
		System.out.println("2. remove Assistant");
		System.out.println("3. update Assistant");
		System.out.println("4. See list of all Assistants");
		int choice=scan.nextInt();
		switch (choice) {
		case 1:
			
			System.out.println("Please enter Details of Assistant");
			System.out.println("Name: ");
			String name=scan.next();
			System.out.println("id: ");
			int id=scan.nextInt();
			System.out.println("Age: ");
			int age = scan.nextInt();
			System.out.println("Contact Number: ");
			long number=scan.nextLong();
			System.out.println("Designation: ");
			String Designation=scan.next();
			System.out.println("Date of Birth: ");
			String SDOB = scan.next();
			
			System.out.println("Date of joining: ");
			String SDOJ = scan.next();
			
			System.out.println("Username: ");
			String Username = scan.next();
			
			Date sqlDob = Date.valueOf(SDOB);
			Date sqlDoj = Date.valueOf(SDOJ);
			
			pst = con.prepareStatement("Insert into employees values (?,?,?,?,?,?,?,?)");
			pst.setString(1, name);
			pst.setInt(2, id);
			pst.setInt(3, age);
			pst.setLong(4, number);
			pst.setString(5,Designation);
			pst.setDate(6, sqlDob);
			pst.setDate(7, sqlDoj);
			pst.setString(8, Username);
			int a= pst.executeUpdate();
			System.out.println(a+" rows affected");
			
			System.out.println("Enter Password for employee");
			String Password = scan.next();
			pst = con.prepareStatement("Insert into password values(?,?,'Assistant');");
			pst.setString(1, Username );
			pst.setString(2, Password );
			
			int b= pst.executeUpdate();
			System.out.println(b+" rows affected");
			break;
		case 2:
			System.out.println("Enter the id of the employee to delete his/her data");
			int id1 = scan.nextInt();
			pst = con.prepareStatement("delete from employees where id= ?");
			pst.setInt(1, id1);
			int c = pst.executeUpdate();
			System.out.println(c+ " rows affected");
			break;
		case 3:
			System.out.println("Fields you can update are: Name , id , age , contact_no , designation , date_of_birth, joining_date , username ");
			System.out.println("Enter the field you want to update of employee");
			String Field = scan.next();
			System.out.println("Enter the updated field");
			Object updated = scan.next();
			System.out.println("Enter the id of the employee to update his/her data");
			int id2 = scan.nextInt();
			pst = con.prepareStatement("update employees set "+Field+" = ? where id=?");
			pst.setObject(1, updated);
			pst.setInt(2, id2);
			int d = pst.executeUpdate();
			System.out.println(d + " rows affected");
			break;
		case 4:
//			System.out.println("Name ID Age    Contact No.    Designation    Date_of_Birth   Date_of _joining    username");
			pst=con.prepareStatement("Select * from employees where designation='Assistant'");
			rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getDate(6)+" "+rs.getDate(7)+" "+rs.getString(8));
			}
			break;
		default:
			System.out.println("Wrong choice");
			Modify_Assistant();
		}
		}catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
	
	void Modify_students() {
		try {
			System.out.println("1. Add Student");
			System.out.println("2. remove Student");
			System.out.println("3. update Student");
			System.out.println("4. See list of all Student");
			int choice=scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please enter Details of Student");
				System.out.println("Name: ");
				String name=scan.next(); 
				System.out.println("id: ");
				int id=scan.nextInt();
				System.out.println("Contact Number: ");
				long number=scan.nextLong();
				System.out.println("Department: ");
				String Department=scan.next();
				System.out.println("Date of Birth: ");
				String SDOB = scan.next();
				System.out.println("Username: ");
				String Username = scan.next();

				Date sqlDob = Date.valueOf(SDOB);
				pst = con.prepareStatement("insert into students values(?,?,?,?,?,?);");
				pst.setString(1, name);
				pst.setInt(2, id);
				pst.setLong(3, number);
				pst.setString(4, Department);
				pst.setDate(5, sqlDob);
				pst.setString(6, Username);
				int a= pst.executeUpdate();
				System.out.println(a+" rows affected");
				
				System.out.println("Enter Student password: ");
				String password = scan.next();
				pst = con.prepareStatement("insert into student_password values (?,?);");
				pst.setString(1, Username);
				pst.setString(2, password);
				int b = pst.executeUpdate();
				System.out.println(b+" rows affected");
				break;
			case 2:
				System.out.println("Enter the id of student to delete his/her data");
				int id1 = scan.nextInt();
				pst = con.prepareStatement("delete from students where id =?");
				pst.setInt(1, id1);
				int c=pst.executeUpdate();
				System.out.println(c+" rows affected");
				break;
			case 3: 
				System.out.println("Fields you can update are: Name , id , contact_no , department , date_of_birth, username ");
				System.out.println("Enter the field you want to update of student");
				String Field = scan.next();
				System.out.println("Enter the updated field");
				Object updated = scan.next();
				System.out.println("Enter the id of student to update his/her data");
				int id3=scan.nextInt();
				pst = con.prepareStatement("update students set "+Field+" = ? where id=?");
				pst.setObject(1, updated);
				pst.setInt(2, id3);
				int d= pst.executeUpdate();
				System.out.println(d+" rows affected");
				break;
			case 4:
				pst = con.prepareStatement("select * from students");
				rs=pst.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getDate(5)+" "+rs.getString(6));
				}
				break;
			default:
				System.out.println("Wrong choice");
				Modify_students();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void Modify_books() {
		try {
			System.out.println("1. Add Book");
			System.out.println("2. remove Book");
			System.out.println("3. See list of all Book");
			int choice=scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter ID of book");
				int id = scan.nextInt();
				System.out.println("Enter Name of book");
				String name = scan.next();
				pst = con.prepareStatement("insert into book_list values(?,?)");
				pst.setInt(1, id);
				pst.setString(2, name);
				int a= pst.executeUpdate();
				System.out.println(a+" rows affected");

				pst = con.prepareStatement("insert into availableBooks values(?,?)");
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.executeUpdate();
				break;
			case 2:
				System.out.println("Enter ID of Book to remove it from library");
				int id1 = scan.nextInt();
				pst = con.prepareStatement("delete from availableBooks where book_id=?");
				pst.setInt(1, id1);
				int d = pst.executeUpdate();
				if(d>0) {
					System.out.println(d+" rows affected");
					pst = con.prepareStatement("delete from book_list where book_id = ?");
					pst.setInt(1, id1);
					int c = pst.executeUpdate();
					System.out.println(c+" rows affected");
				}else {
					pst = con.prepareStatement("select * from issue_table where book_id=?");
					pst.setInt(1, id1);
					rs = pst.executeQuery();
					while(rs.next()) {
						if(id1==rs.getInt(1)) {
							System.out.print("Book can not be deleted because ");
							System.out.println("Book is issued to "+rs.getString("student_name")+" with student id "+rs.getInt("student_id"));
						}
						else {
							System.out.println("You have entered wrong book id");
						}
					}
				}
				break;
			case 3:
				System.out.println("List of All Books present in Library");
				pst = con.prepareStatement("Select * from Book_list");
				rs=pst.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+ rs.getString(2));
				}
				System.out.println("List of Books available in library");
				pst = con.prepareStatement("select * from Book_list");
				rs=pst.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Wrong choice");
				Modify_books();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
}

	void Issued_books() {
		try {
		System.out.println("List of all Issued Books");
		pst = con.prepareStatement("select * from issue_table");
		rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getDate(5)+" "+rs.getDate(6));
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
