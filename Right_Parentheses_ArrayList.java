package programmers;

import java.util.ArrayList;

/*
 올바른 괄호란 두 개의 괄호 '(' 와 ')' 만으로 구성되어 있고, 괄호가 올바르게 짝지어진 문자열입니다. 괄호가 올바르게 짝지어졌다는 것은
 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 합니다.

 예를들어
 ()() 또는 (())() 는 올바른 괄호입니다.
 )()( 또는 (()( 는 올바르지 않은 괄호입니다.
 '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return하는 solution 함수를 완성해 주세요.

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

class RightParentheses_ArrayList {
	 // 리스트에 문자열을 더하는 함수 정의
    public static void Add(String s, ArrayList<String> list) {
        list.add(s);
        // 리스트의 길이가 2 이상부터 완전한 괄호인지 검사
        if (list.size() > 1 && Check(list)) {
            // 만약 괄호가 완전히 닫아졌다면 마지막 두 원소를 제거
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
        }
    }
    
    // 리스트의 마지막 두 원소가 "()" 인지 확인
    public static boolean Check(ArrayList<String> list) {
        if (list.get(list.size() - 2).equals("(") && list.get(list.size() - 1).equals(")")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean rightParentheses_ArrayList(String s) {
        boolean answer = true;
        ArrayList<String> list = new ArrayList<>();
        // 괄호 길이만큼 순회
        for (int i = 0; i < s.length(); i++) {
            // 첫번째 괄호를 리스트에 집어넣기
            Add(s.substring(i, i + 1), list);
        }
        
        // 결과 확인
        answer = (list.size() == 0);
        return answer;
    }
}

public class Right_Parentheses_ArrayList {
	public static void main(String[] args) {
		System.out.println(RightParentheses_ArrayList.rightParentheses_ArrayList("()()"));
		System.out.println(RightParentheses_ArrayList.rightParentheses_ArrayList("(())()"));
		System.out.println(RightParentheses_ArrayList.rightParentheses_ArrayList(")()("));
		System.out.println(RightParentheses_ArrayList.rightParentheses_ArrayList("(()("));

	}

}
