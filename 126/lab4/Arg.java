public class Arg{
	public static void main(String[] args) {
		int length = args.length ;
		for(int i=0;i<length;i++)
		{
			if(args[i].charAt(0)>65 || args[i].charAt(0)>90 ){
			System.out.println("Error:String at is not uppercase"); 
			return;
			}
		}
		System.out.println("all have upper case");

}
}

