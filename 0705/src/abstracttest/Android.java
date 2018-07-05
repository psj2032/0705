package abstracttest;

public class Android extends Smartphone {
	public void call() {
		double x = 10.75;
		// 실수를 정수로 강제 형 변환 : 소수가 버려집니다
		System.out.println("x:" + (int) (x + 0.5));
		
		System.out.println("x:" + (int) (x * 10 + 0.5) / 10.0);
	}
	

}
