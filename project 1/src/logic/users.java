package logic;
import java.sql.SQLException;
import java.util.Scanner;
public class users extends connection{
	Scanner scan =new Scanner(System.in);
	String St_UName;
//	void ask_username() {
//		System.out.println("Press 1 to enter as Library Admin");
//		System.out.println("Press 2 to enter as Library Assistant");
//		System.out.println("Press 3 to enter as Student");
//		System.out.println("press 0 to exit");
//		int a=scan.nextInt();
//		switch(a) {
//			case 0:
//				System.out.println("Thanks for visiting come again soon!");
//				break;
//			case 1:
//				Login_Admin();
//				break;
//			case 2:
//				Login_Assistant();
//				break;
//			case 3:
//				Login_Students();
//				break;
//			default:
//				System.out.println("You entered wrong choice");
//				ask_username();
//			break;
//			}
//		}

	public boolean Login_Admin(String username1,String password1) {
		making_connection();
//		System.out.println("Enter your username: ");
//		String username1 = scan.next();
//		System.out.println("Enter your password: ");
//		String password1 = scan.next();
		int i =0;
		try {
			pst = con.prepareStatement("Select * from password where username = ? and password=? and designation = 'Admin'");
			pst.setString(1, username1);
			pst.setString(2, password1);
			rs=pst.executeQuery();
			if(rs.next()==false) {
				i=1;
//				System.out.println("Username or password is wrong");
//				System.out.println("To reEnter the username press 1 to exit press 2");
//				int choice = scan.nextInt();
//				switch (choice) {
//				case 1:
//					Login_Admin(username1, password1);
//					break;
//				case 2:
//					System.out.println("Thanks for visiting come again soon!");
//					System.exit(0);
//				}
			}else {
				do{
					if(rs.getString(1).equals(username1) && rs.getString(2).equals(password1)) {
						i=2;
//						inter.admin_interface();
					}else {
						i=1;
//						System.out.println("Username or password is wrong");
//						System.out.println("To reEnter the username press 1 to exit press 2");
//						int choice = scan.nextInt();
//						switch (choice) {
//						case 1:
//							Login_Admin(username1,password1);
//							break;
//						case 2:
//							System.out.println("Thanks for visiting come again soon!");
//							System.exit(0);
//						}
					}
				}while(rs.next()) ;
			}
			
			
			
			}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		if(i==1) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean Login_Assistant(String username1,String password1) {
		making_connection();
		int i=0;
//		System.out.println("Enter your username: ");
//		String username1 = scan.next();
//		System.out.println("Enter your password: ");
//		String password1 = scan.next();
		try {
			pst = con.prepareStatement("Select * from password where username = ? and password=? and designation = 'Assistant'");
			pst.setString(1, username1);
			pst.setString(2, password1);
			rs=pst.executeQuery();
			if(rs.next()==false) {
				i=1;
//				System.out.println("Username or password is wrong");
//				System.out.println("To reEnter the username press 1 to exit press 2");
//				int choice = scan.nextInt();
//				switch (choice) {
//				case 1:
//					Login_Assistant();
//					break;
//				case 2:
//					System.out.println("Thanks for visiting come again soon!");
//					System.exit(0);
//				}
			}else {
				do{
					if(rs.getString(1).equals(username1) && rs.getString(2).equals(password1)) {
						i=2;
//						inter.assistant_interface();
					}else {
						i=1;
//						System.out.println("Username or password is wrong");
//						System.out.println("To reEnter the username press 1 to exit press 2");
//						int choice = scan.nextInt();
//						switch (choice) {
//						case 1:
//							Login_Assistant();
//							break;
//						case 2:
//							System.out.println("Thanks for visiting come again soon!");
//							System.exit(0);
//						}
					}
				}while(rs.next()) ;
			}
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(i==1) {
			return false;
		}else {
			return true;
		}
	}
	public boolean Login_Students(String username1,String password1) {  
		making_connection();
		int i=0;
//			System.out.println("Enter your username: ");
//			St_UName = scan.next();
//			System.out.println("Enter your password: ");
//			String password1 = scan.next();
			try {
				pst = con.prepareStatement("Select * from student_password where username = ? and password =?");
				pst.setString(1, username1);
				pst.setString(2, password1);
				rs=pst.executeQuery();
				if(rs.next()==false) {
					i=1;
//					System.out.println("Username or password is wrong");
//					System.out.println("To reEnter the username press 1 to exit press 2");
//					int choice = scan.nextInt();
//					switch (choice) {
//					case 1:
//						Login_Students();
//						break;
//					case 2:
//						System.out.println("Thanks for visiting come again soon!");
//						System.exit(0);
//					}
				}else {
					do{
						if(rs.getString(1).equals(username1) && rs.getString(2).equals(password1)) {
							i=2;
//							inter.Student_interface();
						}else {
							i=1;
//							System.out.println("Username or password is wrong");
//							System.out.println("To reEnter the username press 1 to exit press 2");
//							int choice = scan.nextInt();
//							switch (choice) {
//							case 1:
//								Login_Students();
//								break;
//							case 2:
//								System.out.println("Thanks for visiting come again soon!");
//								System.exit(0);
//							}
						}
					}while(rs.next()) ;
				}
			}catch(Exception e) {
				System.out.println("Exception Occured");
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(i==1) {
				return false;
			}else {
				return true;
			}
	}
	
}