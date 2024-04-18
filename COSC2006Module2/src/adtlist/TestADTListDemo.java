package adtlist;

public class TestADTListDemo {

	public static void main(String[] args) {
		ADTListDemo adt = new ADTListDemo();
		
		Object one = new Object();
		Object two = new Object();
		Object three = new Object();
		Object four = new Object();
		Object five = new Object();
		Object six = new Object();
		
		
		adt.add(0, one);
		adt.add(1, two);
		adt.add(2, three);
		adt.add(3, four);
		adt.add(4, five);

		System.out.println(adt.get(1));
		
		System.out.println(adt.size());
		
		System.out.println(adt.toString());
		
		adt.add(2, six);
		
	}

}
