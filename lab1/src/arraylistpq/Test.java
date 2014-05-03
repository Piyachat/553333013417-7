package arraylistpq;

public class Test {

	public static void main(String[] args) {
	ArrayListPQ arlq = new ArrayListPQ();
	arlq.enqueue(1);
	arlq.enqueue(15);
	arlq.enqueue(8);
	arlq.enqueue(10);
	arlq.enqueue(2);
	arlq.enqueue(5);
	System.out.println(arlq.dequeue());
	System.out.println(arlq);
	
	}


}
