package example;
class exa {
short a=2019,b=2020;
		double d= a*b;
		float f= a+b;
		int roll;String name;{
		if(a%4==0)
		{
			
			
			System.out.println("It is the leap year");}
			else
			{
				System.out.println("It is not a leap year");
		}
		System.out.println("Double = "+d+"Float = "+f);
		}}
	class exam extends exa{
		exam()
	
		{
			roll=1;
			name="viji";
			System.out.println("roll= "+roll+"; name= "+name);
		}
			exam(int r,String n)
			{
				roll=r;
				name=n;
			}
		
				void show2() {
				   
						//System.out.println("Parameterized Constructor");
				System.out.println("Parameterized Constructor");
				System.out.println("roll= "+roll+"; name= "+name);
			}
	}	
	class examp{
			public static void main(String[] args) {
					exam obj = new exam();
		//obj.show1();
		exam object = new exam(120,"pavi");
		object.show2();
			}
}