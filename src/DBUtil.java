import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// DAO, Mapper 사용하는곳
public class DBUtil {
//	각 기능을 메서드 형태로 제공

	String url = "jdbc:mariadb://127.0.0.1:3306/addr_prj";
	String user = "root";
	String pass = "12345";
	// 연결하여 한번 주고받는것을 Session이라 함.
	// sqlSessionFactory는 java-DB접속관리 해주는 객체.
	// 세션을 유지하여 같은 DB와 같은 유저가 data를 주고받을수 있게 함
	// 세션은 유저별로 생성됨.
	SqlSessionFactory sqlSessionFactory;
	
	public void init() { //mybatis-config 설정파일을 가져온다.
		try {// try catch로 exeption시 처리할수 있게 작성
			//XML에서 SqlSessionFactory 빌드
			String resource = "mybatis-config.xml"; // 설정파일 가져옴(폴더/파일명.xml)
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //설정파일을 세션관리 객체에 포함하여 빌드

		} catch (Exception e) {
			System.out.println("MyBatis 설정 파일 가져오는 중 문제 발생!!");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Addr> getAddresses() {
		// sql Session = conn + stmt 라고 생각하면된다. 따라서 sql Session을 가지고 JDBC대신에 연결과 sql문을 제어할수있다.
		SqlSession session = sqlSessionFactory.openSession(); // 하나의 Session을 열어 제공함.
		AddrMapper mapper = session.getMapper(AddrMapper.class); //SqlSession 인스턴스에 인터페이스 구현체(매핑된 sql) 삽입
		ArrayList<Addr> addrList = mapper.getAddresses();
		return addrList;
	}
	
	public void insertAddress(String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		Addr addr = new Addr(name, address, phone);
		mapper.insertAddress(addr);
		
		session.commit(); // 여러 쿼리진행후 트랜잭션을 커밋. update, delete, insert
	}
	
	public void updateAddress(int id, String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		Addr addr = new Addr(id, name, address, phone);
		mapper.updateAddress(addr);
		
		session.commit(); // update, delete, insert
	}
	
	public void deleteAddress(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		mapper.deleteAddress(id);
		
		session.commit(); // update, delete, insert
	}
	
}
