package com.koreait.pro.db;

//MTD : MakeTestData
class MTD{
	//Field
	static final int RECORD_NUM = 500;
	static final String TABLE_NAME = "MEMBER";
	static final String[] M_NAMEasFirst = {"김","최","박","유","한","조","문","성","송","신","오","이","장","정","황"};
	static final String[] M_NAMEasLast = {"나현","서연","수범","형진","경민","바울","예림","용운","진영","원섭","시형","시명","병준","구학","병한","조은","경민","종민","보은","신영","태영","관우","광호","성락","승리","호준","석진","덕구"};
	static final String[] M_ID = {"a","d","s","f"};
	static final String[] M_PW = {"1111","2222","3333"};
	static final String[] M_EMAIL = {"@naver.com","@hanmail.net","@gmail.com"};


	static final String[] M_ADDRESS1 = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "경기", "강원", "충청", "전라", "경상", "세종", "제주"};

	static final String[] M_ADDRESS2ForSeoul = {"강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구", "노원구",
			"도봉구", "동대문구", "동작구", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구",
			"양천구", "영등포구", "용산구", "은평구", "종로구", "중구", "중랑구"};
	static final String[] M_ADDRESS2ForBusan = {"강서구", "금정구", "남구", "동구", "동래구", "부산진구", "북구", "사상구", "사하구", "서구", 
			"수영구", "연제구", "영도구", "중구", "해운대구"};
	static final String[] M_ADDRESS2ForDaegu = {"남구", "달서구", "동구", "북구", "서구", "수성구", "중구"};
	static final String[] M_ADDRESS2ForIncheon = {"계양구", "미추홀구", "남동구", "동구", "부평구", "서구", "연수구", "중구"};
	static final String[] M_ADDRESS2ForDaejeon = {"대덕구", "동구", "서구", "유성구", "중구"};
	static final String[] M_ADDRESS2ForGwangju = {"광산구", "남구", "동구", "북구", "서구"};
	static final String[] M_ADDRESS2ForUlsan = {"남구", "동구", "북구", "중구"};
	static final String[] M_ADDRESS2ForGyungkido = {"고양시", "과천시", "광명시", "광주시", "구리시", "군포시", "김포시", "남양주시", "동두천시", "부천시", "성남시", "수원시", "시흥시", "안산시", "안성시", "안양시", "양주시", "여주시", "오산시", "용인시", "의왕시", "의정부시", "이천시", "파주시", "평택시", "포천시", "하남시", "화성시" };
	static final String[] M_ADDRESS2ForKangwondo = {"강릉시", "동해시", "삼척시", "속초시", "원주시", "춘천시", "태백시"};
	static final String[] M_ADDRESS2ForChungchungdo = {"제천시", "청주시", "충주시", "계룡시", "공주시", "논산시", "당진시", "보령시", "서산시", "아산시", "천안시" };
	static final String[] M_ADDRESS2ForKyungsangdo = {"경산시", "경주시", "구미시", "김천시", "문경시", "상주시", "안동시", "영주시", "영천시", "포항시", "거제시", "김해시", "밀양시", "사천시", "양산시", "진주시", "창원시", "통영시" };
	static final String[] M_ADDRESS2ForJeonrado = {"군산시", "김제시", "남원시", "익산시", "전주시", "정읍시", "목포시", "광양시", "나주시", "순천시", "여수시" };
	static final String[] M_ADDRESS2ForJejudo = {"서귀포시", "제주시" };


	static final String[] M_REGDATEtoYEAR = {"2019", "2020" };

	static final String[] M_GRADE = {"Iron", "Bronze", "Silver", "Gold", "Platinum", "Diamond", "Master", "GrandMaster", "CHALLENGER" };

	//	CREATE TABLE MEMBER(
	//		    M_NO NUMBER PRIMARY KEY,
	//		    M_NAME VARCHAR2(20) NOT NULL,
	//		    M_ID VARCHAR2(100) NOT NULL UNIQUE,
	//		    M_PW VARCHAR2(100) NOT NULL,
	//		    M_PHONE VARCHAR2(20) NOT NULL UNIQUE,
	//		    M_EMAIL VARCHAR2(100) NOT NULL UNIQUE,
	//		    M_ADDRESS VARCHAR2(200),
	//		    M_REGDATE DATE,
	//		    M_GRADE VARCHAR2(20),
	//			M_MONEY NUMBER,
	//		    M_POINT NUMBER,
	//		    M_STATE NUMBER -- 탈퇴여부 (2)-관리자 (1)-일반사용자 (0)-탈퇴한 사용자 
	//		);

	//Method
	public static int getRandomIndex(int start, int end) { //start~end
		//start 부터 (end-start)
		return (int)(Math.random()*(end-start+1))+start;
	}

	//오버로딩
	public static int getRandomIndex(int n) { //0~n
		return getRandomIndex(0, n);
	}

	public static String getArrayData(String[] arr) {
		return arr[getRandomIndex(0, arr.length-1)]; //0부터 마지막인덱스(length-1)
		//		return arr[getRandomIndex(arr.length-1)]; //0부터 마지막인덱스(length-1)
		//		둘이 같다.
	}

	public static String RepeatChar(int n) {
		String message="";
		for(int i=0; i<getRandomIndex(n); i++) {
			message += MTD.getArrayData(MTD.M_ID);
		}
		return message;
	}

	public static String M_ADDRESS2Selecter(String address) {
		if(address.equals("서울")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForSeoul);
		} else if(address.equals("부산")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForBusan);
		} else if(address.equals("대구")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForDaegu);
		} else if(address.equals("인천")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForIncheon);
		} else if(address.equals("광주")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForGwangju);
		} else if(address.equals("대전")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForDaejeon);
		} else if(address.equals("울산")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForUlsan);
		} else if(address.equals("경기")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForGyungkido);
		} else if(address.equals("강원")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForKangwondo);
		} else if(address.equals("충청")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForChungchungdo);
		} else if(address.equals("전라")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForJeonrado);
		} else if(address.equals("경상")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForKyungsangdo);
		} else if(address.equals("제주")){
			return MTD.getArrayData(MTD.M_ADDRESS2ForJejudo);
		} else {
			return "";
		}
	}

	public static String M_GradeSelecter(int m_point) {
		if(m_point<10000) {
			return "BRONZE";
		} else if(m_point<20000) {
			return "SILVER";
		} else if(m_point<30000) {
			return "GOLD";
		} else if(m_point<50000) {
			return "VIP";
		} else {
			return "VVIP";
		}
		//		'VVIP' ( >= 50000)
		//		'VIP'  ( >= 30000)
		//		'GOLD' ( >= 20000)
		//		'SILVER' ( >= 10000)
		//		'BRONZE'
	}

	//	public static int M_STATESelector(int n) {
	//		if(n==2) {
	//			return 1;
	//		}else {
	//			return n;
	//		}
	//	}
	public static int M_STATESelector(int n) {
		if(n>=300) {
			return 0;
		} else {
			return 1;
		}
	}

}

public class MakeTestDataForMember {

	public static void main(String[] args) {

		for(int i=0;i<MTD.RECORD_NUM;i++) {
			StringBuffer sb = new StringBuffer();
			String address = MTD.getArrayData(MTD.M_ADDRESS1);
			int m_point = MTD.getRandomIndex(51111);
			//			'VVIP' ( >= 50000)
			//			'VIP'  ( >= 30000)
			//			'GOLD' ( >= 20000)
			//			'SILVER' ( >= 10000)
			//			'BRONZE'
			sb.append("INSERT INTO ").append(MTD.TABLE_NAME+" ").append("VALUES(");
			sb.append("MEMBER_SEQ.NEXTVAL, "); // M_NO
			sb.append("'"+MTD.getArrayData(MTD.M_NAMEasFirst)+
					MTD.getArrayData(MTD.M_NAMEasLast)+"', ");	// M_NAME
			sb.append("'user"+
					(i+1)+
					"', ");	// M_ID
			/*
			sb.append("'"+MTD.RepeatChar(5) +
					(i+1)+
					"', ");	// M_ID
			 */			
			sb.append(1111+", ");// M_PW
			//			sb.append("'"+MTD.getArrayData(MTD.M_PW)+"', ");// M_PW
			sb.append("'010-"+
					String.format("%04d", (int)(MTD.getRandomIndex(9999)))+"-"+
					String.format("%04d", i+1)+
					"', "); // M_PHONE
			sb.append("'"+MTD.RepeatChar(5)+
					String.format("%04d", i+1)+
					MTD.getArrayData(MTD.M_EMAIL)+
					"', "); // M_EMAIL
			sb.append("'"+address+
					" "+
					MTD.M_ADDRESS2Selecter(address)+
					"', "); // M_ADDRESS
			sb.append("'"+MTD.getArrayData(MTD.M_REGDATEtoYEAR)+
					"/"+
					MTD.getRandomIndex(1, 12)+
					"/"+
					MTD.getRandomIndex(1, 28)+//2월이 28일까지밖에 없어서 제외해버림
					"', "); // M_REGDATE
			sb.append("'"+MTD.M_GradeSelecter(m_point)+"', "); // M_GRADE
			sb.append("0, "); // M_MONEY
			sb.append(""+m_point+", "); // M_POINT
			sb.append(MTD.M_STATESelector(i)); // M_STATE
			sb.append(");");
			System.out.println(sb);
		}

		//		CREATE TABLE MEMBER(
		//	    M_NO NUMBER PRIMARY KEY,
		//	    M_NAME VARCHAR2(20) NOT NULL,
		//	    M_ID VARCHAR2(100) NOT NULL UNIQUE,
		//	    M_PW VARCHAR2(100) NOT NULL,
		//	    M_PHONE VARCHAR2(20) NOT NULL UNIQUE,
		//	    M_EMAIL VARCHAR2(100) NOT NULL UNIQUE,
		//	    M_ADDRESS VARCHAR2(200),
		//	    M_REGDATE DATE,
		//	    M_GRADE VARCHAR2(20),
		//		M_MONEY NUMBER,
		//	    M_POINT NUMBER,
		//	    M_STATE NUMBER -- 탈퇴여부 (2)-관리자 (1)-일반사용자 (0)-탈퇴한 사용자 
		//	);

	}

}