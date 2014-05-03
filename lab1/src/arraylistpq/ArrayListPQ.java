package arraylistpq;

import array.ArrayList;

public class ArrayListPQ {
	
	private int Maxindex = 0;
	ArrayList arl = new ArrayList();
	
public void enqueue(Object obj){
	arl.add(obj);
}
public Object dequeue(){
	Object a=arl.get(maxIndex());
	arl.remove(maxIndex());
	return a;
}
public int maxIndex(){
	int max = 0;
    for (int i = 0; i < arl.size(); i++) {
              Comparable d = (Comparable) arl.get(i);
              Object maxObj = arl.get(max);
              if (d.compareTo(maxObj) > 0) {
                         max = i;
              }
    }
    return max;

}
@Override
public String toString() {
	
	return String.valueOf(arl);
}
	
}
