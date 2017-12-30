package test;

class Sum{
	int num;
	public Sum() { num=0; }
	public void addNum(int n){ num+=n; }
	public int getNum(){ return num; }
}
class AddThread extends Thread
{
	Sum sumInst;
	int start, end;
	
	public AddThread(Sum sum,int start,int end){
		
		sumInst = sum;
		this.start=start;
		this.end=end;
	}
	public void run(){
		for(int i=start ; i<=end; i++){
			sumInst.addNum(i);
		}
	}
}
class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		
		Sum s = new Sum();
		AddThread a1 = new AddThread(s, 1, 10);
		AddThread a2 = new AddThread(s, 11, 20);
		
		a1.start();
		a2.start();
		
		try{
			a1.join();
			a2.join();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Sum of 1 to 20: "+s.getNum());
	}	
}
