package grammer;

import java.util.Scanner;

class Orange
{
	public void Show() { System.out.println("Orange"); }
}

class Apple extends Orange
{
	public void Show() { System.out.println("Orange Apple"); }
}

class Fbox<T>{
	T item;
	public void store(T item){
		this.item = item;
	}
	public T pull () { return item; } 
}

class WildCard
{
	public static void ShowFbox(Fbox<? extends Orange> box){
		Orange or = box.pull();
		or.Show();
	}
 
public static void main(String[] args) {
		Fbox f1 = new Fbox<Orange>();
		f1.store(new Orange());
		
		Fbox f2 = new Fbox<Apple>();
		f2.store(new Apple());
		
		ShowFbox(f1);
		ShowFbox(f2);
		}
}