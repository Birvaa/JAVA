import java.util.Scanner;
class String_Vowel{
	String str;
	int count_a=0;
	int count_e=0;
	int count_i=0;
	int count_o=0;
	int count_u=0;

public void operation(){
	if(str.chatAt(i)=='a'){
		count_a++;
	}
	else if(str.chatAt(i)=='e'){
		count_e++;
	}
	else if(str.chatAt(i)=='i'){
		count_i++;
	}
	else if(str.chatAt(i)=='o'){
		count_o++;
	}
	else if(str.chatAt(i)=='u'){
		count_u++;
	}

	System.out.println("count a : "+count_a);
	System.out.println("count e : "+count_e);
	System.out.println("count i : "+count_i);
	System.out.println("count o : "+count_o);
	System.out.println("count u : "+count_u);
}

}
public class Vowel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			String_Vowel sv=new String_Vowel();

			System.out.println("Enter a sentence : ");
			String str =  sc.next();
			String str = str.toLowercase();
		}

		if(str.equals("quit")){
			break;
		}
		else{
			sv.str.oparetion();
		}
	}
}