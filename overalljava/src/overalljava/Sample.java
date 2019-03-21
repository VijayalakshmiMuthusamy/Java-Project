package overalljava;
public class Sample
{
	//NON STATIC VARIABLE
	short a=2019,b=2020;
	
	
	
	
	
	byte k=10,l=20;int m=l/k;
	int g=100,h=200;
	double d= a*b;
	float f= a+b;
	boolean y=false,z=true;
	int arr[]= {10,20,30,40,50};
	int roll;String name; 
	//STATIC VARIABLE
	String company="PERFICIENT";

	void display(){
		if(a%4==0){ 
			System.out.println("It is not the leap year");}
		else if(g==h) {
			System.out.println("100==200 : "+z);}
		else {
			System.out.println("100==200 : "+y);
		}
		System.out.println("m = "+m);
		System.out.println("Double = "+d+"Float = "+f);
	}
	void disp() {	
		System.out.println("Print the array elements");
		for(int a:arr) {
			System.out.println(a);
		}
	}
	Sample(){
		roll=12;
		name="Viji";
	}
	void show() {
		System.out.println("Default Constructor");
	}
	Sample(int r,String n){
		//LOCAL VARIABLE
		roll=r;
		name=n;
	}
	void show1() {
		System.out.println("Parameterized Constructor");
		System.out.println("roll= "+roll+"; name= "+name);
	}
	Sample(int roll,String name,String company){
		this.roll=roll;
		this.name=name;
		this.company =company;
	}
	void show2() {
		System.out.println("Java this & Static keyword");
		System.out.println("roll= "+roll+"; name= "+name+"; company ="+company);
	}

	public static void main(String args[]) {

		Sample obj=new Sample();
		Sample obj1=new Sample(0001,"mani");
		Sample obj2=new Sample(0002,"vijay","cts");
		obj.show();	
		obj1.show1();
		obj2.show2();
		obj.display();
		obj.disp();
	}}