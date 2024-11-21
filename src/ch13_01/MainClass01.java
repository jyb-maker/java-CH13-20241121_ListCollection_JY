package ch13_01;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDto memberDto1 = new MemberDto("홍길동", 27, "서울 용산구", "010-1234-8888", "hong@abc.com");
		MemberDto memberDto2 = new MemberDto("이순신", 32, "서울 종로구", "010-1234-7777", "lee@abc.com");
		MemberDto memberDto3 = new MemberDto("김유신", 41, "서울 은평구", "010-1234-5555", "kimg@abc.com");
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();   // 인터페이스 List 이기 때문에, 부모는 자식의 모든것을 받아준다를 기억하자!!
		// ↑ MemberDto 클래스로 만든 객체를 모으기 위한(컬렉션) 큰 박스 자료타입 list 선언!!
		
		memberDtos.add(memberDto1);
		memberDtos.add(memberDto2);				
		memberDtos.add(memberDto3);				
		memberDtos.add(new MemberDto("강감찬",31,"인천 미추홀구","010-1234-5588","kang@abc.com"));					
		
		MemberDto memberDto4 = memberDtos.get(3); // 강감찬 객체 반환 

		memberDtos.remove(3); // 인덱스 3(강감찬) memberDto객체 삭제	
		for (int i=0;i<memberDtos.size();i++) {  // 배열은 length이고, 리스트는 size로 실행어 작성한다.  
			String name = memberDtos.get(i).getMname();  // getter 을 활용 
			int age = memberDtos.get(i).getMage();  // getter 을 활용 			
			String addr = memberDtos.get(i).getMaddr();  // getter 을 활용 			
			String phone = memberDtos.get(i).getMphone();  // getter 을 활용 			
			String email = memberDtos.get(i).getMemail();  // getter 을 활용 			
		
			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
			
	    }
//			memberDtos.remove(3); // 인덱스 3(강감찬) memberDto객체 삭제
			
	}		
}
