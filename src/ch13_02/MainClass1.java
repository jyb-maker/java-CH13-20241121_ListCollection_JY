package ch13_02;

import java.util.Stack;

import ch13_01.MemberDto;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<MemberDto> stack = new Stack<MemberDto>();     // LIFO (Last In First Out)
		stack.push(new MemberDto("홍길동",27,"서울시 용산구","010-1111-2222","hong@abc.com"));
		stack.push(new MemberDto("이순신",32,"서울시 용산구","010-1111-2222","hong@abc.com"));
		stack.push(new MemberDto("김유신",51,"서울시 용산구","010-1111-2222","hong@abc.com"));
		stack.push(new MemberDto("강감찬",47,"서울시 용산구","010-1111-2222","hong@abc.com"));
		
		MemberDto memberDto1 = stack.pop(); // 강감찬
		System.out.println(memberDto1.getMname());
		
		System.out.println("===========================================");
		
		while(!stack.isEmpty()) {
			MemberDto memberDto = stack.pop();
			System.out.println(memberDto.getMname());
		}
		
	}

}
