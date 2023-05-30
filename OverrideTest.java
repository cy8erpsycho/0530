//0530
abstract class Shape{
	protected double area; // private 붙여도 상속은 되나 접근은 하지못함
						   // protected 는 조금 애매함
						   // private 접근제어자 설정후 getter setter 메서드
	
	
//		if(this instanceof Circle) {
//		}
//	void make() {	
//	}
	abstract void make(); 
	//make메서드가 없으면 하위클래스에서 재정의를 못한다
	//하위클래스, 다형성을 위해 반드시 필요함
	//abstract(추상메서드) -- 하위클래스에서 반드시 재정의 해야돼!
	//추상메서드를 포함하고 있는 클래스를 추상클래스라고 한다
	//추상메서드를 포함한다 --> 추상클래스
	//추상클래스이다 !--> 추상메서드를 포함한다
	
	
	public String toString() {
		return "면적은" + area;
	}
		
		
	
	void print() {
		System.out.println("도형의 면적은" + area);		
	}
}



class Circle extends Shape{
	private int radius;
	
	
	Circle(){
		
	}
	Circle(int radius){
		if(radius > 0) {
			this.radius = radius;	
		}else {
			System.out.println("반지름은 0보다 커야합니다");
		}
	}
	
	void make() {
		area = Math.pow(radius, 2)*Math.PI;
	}
	
	void print() {
		System.out.println("반지름이" + radius+ "인 원의");
		super.print();
	}
	
	public String toString() {
		return "원의" + super.toString();
	}
	
}

class Rectangle extends Shape{
	private int width, height;
		
	Rectangle(){
		
	}
	
	Rectangle(int width){
		this.width = width;
		this.height = width;	
	}
	
	Rectangle(int width, int height){
		if(width>0 && height>0)	{
			this.width = width;
			this.height = height;	
		}else {
			System.out.println("가로, 세로값은 0보다 커야합니다");
		}		
	}
		
	void make() {
		area = width*height;
	}
		
	void print() {
		System.out.println("가로" + width+"세로"+height+ "인 사각형의 ");
		super.print();
	}
	
	public String toString() {
		return "사각형의" + super.toString();
	}
		
	
}

class Triangle {
	double base;
	double height;
	double area;
	
	Triangle(){
		
	}
	
	Triangle(int base) {
		this.base = base;
		height = Math.sqrt(3)*base;
		
	}
	
	Triangle(double b, double h){
		base = b;
		height = h;
		
	}
		
	void make() {
		area = base*height*(1/2);
	}
		
	void print() {
		System.out.println("가로" + base+"세로"+height+ " 원의 ");
	}
		
	
}

	



public class OverrideTest {
	public static void test(Shape s) { // <-- new Shape(); new Circle(5); new Rectangle(3,4)
		s.make();
		s.print();// 다형성
//		PrintStream ps = System.out;
//		ps.println();
		System.out.println(s); // s.toString()메서드 호출됨
							   // Circle@xxxx
							   //Rectangle@xxx
							   // 도형의 면적~
		                       // 도형의 면적
	}
	public static void main(String[] args) {
		Circle c;
		Rectangle r;
		Triangle t;
		c = new Circle(5); // 반지름이 5인 원객체
//		c.mC(); // 원의 면적을 계산한다
//		c.print(); //"반지름이 5인 원의 면적은 ~입니다"기 출력된다
		test(c);
		
		r = new Rectangle(3,4);
//		t.print();
		test(r);
		
		Shape s;
		// s = new Shape(); // abstract class는 객체생성못한다


	}

}
