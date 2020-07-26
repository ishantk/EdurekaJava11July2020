class Point<T, U>{
	
	T x; // ref var
	U y; // ref var
	
	Point(){
		x = null;
		y = null;
	}
	
	Point(T x, U y){
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("Point is: "+x+" : "+y);
	}
	
}


public class Generics {

	public static void main(String[] args) {
		/*
		Point p1 = new Point(10, 20);
		p1.showPoint();
		
		Point p2 = new Point(10.11, 20.22);
		p2.showPoint();
		
		Point p3 = new Point('A', 'B');
		p3.showPoint();
		
		Point p4 = new Point("Alpha", "Delta");
		p4.showPoint();
		*/
		
		/*
		Point<Integer> p1 = new Point<Integer>(10, 20);
		p1.showPoint();
		
		Point<Double> p2 = new Point<Double>(10.11, 20.22);
		p2.showPoint();
		
		Point<Character> p3 = new Point<Character>('A', 'B');
		p3.showPoint();
		
		Point<String> p4 = new Point<String>("Alpha", "Delta");
		p4.showPoint();
		*/
		
		Point<Integer, Integer> p1 = new Point<Integer, Integer>(10, 20);
		p1.showPoint();
		
		Point<Double, Double> p2 = new Point<Double, Double>(10.11, 20.22);
		p2.showPoint();
		
		Point<Character, Character> p3 = new Point<Character, Character>('A', 'B');
		p3.showPoint();
		
		Point<String, String> p4 = new Point<String, String>("Alpha", "Delta");
		p4.showPoint();
		
		Point<Integer, String> p5 = new Point<Integer, String>(10, "Delta");
		p5.showPoint();


	}

}
