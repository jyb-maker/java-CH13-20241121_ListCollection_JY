package ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set<String> set = new Set<E>() {    // Error!!
//		};
		
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김유신");
		set.add("이순신");
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		
		System.out.println(set.size());  // 3 : 홍길동, 김유신, 이순신
		
		
		Iterator<String> iterator = set.iterator(); // iterator(반복자) 생성
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());  // 홍길동, 김유신, 이순신			
		}
		
		for(String element:set) {
			System.out.println(element);
		}
		
		MemberDto memberDto1 = new MemberDto("홍길동", 27, "서울 용산구", "010-1234-8888", "hong@abc.com");
		MemberDto memberDto2 = new MemberDto("이순신", 32, "서울 종로구", "010-1234-7777", "lee@abc.com");
		MemberDto memberDto3 = new MemberDto("김유신", 41, "서울 은평구", "010-1234-5555", "kimg@abc.com");
		
		Set<MemberDto> setDtos = new HashSet<MemberDto>();
		
		setDtos.add(memberDto1);
		setDtos.add(memberDto2);				
		setDtos.add(memberDto3);
		setDtos.add(memberDto1);
		setDtos.add(memberDto1);
		setDtos.add(memberDto2);
		
		Iterator<MemberDto> iterator2 = setDtos.iterator(); //setDtos에 iterator 생성
	
//		while(iterator2.hasNext()) {
			
//			String name = iterator2.next().getMname();
//			int age = iterator2.next().getMage();
//			String addr = iterator2.next().getMaddr();
//			String phone = iterator2.next().getMphone();
//			String email = iterator2.next().getMemail();
			

//			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
			
		
		set.remove("홍길동");
		set.clear();    // set내에 존재하는 모든 원소 제거 
		set.isEmpty();  // bool타입으로 반환 -> 비어 있으면 True, 1개라도 들어있으면 False
		
		
		}
		
	}


