/*
Though this example, you can see that how to control execution sequence of Thread.  
*/
package test;

class NewsPaper{
	String todayNews;
	boolean isTodayNews=false;
	
	public void setTodayNews(String news){
		this.todayNews=news;
		isTodayNews = true;
		
		synchronized(this){
			notifyAll();
		}
	}
	public String getTodayNews(){
		if(isTodayNews == false){
			try{
				synchronized(this){
					wait();
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		return todayNews;
	}
}

class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper){
		this.paper=paper;
	}
	public void run(){
		paper.setTodayNews("Hellow JAVA");
	}
}

class NewsReader extends Thread{
	NewsPaper paper;
	public NewsReader(NewsPaper paper){
		this.paper=paper;
	}
	public void run(){
		System.out.println(paper.getTodayNews());
	}
}
class Synchronized_Sample {
	public static void main(String[] args) {
		NewsPaper np = new NewsPaper();
		NewsReader nr1 = new NewsReader(np);
		NewsReader nr2 = new NewsReader(np);
		NewsReader nr3 = new NewsReader(np);
		
		NewsWriter nw = new NewsWriter(np);
		
		try{
			nr1.start();
			nr2.start();
			nw.start();
		
			nr1.join();
			nr2.join();
			nw.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}	
}