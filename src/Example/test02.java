package Example;

public class test02 {
	public static void main(String[] args) {
		int sum;
		
		for(int i = 1; i<10; i++) {
			for (int j = 1; j<10; j++) {
				sum = i * j;
				System.out.println(i + "*"+j+"="+sum);
				sum=0;
			}
		}
	}
}
