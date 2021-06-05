package Day5;

import java.util.ArrayList;

public class LambdaFunction {

	public static void main(String[] args) {
	
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add("Sahil");
			arrayList.add("Suyesh");
			arrayList.add("Suyesh2");
			arrayList.add("Suyesh3");
			arrayList.add(2, "Some Name"); // inserting element in between 2 elements

			ArrayList<String> arrayList2 = new ArrayList<>();
			
			arrayList.forEach((word) -> {
				if(word.contains("Suyesh"))
					arrayList2.add(word);
				}
			);
			
			arrayList2.forEach((word) -> System.out.println(word));

	}

}
