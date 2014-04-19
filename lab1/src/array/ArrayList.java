package array;
public class ArrayList {
	private Object data[]=new Object[1];
	private int size=0;
	
	
	public void add(Object obj){
		add(size,obj);
	}
	public void add(int i,Object obj){
		ensureCapacity(size+ 1);
		for(int j = size-1; j >= i; j--) {
		data[j + 1] = data[j];
		}
		data[i] = obj;
		size++;	
	}
	
	public void ensureCapacity(int capacity){
		if(capacity > data.length) {
			int s = 2 * data.length;
			Object[] arr= new Object[s];
			for(int i = 0; i < size; i++) {
			arr[i] = data[i];
			}
			data= arr;
			}
			}
	
	public void remove(int i){
		for(int j = i; j < size-1; j++) {
			data[j] = data[j + 1];
			}
			data[size-1] = null;
		
	}
	public void addFirst(Object obj){
		add(0,obj);	
	}
	public void addLast(Object obj){
		add(size,obj);
}
	public static void main(String[] args){
		ArrayList num =new ArrayList();
		num.add("a");
		num.add("b");
		num.add("c");
		num.add("d");
		num.add("e");
		num.add("f");
		num.add("g");
		System.out.println(num);
		
	}
	public String toString() { 
		String mem = "[";
		for (int i = 0; i < size; i++) {			
			if(i == size-1){
				mem = mem+data[i]+"]";
			}else{
				mem = mem+data[i]+",";
			}
		}
		return mem;
		 }
}