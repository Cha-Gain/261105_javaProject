package day14;

public class Exception05 {

	public static void main(String[] args) {
		// 멀티캐치 / 다중캐치
		/*
		 * try{} catch(){}
		 * try{
		 * 
		 * } catch(){
		 * 
		 * } catch(){
		 * 
		 * } catch(){
		 * 
		 * }
		 * 예외를 세분화해서 구체적으로 잡고 싶을 때 => 다른 문구를 출력하고 싶을 때
		 *
		 * Exception클래스 : 모든 예외의 최고 조상 => 어떤 예외가 와도 다 캐치
		 * 자식부터 캐치를 해야 가능
		 */
		
		try {
			//int arr[] = new int[0];
			
			//System.out.println(arr[0]);

			System.out.println(3/0);
		} catch(NullPointerException e) {
			System.out.println("객체가 널입니다");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
		
	}

}
