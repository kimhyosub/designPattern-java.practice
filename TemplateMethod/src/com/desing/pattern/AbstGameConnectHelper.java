package com.desing.pattern;

public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String username);
	protected abstract String connection(String info);
	
	
	// 템플릿 메소드
	public String requestConnection(String encodedInfo) {
		
		// 보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		// 반환된 아이디, 암호를 할당한다.
		String id = "aaa";
		String password = "bbb";
		
		// 인증 과정
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		String userName = "userName";
		int i = authorization(userName);
		
		switch (i) {
		case -1:
			throw new Error("셧다운");
		case 0:	// 관리자
			break;
		case 1: // 유료회원
			break;
		case 2: // 무료회원
			break;
		case 3: // 권한없음
			break;
		default: // 기타
			break;
		}
		return connection(decodedInfo);
	}
}
