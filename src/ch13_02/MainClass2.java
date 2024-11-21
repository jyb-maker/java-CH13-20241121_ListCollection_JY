package ch13_02;

import java.util.LinkedList;
import java.util.Queue;

import ch13_01.MemberDto;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<MemberDto> queue = new LinkedList<MemberDto>(); // 큐 구현 (FIFO: First In First Out)
		
		queue.offer(new MemberDto("홍길동",27,"서울시 용산구","010-1111-2222","hong@abc.com"));
		queue.offer(new MemberDto("이순신",32,"서울시 용산구","010-1111-2222","hong@abc.com"));
		queue.offer(new MemberDto("김유신",51,"서울시 용산구","010-1111-2222","hong@abc.com"));
		queue.offer(new MemberDto("강감찬",47,"서울시 용산구","010-1111-2222","hong@abc.com"));
		
		while(!queue.isEmpty()) {
			MemberDto memberDto = queue.poll();
			System.out.println(memberDto.getMname());
		}
	}

	
	
}
