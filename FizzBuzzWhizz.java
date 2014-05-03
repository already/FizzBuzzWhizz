public class FizzBuzzWhizz {
	public static String[] s = {"Fizz","Buzz","Whizz"};
	public static void main(String[] args) {
		print(new int[]{3,5,7});
	}
	
	public static void print(int[] a){
		if(!(a.length==3&&a[0] != a[1] && a[0]!=a[2] && a[1] != a[2]
		    && a[0] > 0 && a[1] > 0 && a[2] > 0&& a[0] < 10 && a[1] < 10 && a[2] < 10)){
			throw new IllegalArgumentException("argument is illegal.");}
		else{
			for(int i=1;i<=100;i++){
				if(!(i/100==a[0]&&print(s[0]) || i/10==a[0]&&print(s[0]) || i%10 ==a[0]&&print(s[0]) || a[0]*a[1]*a[2]==i&&print(s[0])&&print(s[1])&&print(s[2]) || a[0]*a[1]==i&&print(s[0])&&print(s[1]) || a[0]*a[2]==i&&print(s[0])&&print(s[2]) || a[1]*a[2]==i&&print(s[1])&&print(s[2]) || i%a[0]==0&&print(s[0]) || i%a[1]==0&&print(s[1]) || i%a[2]==0&&print(s[2]))){
					System.out.print(i);
				}
				System.out.println();
			}
		}	
	}
	
	public static boolean print(Object a){
		System.out.print(a);
		return true;
	}
}
