package Zadaci_18_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
public class z_4Square extends z_2GeometricObject implements z_4Colorable{

	
	//osobine
	public double side;
	
	//no arg konstruktor
	public z_4Square(){
		
	}
	//konstruktor sa osobinama
	public z_4Square(String color, boolean filled, double side){
		super (color,filled);
		this.side = side;
	}
	//povrsina
	public double getArea(){
		return side * side;
	}
	@Override
	public void howToColor(){
		System.out.println("Color all four sides.");
	}
}
