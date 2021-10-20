import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int stu = 0;
String pass;
String st;
Scanner sc = new Scanner(System.in);
while(stu >9999999 || stu <= 0) {
		System.out.print("Enter your Student ID : ");
	
		try{
			stu = sc.nextInt();
		}
	catch(Exception e) {
		System.out.println("Put an integer value!");
	}
		if(stu >9999999 || stu <= 0) {
			System.out.println("Invalid");
		}
		
}
		
		System.out.println("Student ID : "+ stu);
		
		System.out.println("Enter the password : ");
		pass = sc.next();		
		
		if (pass.length() <6 || pass.length()>20 ) {
			System.exit(0);
		}
       System.out.println("Password : "+ pass);		
	  
       System.out.println("Enter any String :");
       st= sc.next();
       
       st = st.toUpperCase();
       
       System.out.println("String : "+ st);
       
	}
 
}
