package dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import model.Nonuser;


public class NonuserDao {
	SqlSessionFactory sqlSessionFactory;
	SuperDao sd = new SuperDao();
	public NonuserDao() {
		sqlSessionFactory = sd.init();
	}


	public List<Nonuser> selectAll() {
		SqlSession session = sqlSessionFactory.openSession(); // 하나의 Session을 열어 제공함.
		AddrMapper mapper = session.getMapper(dao.AddrMapper.class); //SqlSession 인스턴스에 인터페이스 구현체(매핑된 sql) 삽입
		List<Nonuser> list = mapper.selectAll();
		return list;
	}

	public Nonuser selectById(String non_cp) {
		SqlSession session = sqlSessionFactory.openSession(); // 하나의 Session을 열어 제공함.
		AddrMapper mapper = session.getMapper(AddrMapper.class); //SqlSession 인스턴스에 인터페이스 구현체(매핑된 sql) 삽입
		Nonuser nu = new Nonuser(non_cp);
		return mapper.selectById(nu);
	}

	public boolean create(Nonuser vo) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		mapper.create(vo);

		session.commit();
		return true;

	}

	public void update(Nonuser vo) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		mapper.update(vo);

		session.commit();
	}

	public void delete(Nonuser vo) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		mapper.delete(vo);

		session.commit();
	}

}
