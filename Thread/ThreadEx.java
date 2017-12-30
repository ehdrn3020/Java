//Constructor and Destructor Thread example.

package test;

class Buffer {
	private String data;

	public synchronized String getData() {
		// If the data field is null, make the consumer thread paused
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String returnValue = data;
		System.out.println("Consumer: The data that thread consumes is " + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		// If the data field is not null, make the producer thread paused
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		// Store the value in the data field 
		//And make the consumer thread wait for execution
		
		this.data = data;
		System.out.println("Producer: The data that thread generates is " + data);
		notify();
	}
}// Producer thread to store data

class Producer extends Thread {
	private Buffer dataBox;

	public Producer(Buffer dataBox) {
		this.dataBox = dataBox; // Save shared objects
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			String data = i + ".";
			dataBox.setData(data); // Store new data
		}
	}
}

class Consumer extends Thread {
	private Buffer dataBox;

	public Consumer(Buffer dataBox) {
		this.dataBox = dataBox;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			String data = dataBox.getData(); // Read new data
		}
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		Buffer dataBox = new Buffer();
		Producer producer = new Producer(dataBox);
		Consumer consumer = new Consumer(dataBox);
		producer.start();
		consumer.start();
	}
}
