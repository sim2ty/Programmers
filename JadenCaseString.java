package programmers;

/*
JadenCase란 모든 단어의 첫 알파벳이 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.

입출력 예
s						return
3people unFollowed me	3people Unfollowed Me
for the last week		For The Last Week
*/

public class JadenCaseString {
	public static void main(String[] args) {
		System.out.println(solution1("3people unFollowed me"));
		System.out.println(solution1("for the last week"));
		System.out.println("-------------------------------");
		System.out.println(solution2("3people unFollowed me"));
		System.out.println(solution2("for the last week"));
	}
	//방법 (1)
	public static String solution1(String s) {
		String answer = "";
		String[] arr = s.split("");
		boolean check = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(" ")) {			//공백이면 check true로 만들어주고, 공백 이어붙이고, 다른 if문으로 들어가지 않게 continue
				check = true;
				answer += arr[i];
				continue;
			}

			if (check) {						//각 단어 첫번째 문자일때는 대문자로 + check false로
				arr[i] = arr[i].toUpperCase();
				check = false;
			} else {							//각 단어 첫번째 문자 아닐때는 소문자로(check false 상태)
				arr[i] = arr[i].toLowerCase();
			}

			answer += arr[i];
		}

		return answer;
	}
	
	// 방법 (2)
	public static String solution2(String s) {
		    boolean isNextUpper = true;
		    StringBuffer sb = new StringBuffer();
		 
		    for ( int i=0; i<s.length(); i++ ) {
		      char c = s.charAt(i);
		      if ( i == 0 || isNextUpper ) {
		        sb.append(Character.toUpperCase(c));
		        isNextUpper = false;
		      } else {
		        sb.append(Character.toLowerCase(c));
		      }
		 
		      if ( c == ' ') {
		        isNextUpper = true;
		      }
		    }
		    return sb.toString();
		  }
}
