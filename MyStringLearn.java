public class MyStringLearn{
	public static void main(String[] args){
	
	/*
		Shivansh in scp
		kumar in scp
		srivastava in scp
		
		shivanskumar in heap 
		shivanskumarsrivastava in heap concat method create ne object 
		
		so total 5 object
		
		nothign in heap 
		
		first op = shivansh kuamr
		second op = shivansh kumar srivastava
	*/
		String s = "Shivansh";  
		s = s.concat("Kumar");
		System.out.println(s);
		s = s.concat("Srivastava");
		System.out.println(s);
		
		
		
		String s1 = new String("Hii"); // one in heap and one in string constant pool
		String result = s1 + "hello"; // hiihello in stirng constatn pool
		System.out.println(s1); // print Hii
		s1 = s1 + "BYe"; 
		System.out.println(s1); // print hiibye
		
		/*
			hii in scp and heap
			hello in scp 
			result in heap 
			bye in scp 
			s1 in heap 
		*
		/
		
		
	}
}
