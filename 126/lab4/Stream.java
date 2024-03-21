public class  Stream{
	public static void main(String[] args) {
		String a="stream";
		int i,j;
		for(i=0;i<=(a.length()-1);i++){
			for(j=0;j<=i;j++){
				System.out.print(a.charAt(j));
			}
			System.out.println();
		}
	}
}