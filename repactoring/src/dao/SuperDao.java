package dao;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SuperDao {
	
//	public static Connection con ;
//
//	public static void Load()
//	{
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/team","root","12345");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//
//	public static void close() {
//		try {
//			con.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//
//	public static Connection getConnection()
//	{
//		return con;
//	}
//

		String url = "jdbc:mariadb://127.0.0.1:3306/addr_prj";
		String user = "root";
		String pass = "12345";

		SqlSessionFactory sqlSessionFactory;

		public SqlSessionFactory init() {
			try {
				String resource = "dao/mybatis-config.xml"; // 설정파일 가져옴(폴더/파일명.xml)
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //설정파일을 세션관리 객체에 포함하여 빌드
				return sqlSessionFactory;
			} catch (Exception e) {
				System.out.println("MyBatis 설정 파일 가져오는 중 문제 발생!!");
				e.printStackTrace();
				return sqlSessionFactory;
			}
		}
	

}
