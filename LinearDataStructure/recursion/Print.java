

public class Print {
	public static void print(int count) {
		if(count==0)
			return;
		System.out.println("Hello");
		print(--count);
	}
	public static void main(String[] args) {
		print(5);
	}
}
