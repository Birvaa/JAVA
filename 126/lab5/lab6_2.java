import java.util.*;
class lab6_2{
	private String author_name; 
	Book(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter author_name::");
		author_name=sc.next();
	}
	void Display(){
		System.out.println("Enter your author_name::"+author_name);

	}
}
class book_publication extends Book{
	private String title;
	book_publication(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name::");
		title=sc.next();
	}
	void Display(){
		System.out.println("Enter your title::"+title);

	}

}
class paper_publication extends Book{
	private String title;
	paper_publication(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name::");
		title=sc.next();
	}
	void Display(){
		System.out.println("Enter your title::"+title);

	}
}
public class book{
	public static void main(String[] args) {
		Book myBook=new Book();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name::");
		int temp=sc.nextInt();
		if(temp==1){
			myBook=new book_publication();
		}else if(temp==2){
			myBook=new paper_publication();
		}else{

			myBook=new Book();

		}


	}
}
