package nid;
import java.util.Scanner;


public class geometry {
	
public class LinearEquation {
	private double a,b,c,d,e,f;
	 LinearEquation(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
		
		a = y1-y2;
		b = x1-x2;
		c = y3-y4;
		d = x3-x4;
		e = (a*x1) - (b*y1);
		f = (c*x3) - (d*y3);
	}
	 boolean test(){
		 double discriminant = ((a*d) - (b*c));
		 
		 return discriminant == 0.0? false: true ;
	 }
	 
	double getX(){
		 double x;
		 x = ((e*d) - (b*f))/((a*d) - (b*c));
		 return x;
	 }
	 
	double getY(){
		double y;
		 y = ((a*f) - (e*c))/((a*d) - (b*c));
		return y;	 
	 }
}
	

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		double x1,y1,x2,y2,x3,y3,x4,y4,x,y;

		System.out.println("\n\n*****************Geometery: Intersectiong Points*******************");
		
		System.out.print("\n\nEnter point in the form x1 y1 x2 y2 x3 y3 x4 y4: ");
		x1 = Input.nextDouble();
		y1 = Input.nextDouble();
		x2 = Input.nextDouble();
		y2 = Input.nextDouble();
		x3 = Input.nextDouble();
		y3 = Input.nextDouble();
		x4 = Input.nextDouble();
		y4 = Input.nextDouble();
		
		geometry something = new geometry();
		LinearEquation result = something.new LinearEquation(x1,y1,x2,y2,x3,y3,x4,y4);
		
		if(result.test()){
			
			x = result.getX();
			y = result.getY();
			
			System.out.println("Lines intersect at ("+ x + " , "+ y +" )");
		}
		else		
			System.out.println("The two Lines are parallel");
		
	}

}
