package grammer;

class WrapperClass_Reference {
	public static void main(String args[]) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		CheckInst(num1,num2); //different Inst
		
		Integer num3 = Integer.valueOf(10);
		Integer num4 = Integer.valueOf(10);
		CheckInst(num3,num4); //same Inst
	}
	public static void CheckInst(Object num1, Object num2 ){
		if(num1==num2){
			System.out.println("Refer Same Inst");
		}
		else
			System.out.println("Refer Different Inst");
	}
}