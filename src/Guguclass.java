import java.util.Scanner;

public class Guguclass {
	
	public static int[] calculate(int firstNum, int secondNum) {
//		두 값을 입력받아 차례대로 연산한 결과를 두 번째 값의 크기와 같게 만든 배열에 저장하여 반환함
		int[] result = new int[secondNum];
		
		for(int i = 0; i < secondNum; i++) {
			result[i] = firstNum * (i+1);
		}
		
		return result;
	}
	
	public static void prints(int[] result) {
//		배열에 저장된 연산결과를 입력받아 차례로 출력하는 함수
		System.out.println("\n"+result[0]+"단");
		for(int i = 0; i < result.length; i++) {
		System.out.println(result[0]+"*"+(i+1)+"="+result[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		int firstNum = 0;
		int secondNum = 9;
//      입력받은 값을 저장할 변수 
		
		System.out.println("계산하고 싶은 숫자를 쉼표로 나누어 입력하세요(예:3,4)");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
//		사용자로부터 콘솔로 연산에 사용할 값을 문자열로 입력받음
		String[] splitedValue = inputValue.split(",");
		firstNum = Integer.parseInt(splitedValue[0]);
		secondNum = Integer.parseInt(splitedValue[1]);
//		문자열로 받은 값을 쪼개 int로 형변환하여 변수에 저장함
		
		for (int i = 2; i < firstNum+1; i++) {
//		첫번째 입력한 값에 도달할 때까지 연산 및 출력을 반복수행함		
			int[] result = calculate(i, secondNum);
			prints(result);
		}
	}
}
