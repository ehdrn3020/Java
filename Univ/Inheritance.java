//Example of Class inheritance

package test;

class Student // student class define.
{
	private String name;
	private int num;
	private String major;
	private int grade;
	private double score;

	public Student(String name, int num, String major, int grade, double score) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
		this.score = score;
	} // Creater define

	String getName() {
		return name;
	} 

	int getNum() {
		return num;
	}

	String getMajor() {
		return major;
	}

	int getGrade() {
		return grade;
	}

	double getScore() {
		return score;
	}

	void setName(String name) {
		this.name = name;
	} 

	void setNum(int num) {
		this.num = num;
	}

	void setMajor(String major) {
		this.major = major;
	}

	void setGrade(int grade) {
		this.grade = grade;
	}

	void setScore(double score) {
		this.score = score;
	}

	public void allShow() // Print all method.
	{
		System.out.println("name: " + getName() + ", num: " + getNum() + ", major: " + getMajor() + ", grade: "
				+ getGrade() + ", score: " + getScore());
	}
}

class UnderG extends Student // undergraduate class define
{
	private String act; // club variable.

	public UnderG(String name, int num, String major, int grade, double score, String act) {
		super(name, num, major, grade, score);
		this.act = act;
	} 

	String getAct() {
		return act;
	} 

	void setAct(String act) {
		this.act = act;
	}

	public void allShow() {
		System.out.print("act: " + getAct() + ", ");
		super.allShow();
	}
}

class postG extends Student // postgraduate class define.
{
	private String type; // TA type.
	private double rate; // scholarship rate.

	public postG(String name, int num, String major, int grade, double score, String type, double rate) // »ý¼ºÀÚ
																									// Á¤ÀÇ.
	{
		super(name, num, major, grade, score);
		if (checkType(type))
			this.type = type;
		else
			System.out.println("wrong type");
		if (checkRate(rate))
			this.rate = rate;
		else
			System.out.println("wrong rate");
	}

	boolean checkType(String type) { //Type Inspection of the Designated TA Type.
		if ((type.equalsIgnoreCase("edu")) || (type.equalsIgnoreCase("exp")))
			return true;
		else
			return false;
	}

	boolean checkRate(double rate) { // Inspection of the scholarship rate.
		if (rate > 0 && rate < 1)
			return true;
		else
			return false;
	}

	String getType() {
		return type;
	}

	double getRate() {
		return rate;
	}

	void setType(String type) 
	{
		if (checkType(type))
			this.type = type;
		else
			System.out.println("wrong type");
	}

	void setRate(double rate) {
		if (checkRate(rate))
			this.rate = rate;
		else
			System.out.println("wrong rate");
	}

	public void allShow() {
		System.out.print("type: " + getType() + ", rate: " + getRate() + ", ");
		super.allShow();
	}
}

public class Inheritance { 
	public static void main(String[] args) {
		Student std = new Student("kang", 201107, "electronic", 3, 95.5);
		UnderG ug = new UnderG("kim", 201302, "musical", 2, 72.2, "Bend");
		postG g1 = new postG("lee", 201001, "math", 4, 88.5, "edu", 0.8);
		postG g2 = new postG("su", 201002, "math", 4, 88.5, "eee", 1.8);
		std.allShow();
		ug.allShow();
		g1.allShow();
		g2.allShow();
	}
}
