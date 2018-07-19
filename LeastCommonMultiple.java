package programmers;

/*
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는
가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, 
solution을 완성해 주세요.

제한 사항
arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.

입출력 예
arr			result
[2,6,8,14]	168
[1,2,3]		6
 */

public class LeastCommonMultiple {
	public static void main(String[] args) {
		int[] arr1 = {2,6,8,14};
		System.out.println(solution(arr1));
		int[] arr2 = {1,2,3,4};
		System.out.println(solution(arr2));


	}

	public static int solution(int[] arr) {
		int answer = 0;
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {			//기준 숫자를 배열중 가장 큰 요소로 설정
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		int num=max;
		loop:
		for(int j=1;;j++) {							 	//가장 큰 요소의 배수에 대해서 검증
			for (int i = 0; i < arr.length; i++) {
				if(num%arr[i]!=0) {						//한 요소라도 나누어 떨어지지 않으면 바로 break
					num = max*j;
					break;
				}
				if(num%arr[i]==0 && i==arr.length-1) {	//모든 요소가 나누어 떨어지고, 배열의 마지막 요소까지
					answer = num;						//가면 최소공배수이므로 return
					break loop;
				}
			}
			
		}

		return answer;
	}
}
