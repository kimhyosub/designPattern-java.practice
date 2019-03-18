package gt;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new GtBikeBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtBikeWheel();
	}
	
}
