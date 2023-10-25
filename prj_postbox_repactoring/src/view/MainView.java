package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.NonuserDao;
import dao.SuperDao;
import model.Nonuser;
import model.User;
import org.apache.ibatis.session.SqlSessionFactory;

public class MainView {


	public static void exit() {
		System.out.println("** 프로그램 종료 **");
		System.exit(0);
	}

	public static void main(String[] args) {

		NonuserDao nd = new NonuserDao();

		/* 테스트코드
		List<Nonuser> addrList = nd.selectAll();

		System.out.println("웹 브라우저에 출력");
		for(int i = 0; i < addrList.size(); i++) {
			System.out.println("========= 주소록 목록 =========");
			System.out.println(addrList.size());
			System.out.println(addrList.get(i).getNon_cp());
			System.out.println("=============================");
		}

		System.out.println(nd.selectById("01067333386"));
		System.out.println(nd.create(nd.selectById("01067333386")));
		nd.update(nd.selectById("01067333386"));
		nd.delete(nd.selectById("01063386"));
		*/


//
//		UserView userV = new UserView();
//		Scanner scan = new Scanner(System.in);
//		String userId;
//
//		SuperDao.Load();
//
//		while (true) {
//			System.out.println("-----------------------------------------------------");
//			System.out.println();
//			System.out.println("                     [ 메인 메뉴 ]");
//			System.out.println();
//			System.out.println("-----------------------------------------------------");
//			System.out.println();
//			System.out.printf("\t%-20s\t%-20s\n", "1. 회원 택배 접수", "2. 비회원 택배 접수");
//			System.out.println();
//			System.out.printf("\t%-20s\t%-20s\n", "3. 회원 가입", "4. 택배 접수 조회");
//			System.out.println();
//			System.out.println("다른 숫자 입력시 종료됩니다.");
//			System.out.println("-----------------------------------------------------");
//
//			System.out.print("메뉴 선택 : ");
//			String menuNo = scan.nextLine();
//			System.out.println();
//
//			if ("1".equals(menuNo)) {
//				userId = userV.Login();
//
//				if (userId != "fail") {
//					System.out.println("-----------------------------------------------------");
//					System.out.println();
//					System.out.println("                  로그인에 성공하셨습니다.");
//					System.out.println();
//
//					ParcelinfoView.getinstance().info(userId);
//				} else {
//					System.out.println("-----------------------------------------------------");
//					System.out.println();
//					System.out.println("                  로그인에 실패하셨습니다.");
//					System.out.println();
//					continue;
//				}
//
//			} else if ("2".equals(menuNo)) {
//				String nonusercp = userV.Non_userlogin();
//
//				if (nonusercp != "fail") {
//					System.out.println("-----------------------------------------------------");
//					System.out.println();
//					System.out.println("               비회원 로그인에 성공하셨습니다.");
//					System.out.println();
//
//					ParcelinfoViewNonuser.getinstance().info(nonusercp);
//				} else {
//					System.out.println("-----------------------------------------------------");
//					System.out.println();
//					System.out.println("       비회원 로그인에 실패하셨습니다. 다시 시도해 주십시오");
//					continue;
//				}
//
//			} else if ("3".equals(menuNo)) {
//
//				String sign = userV.JoinUser();
//				if (sign != "fail") {
//					System.out.println("-----------------------------------------------------");
//					System.out.println();
//					System.out.println("                 회원 가입이 완료하셨습니다.");
//					continue;
//				} else {
//					System.out.println("-----------------------------------------------------");
//					System.out.println();
//					System.out.println("         회원 가입에 실패하셨습니다. 다시 시도해 주십시오");
//					continue;
//				}
//
//			} else if ("4".equals(menuNo)) {
//				// 택배조회 기능
//				WaybillView.getinstance().wbList();
//				continue;
//			} else {
//				SuperDao.close();
//				exit();
//			}
//
//		}
//
	}
	

}
