class AssignmentOp {
	public static void main(String[] ram){
		int x =10;
		x +=3; // 13
		x -=2; // 11
		x *=4; //44
		x /=3; //14
		x %=5; // 4
		
		System.out.println(3+x); //7
		System.out.println(2-x); //-2
		System.out.println(4*x); // 16
		System.out.println(3/x); // 0
		System.out.println(5%x); //1
	}
}	
/*
:\xxxxxxxxxxxxxxxxx>javac AssignmentOp.java

C:\xxxxxxxxxxxxxxxxx>java AssignmentOp
7
-2
16
0
1 */