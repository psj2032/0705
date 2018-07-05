package interfacetest;

//MemberService 인터페이스를 implements한 클래스를 생성
//하나의 인터페이스를 implements한 클래스의 이름은 인터페이스 이름뒤에
//lmpl을 붙이는 것이 관례입니다
public class MemberServicelmpl implements MemberService{

	@Override
	public boolean idCheck(String id) {
		// TODO Auto-generated method stub
		boolean result =  false;
		
		//id가 root가 아니라면 true
		if(id.equals("root") == false){
			result =true;
		}
		return result;
	}

	@Override
	public int login(String id, String password) {
		int result = 2;
		
		//id가 root이고 password가 1234이면 로그인성공 - 0
		//id가 root이고 password가 1234가 아니면 비밀번호가 틀림 - 1
		//id가 root가 아니면 없는 아이디 - 2
		if(id.equals("root")) {
			if(password.equals("1234")) {
				result = 0;
			}
			else {
				result =1;
			}
		}
		return result;
	}

}
