package com.ict.ajax1.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok
@Setter  // setter를 자동으로 만들어준다.
@Getter  // getter를 자동으로 만들어준다.
@ToString // 모든 필드를 출력하는 toString()메소드 생성
@NoArgsConstructor // 인자없는 생성자(기본생성자)
@AllArgsConstructor // 모든 인자를 가진 생성자(매개변수 생성자)
//@Data  // 위의 모든 내용을 한번에 다해주는 어노테이션(매개변수빼고)
public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private String email;
	private String phone;
	
}
