import Sam.SamFactory;
import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import gt.GtBikeFactory;

public class Main {
	
	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());

		
		BikeFactory gtBikefactory = new GtBikeFactory();
		
		Body gtBikeBody = gtBikefactory.createBody();
		Wheel gtBikeWheel = gtBikefactory.createWheel();
		
		System.out.println(gtBikeBody.getClass());
		System.out.println(gtBikeWheel.getClass());
	}
}
