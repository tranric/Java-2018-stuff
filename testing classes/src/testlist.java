
import java.util.*;

public class testlist {





	public static void main(String[] args) {

		List<String> colours = new LinkedList();

		colours.add("Red");
		colours.add("Green");
		colours.add("Blue");
		colours.add("White");
		((LinkedList<String>) colours).addFirst("Green");

		System.out.println(colours);

		colours.add(2, "Yellow");

		System.out.println(colours);

		List<String> list2 = new LinkedList();
		list2.add("3");
		list2.add("5");

		colours.addAll(3, list2);

		System.out.println(colours);
		System.out.println(colours.lastIndexOf("Green"));
		colours.remove("Green");
		System.out.println(colours);
		colours.remove(3);
		System.out.println(colours);
		String[] colourArray= colours.toArray(new String[colours.size()]);

		System.out.println("From Array: " + Arrays.toString(colourArray));
		System.out.println(colourArray[2]);
		List<String> newlist = new ArrayList(Arrays.asList(colourArray));
		System.out.println(newlist);
		newlist.add("Canada");
		System.out.println(newlist);



		Iterator<String> it = colours.iterator();

		it.next();
		it.remove();

		while(it.hasNext()){
			System.out.println(it.next());


		}

		System.out.println("\nbork9\n");


		ListIterator<String> lit = colours.listIterator(colours.size());
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}



		System.out.println("\nbork\n");

		Stack<String> colourStack = new Stack();
		Iterator<String> it2 = colours.iterator();

		while(it2.hasNext()){
			colourStack.push(it2.next());

		}

		System.out.println(colourStack.pop());
		System.out.println(colourStack.peek());
		System.out.println(colourStack.search("Green"));
		// if result is -1 then it is not in the stack
		//otherwise it returns the position of the found element of the stack









	}



}
