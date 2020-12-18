import java.util.Arrays;
import java.util.Collections;

public class calexetime {

	public static void main(String[] args) {




		Integer[] myarray = {3, 6, 2, 8, 1, 5};
		Arrays.sort(myarray);
		System.out.println(Arrays.toString(myarray));
		Arrays.sort(myarray, Collections.reverseOrder());
		System.out.println(Arrays.toString(myarray));




	}

}
