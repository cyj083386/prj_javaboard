# prj_javaboard

2023년 하반기 천재IT 교육센터에서 진행한 CRUD 구현 클론코딩입니다.<br>
MyBatis를 적용하였으나 연습을 위해 maven미사용, webview는 콘솔로 구현되어있습니다.<br>
<br>
<strong>1.prj_single_addr: 완료</strong><br>
MyBatis로 주소 테이블1개에 대해 간단한 crud가 구현된 프로젝트입니다.<br>
단순 클론코딩이 아닌 MyBatis 이해를 위해 전체적인 내용을 파악하고 라인별 주석을 달았습니다.<br>
코드에 주석으로 작성하기 어려운 내용은 블로그 글로 따로 작성하였습니다.(https://velog.io/@cyj083386/231022)<br>
<br>
<strong>2.prj_postbox_repactoring: 수정중 </strong><br>
MyBatis로 prj_postbox_original을 1차 repactoring한 프로젝트입니다.<br>
기존 프로그램과 비교를 위해 view(controller) 쪽과 DTO의 수정은 최소화 했습니다.<br>
DAO에서는 로직, 각 메소드의 I/O은 기존과 동일하게 작성하고 내부 접근방식만 MyBatis로 변경하였습니다.<br>
<br>
<strong>3.prj_postbox_original</strong><br>
java로 작성된 택배관리 프로그램입니다.<br>
prj_postbox_repactoring과 비교를 위해 업로드합니다.<br>
