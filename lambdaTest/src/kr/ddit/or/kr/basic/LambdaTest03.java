package kr.ddit.or.kr.basic;

public class LambdaTest03 {
	
	public void testMethod(int temp) {
		int localVar = 400;
		int test = 500;
		
		// 람다식 내부에서 사용되는 지역변수는 final 이여야 한다.
		// Java 1.8 이상에서는 final 키워드를 붙이지 않으면 컴파일러가
		// 자동으로 붙여 준다.
		
		// 람다식에서 사용하는 지역 변수의 값을 중간에 변경하면
		// final로 인식하지 않아서 람다식에서 오류가 발생한다.
		
		// temp = 10000;
		// localVar = 200;
		
		test = 800000;
		
		// 람다식
		LambdaTestInterface01 lt = () -> {
			// 람다식에서 지역변수 (로컬 변수) 사용하기
			System.out.println("temp = " + temp);
			System.out.println("localVar = " + localVar);
		};
		
		lt.test();
	}
	

	public static void main(String[] args) {
		LambdaTest03 lambda = new LambdaTest03();
		
		lambda.testMethod(100);

	}
}
