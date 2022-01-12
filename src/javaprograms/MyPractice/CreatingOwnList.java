package javaprograms.MyPractice;

public class CreatingOwnList {

	public static void main(String[] args) {
		DataList<Integer> list = new DataList<>();
		 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
		
//		Long l =new Long(1);
//		long l=10L;
//		Object o= l;
//		
//		if(o instanceof Long) {
//			System.out.println("Object converted to Long");
//			System.out.println("o tostring=="+o.toString());
//		}
//		else {
//			System.out.println("Object didnt converted to long");
//		}
//		

	}

}
