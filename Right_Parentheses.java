package programmers;

/*
올바른 괄호란 두 개의 괄호 '(' 와 ')' 만으로 구성되어 있고, 괄호가 올바르게 짝지어진 문자열입니다. 괄호가 올바르게 짝지어졌다는 것은
'(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 합니다.

예를들어
()() 또는 (())() 는 올바른 괄호입니다.
)()( 또는 (()( 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return하는 RightParentheses 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

입출력 예
s		answer
()()	true
(())()	true
)()(	false
(()(	false
*/

class RightParentheses{
	public static boolean rightParentheses(String s) {
		int sum = 0;
	
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') {
				sum++;
			}
			else if(s.charAt(i)==')') {
				if(sum<=0) {
					return false;
				}else sum--;
			}
		}
		
		if(sum==0) 
			return true;
		else 
			return false;
	}
	
}

public class Right_Parentheses {
	public static void main(String[] args) {
		System.out.println(RightParentheses.rightParentheses("()()"));
		System.out.println(RightParentheses.rightParentheses("(())()"));
		System.out.println(RightParentheses.rightParentheses(")()("));
		System.out.println(RightParentheses.rightParentheses("(()("));

	}

}
