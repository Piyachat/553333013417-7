package implement_comparable;

import java.util.Arrays;
public class TestCall {

	
	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("TOYOTA","Ã¶à¡ë§",530000),
				new Car("ISUZU","¡ÃÐºÐ",800000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));
}
}