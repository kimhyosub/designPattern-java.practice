
public class AObj {
	
	AinterFace ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		
		// 위임한다
		ainterface.funcA();
		ainterface.funcA();
		
		// ~ 기능이 필요합니다. 개발해주세요
		
	}
}
