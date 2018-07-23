package programmers;

/*
 앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다.
 문자열 s가 주어질 때, s의 부분문자열(Substring)중 가장 긴 팰린드롬의 길이를 return 하는 solution 함수를 
 완성해 주세요.

 예를들면, 문자열 s가 abcdcba이면 7을 return하고 abacde이면 3을 return합니다.

 제한사항
 문자열 s의 길이 : 2500 이하의 자연수
 문자열 s는 알파벳 소문자로만 구성
 
 입출력 예
 s			answer
 abcdcba	7
 abacde		3 
*/

public class LongestPalindrome {
	public static void main(String[] args) {
		System.out.println(solution("abcdcba"));
		System.out.println(solution("abacde"));

	}

	public static int solution(String s)
    {
       int left = 0, right = 0;
        int result = 1;

        if(s.length() != 1) {
        	//팰린드롬 길이가 홀수일 때, left center right 의 요소로 나누어서 구현
            for (int center = 1; center < s.length() - 1; center++) {
                left = center - 1;
                right = center + 1;
                while (left >= 0 && right <= s.length() - 1) {
                    if (s.charAt(left) != s.charAt(right))
                        break;

                    result = right - left + 1 > result ? right - left + 1 : result;
                    left--;
                    right++;
                }
            }

          //팰린드롬 길이가 짝수일 때, center(=left) right 의 요소로 나누어서 구현
            for (int center = 0; center < s.length() - 1; center++) {
                left = center;
                right = center + 1;
                while (left >= 0 && right <= s.length() - 1) {
                    if (s.charAt(left) != s.charAt(right))
                        break;
                    result = right - left + 1 > result ? right - left + 1 : result;
                    left--;
                    right++;
                }
            }
        }

        return result;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static int solution(String s)
	{
		int answer = 0;
		char [] arr = new char[s.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.charAt(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			loop:
			for (int j = arr.length-1; j > i; j--) {
				if(arr[i]==arr[j]) {
					for (int k = 1; k <= (j-i)/2 ; k++) {
						if(arr[i+k]!=arr[j-k]) {
							break loop;
						}
					}	
				}
				answer = j-i+1;
				
			}
		}

		return answer;
	}*/
}
