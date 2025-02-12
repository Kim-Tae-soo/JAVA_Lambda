package kr.ddit.or.kr.basic;

public class LambdaTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		LambdaTestInterface01 t1 = new LambdaTestInterface01() {
			@Override
			public void test() {
				System.out.println("안녕하세요");
			}
		};
		
		t1.test();
		*/
		
		LambdaTestInterface01 t2 = () -> {
			System.out.println("안녕하세요 람다식...1");
		};
		t2.test();
		
		LambdaTestInterface01 t3 = () -> {
			System.out.println("안녕하세요 람다식...2");
		};
		t3.test();
		System.out.println("--------------------------------------------------");
		LambdaTestInterface02 t4 =
				(int a) -> {
					int result = a + 10;
					System.out.println(result);
				};
		t4.test(20);
		
		LambdaTestInterface02 t5 =
				a -> {
					int result = a + 20;
					System.out.println(result);
				};
		t5.test(20);
		
		LambdaTestInterface02 t6 =
				a ->System.out.println(a * 10);
			t6.test(60);
		
		System.out.println("-----------------------------------------------------");
		
		LambdaTestInterface03 t7 =
				(int x, int y) -> {
					int r = x+y;
					return r;
					
				};
		int k = t7.test(100, 200);
		System.out.println("k = " + k);
		
		LambdaTestInterface03 t8 =
				(x,y) -> {return  x*y;};
		System.out.println(t8.test(10, 50));
		
		LambdaTestInterface03 t9 =
				(x,y) -> x*y;
		System.out.println(t9.test(20, 50));
	}

}
