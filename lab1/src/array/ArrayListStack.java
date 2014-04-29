package array;

public class ArrayListStack {
	     private ArrayList als = new ArrayList();

	     public void push(Object obj) {
	         als.add(obj);
	     }
	     
	     public Object peek() {
	         return als.get(als.size());
	     }

	     public Object pop() {
	         Object obj = peek();
	         als.remove(als.size()- 1);
	         return obj;
	     }
	     @Override
	 	public String toString() {		
	 		return String.valueOf(als);
	 	}
	     public static void main(String[] args) {
		ArrayListStack als1 = new ArrayListStack();
		als1.push("11");
		als1.push("22");
		als1.push("33");
		als1.pop();
		als1.push("44");
		System.out.println(als1);
	}
}


