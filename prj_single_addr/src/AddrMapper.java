import java.util.ArrayList;
// Mapper 인터페이스 작성
// 인터페이스가 필요한 이유?
//Mapper.xml은 sql을 메서드에 연결한다.
//우리는 Mapper에서 conn, stmt등의 구현을 신경쓰지 않고(mybatis가 진행) id, resultType, parameterType만 명시하여 메소드에 연결후 사용하면 된다.
//하지만 이 메소드는 인터페이스로 선언해 줘야 한다.
public interface AddrMapper {
	// public 리턴타입 메서드명(매개변수 타입)
	public ArrayList<Addr> getAddresses();
	public void insertAddress(Addr addr);
	public void updateAddress(Addr addr);
	public void deleteAddress(int id);
}
