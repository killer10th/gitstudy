package com.koreait.pro.db;

//MTD : MakeTestData
class MTD3{
	//Field
	static final int RECORD_NUM = 500;
	static final String TABLE_NAME = "QNA_Q";
	
	static final String[] Q_CATEGORY = {"회원", "구매", "판매", "상품"};
	
	
	static final String[] Q_TITLEasFirst = {"도와줘요","운영자님","관리자야!","[질문]"+"<도움요청>"+""};

	static final String[] Q_NAMEasLastForMember = {"회원가입이 안돼요", "회원정보 수정 어케하죠", "비밀번호를 못찾겠어요 ㅠㅠ", "아이디가 뭐였죠", "멤버십포인트가 사라졌어요"};
	static final String[] Q_NAMEasLastForBuy = {"어떻게 사나요?", "배송은 몇일 걸리나요?", "왜 아직도 안와?", "빨리빨리"};
	static final String[] Q_NAMEasLastForSell = {"왜 아무도 안사냐", "가격 어케 바꾸나요", "판매처리 어케하나요", "판매과정이 어케됨?", "나 팔았는데 왜 돈 안줌"};
	static final String[] Q_NAMEasLastForProduct = {"제품이 이상해요","사진이 안보여요","저 가격이 맞는 가격인가요?","상품 설명이 부족합니다."};
//	static final String[] Q_NAMEasLastForExit = {"탈퇴좀 시켜줘!", "나를 잊어줘!", "내가 웃는게 웃는게 아니야~", "아들이 몰래 가입했어요 ㅠㅠ", "아내한테 걸리면 죽어요 빨리 탈퇴좀"};
//	static final String[] Q_NAMEasLastForRefund = {"환불좀.", "아 제품 개 작살났잖아요", "왜이래 이거. 환불이나 교환좀", "교환좀 해주세요.", "아놔 뭐야 이게"};

	static final String[] Q_CONTENT =  {"빨리x100", "고생하시는 건 알겠는데, 빨리좀 처리해주세요.", "빨리좀 빨리빨리빨리빨리좀 처리해주세요.", "아 언제까지 어케춤을 추게할거야.", "기다리다가 목빠지네용 ㅎㅎ", "기다리다가 기린이 되었습니다", "뭐하냐 운영자야. 노냐? 돈벌어야지?", "돈 쉽게 버는거 아니다. 당장 처리해라.", "사이트 관리자한테 공휴일이 어딨냐? 낮밤이 어딨냐? 빨리 처리해라."};
	
	static final String[] Q_REGDATEtoYEAR = {"2019", "2020" };
	
//	CREATE TABLE QNA_Q(
//		   Q_NO NUMBER PRIMARY KEY,
//		   M_NO NUMBER,
//		   Q_CARTEGORY VARCHAR2(20),
//		   Q_TITLE VARCHAR2(50),
//		   Q_CONTENT VARCHAR2(500),
//		   Q_DATE DATE,
//		   Q_STATE NUMBER,
//		   FOREIGN KEY (M_NO) REFERENCES MEMBER (M_NO)
//	);
	
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
	
	
	public static String Q_NAMEasLastSelecter(String q_category) {
		if(q_category.equals("회원")){
			return MTD3.getArrayData(MTD3.Q_NAMEasLastForMember);
		} else if(q_category.equals("상품")){
			return MTD3.getArrayData(MTD3.Q_NAMEasLastForProduct);
		} else if(q_category.equals("구매")){
			return MTD3.getArrayData(MTD3.Q_NAMEasLastForBuy);
		} else {
			return MTD3.getArrayData(MTD3.Q_NAMEasLastForSell);
		} /*else if(q_category.equals("탈퇴")){
			return MTD3.getArrayData(MTD3.Q_NAMEasLastForExit);
		} else if(q_category.equals("환불")){
			return MTD3.getArrayData(MTD3.Q_NAMEasLastForRefund);
		} else {
			return "기타";
		} */
	}
	
	
}



public class MakeTestDataForQnaQ {

	public static void main(String[] args) {
		
		
		for(int i=0;i<MTD3.RECORD_NUM;i++) {
			StringBuffer sb = new StringBuffer();
			
			int m_No = MTD3.getRandomIndex(2, 300); 	// 랜덤 질문자 번호 구하기. (1~500)
			int q_categoryNum = MTD3.getRandomIndex(0, 3); // 정확히 카테고리 4개
			String q_category = MTD3.Q_CATEGORY[q_categoryNum]; // 카테고리 이름 출력기
			
			
			sb.append("INSERT INTO ").append(MTD3.TABLE_NAME+" ").append("VALUES(");
			
			sb.append("QNA_Q_SEQ.NEXTVAL, ");	// Q_NO NUMBER PRIMARY KEY,
			sb.append(m_No+", ");	//	M_NO NUMBER,
			sb.append("'"+q_category+"', ");	// Q_CARTEGORY VARCHAR2(20),  
			sb.append("'"+MTD3.Q_NAMEasLastSelecter(q_category)+"', ");	//	 Q_TITLE VARCHAR2(50),
			sb.append("'"+MTD3.getArrayData(MTD3.Q_CONTENT)+"', "); // Q_CONTENT VARCHAR2(500),
			sb.append("'"+MTD3.getArrayData(MTD3.Q_REGDATEtoYEAR)+
					"/"+
					MTD3.getRandomIndex(1, 12)+
					"/"+
					MTD3.getRandomIndex(1, 28)+//2월이 28일까지밖에 없어서 제외해버림
					"', ");		//	Q_DATE DATE,
			sb.append(1);	//	Q_STATE NUMBER,   // 다 1
			
			sb.append(");");
			System.out.println(sb);
		}
		
//		CREATE TABLE QNA_Q(
//		   Q_NO NUMBER PRIMARY KEY,
//		   M_NO NUMBER,
//		   Q_CARTEGORY VARCHAR2(20),
//		   Q_TITLE VARCHAR2(50),
//		   Q_CONTENT VARCHAR2(500),
//		   Q_DATE DATE,
//		   Q_STATE NUMBER,
//		   FOREIGN KEY (M_NO) REFERENCES MEMBER (M_NO)
//	);
		
		

	}

}