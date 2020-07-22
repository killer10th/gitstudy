package com.koreait.pro.db;

//MTD : MakeTestData
class MTD2{
	//Field
	static final int RECORD_NUM = 54; // 9*6
	static final String TABLE_NAME = "PRODUCT";
	static final String[] P_CATEGORY = {"패션", "전자기기", "음식", "도서", "스포츠용품", "음반"};
	static final String[] P_NAMEasFirst = {"[대박] ","특가 ","!!믿을수없다!! ","<지금까지 이런 상품은 없었다> ","<거짓말 아냐!> ","","","[인기상품] ","[베스트 셀러] ","[신제품] ","직접보고 판단하세요 ","[매진임박]"};

	static final String[] P_NAMEasLastForFashion = {"오푸스 슬리퍼", "남성용 베이지색 드레스셔츠", "핏좋은 검은색 바지", "검은색 등딱지 가방+가방걸이", "검은색 컨버스", "리신 벙거지 모자", "간지폭발 사이드백", "블랙 샌들", "검은색 여성용 트레이너 하의"};
	static final String[] P_NAMEasLastForDigital = {"공기청정기", "에어컨", "에어팟", "갤럭시워치", "드론", "갤럭시S12", "선풍기", "전자체중계", "갤럭시폴드"};
	static final String[] P_NAMEasLastForFood = {"참외 한박스", "수박10통", "양파1박스", "일편단심 간편 스파게티", "팔도 남자라면", "건강식 냉동 도시락", "비비고 불고기 비빔밥", "전통순대 애 빠지다", "간편식 낙곱새(낙지곱창새우)"};
	static final String[] P_NAMEasLastForBook = {"박경리의 토지(만화)", "통큰인물이야기(전집)", "책쓰는토요일", "포토샵 사전", "독서법도 모르면서 책을 읽는 사람들", "밥보단 책", "책이 답이다", "영화학교에서 배운 101가지", "영어전공서"};
	static final String[] P_NAMEasLastForSports = {"던롭 테니스 채","요넥스 배드민턴 공 2박스","요넥스 배드민턴채","SKLZ 탱탱볼","STAR 림보세트","STAR 야구공","SPALDING 싸인볼 농구공","챔피온 정품 탁구대","스타 샌드백(사람아님)"};
	static final String[] P_NAMEasLastForMusic = {"지코-아무노래","BTS(방탄소년단)-데뷔앨범","IU(아이유)-사랑시","TWICE(트와이스)-MORE AND MORE","RED VELVET(레드벨벳)-Red Summer", "BlackPink(블랙핑크)-Square One", "BigBang(빅뱅)-First Single Album", "IZ(아이즈)-HEART", "NCT-127"};

	static final String[] P_NAMEasLast2ForFashion = {"부드러운 원단", "보기좋은 핏", "최신 트렌드", "드라마에 나왔던 그 상품", "커플아이템", "복고풍"};
	static final String[] P_NAMEasLast2ForDigital = {"최신기종","가성비 갑","아이팟","태블릿"};
	static final String[] P_NAMEasLast2ForFood = {"맛있다", "냉장고를찾아줘 등장", "백XX 씨가 개발함", "야 이가격에 이 맛이 말이 돼냐!!"};
	static final String[] P_NAMEasLast2ForBook = {"오우 긴장되서 오줌 지려버림 ㅎ", "스포는 안하는데, 강추입니다.", "넘모 감동적이야! 인생작!", "크으, 지렸다. 그래, 이 재미지!", "너무 환상적이야. 작가의 상상력!", "저자에게 배울 점이 많습니다.", "더이상은 이 책 보기 싫어!", "쉬운 책은 아닙니다."};
	static final String[] P_NAMEasLast2ForSports = {"상태 아주 좋습니다.", "내구도가 장난 아니예요!", "부상 방지에 탁월합니다.", "우리나라 XX 선수가 쓰는 제품!", "POTG(Player of the Game)이 되고 싶으시다면 선택하세요!"};
	static final String[] P_NAMEasLast2ForMusic = {"너무 감동적인 음악입니다.", "첫사랑이 떠오르네요. ㅜㅜ dogbaby", "첫사랑이 떠오르네요. ㅜㅜ 잘 지내니?", "오우 예 씐나 씐나!", "예 비트에 비트는 몸을 맞겨!", "이번 신곡 지렸다!", "꺅 오빠들 넘 멋져", "꺅 언니들 넘 멋져"};

	static final String[] P_IMG_PATHForFashion = {"fashion1","fashion2","fashion3","fashion4","fashion5","fashion6","fashion7","fashion8","fashion9"};
	static final String[] P_IMG_PATHForDigital = {"digital1","digital2","digital3","digital4","digital5","digital6","digital7","digital8","digital9"};
	static final String[] P_IMG_PATHForFood = {"food1","food2","food3","food4","food5","food6","food7","food8","food9"};
	static final String[] P_IMG_PATHForBook = {"book1","book2","book3","book4","book5","book6","book7","book8","book9"};
	static final String[] P_IMG_PATHForSports = {"sports1","sports2","sports3","sports4","sports5","sports6","sports7","sports8","sports9"};
	static final String[] P_IMG_PATHForMusic = {"music1","music2","music3","music4","music5","music6","music7","music8","music9"};

	static final String[] P_REGDATEtoYEAR = {"2019", "2020" };

	//	CREATE TABLE PRODUCT (
	//		    P_NO NUMBER PRIMARY KEY,
	//		    S_NO NUMBER NOT NULL, 		 -- sellerNumber
	//		    B_NO NUMBER,				 -- BuyerNumber
	//		    P_NAME VARCHAR2(20) NOT NULL,
	//		    P_CARTEGORY VARCHAR2(50) NOT NULL,	-- fashion  digital  food  book  sports  music
	//		    P_CONTENT VARCHAR2(500) NOT NULL,  --  상품설명~(글 내용)
	//		    P_PRICE NUMBER NOT NULL,
	//		    P_IMG_PATH VARCHAR2(500),  -- resources/storage/P_NOimg1.jpg
	//		    P_REGDATE DATE,		
	//		    P_HIT NUMBER,		
	//		    P_STATE NUMBER,				 -- (1)판매중 (2)승인대기중 (-1)판매완료
	//		    FOREIGN KEY (S_NO) REFERENCES MEMBER (M_NO),
	//		    FOREIGN KEY (B_NO) REFERENCES MEMBER (M_NO)
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

	public static String RepeatContent(int n, String p_Category) {
		String message="";
		for(int i=0; i<getRandomIndex(n); i++) {
			message += MTD2.P_NAMEasLast2Selecter(p_Category) + "     ";
		}
		return message;
	}

	public static String P_NAMEasLastSelecter(String p_Category, int n) {
		if(p_Category.equals("패션")){
			return MTD2.P_NAMEasLastForFashion[n];
		} else if(p_Category.equals("전자기기")){
			return MTD2.P_NAMEasLastForDigital[n];
		} else if(p_Category.equals("음식")){
			return MTD2.P_NAMEasLastForFood[n];
		} else if(p_Category.equals("도서")){
			return MTD2.P_NAMEasLastForBook[n];
		} else if(p_Category.equals("스포츠용품")){
			return MTD2.P_NAMEasLastForSports[n];
		} else if(p_Category.equals("음반")){
			return MTD2.P_NAMEasLastForMusic[n];
		} else {
			return "기타";
		}
	}

	public static String P_NAMEasLast2Selecter(String p_Category) {
		if(p_Category.equals("패션")){
			return MTD2.getArrayData(MTD2.P_NAMEasLast2ForFashion);
		} else if(p_Category.equals("전자기기")){
			return MTD2.getArrayData(MTD2.P_NAMEasLast2ForDigital);
		} else if(p_Category.equals("음식")){
			return MTD2.getArrayData(MTD2.P_NAMEasLast2ForFood);
		} else if(p_Category.equals("도서")){
			return MTD2.getArrayData(MTD2.P_NAMEasLast2ForBook);
		} else if(p_Category.equals("스포츠용품")){
			return MTD2.getArrayData(MTD2.P_NAMEasLast2ForSports);
		} else if(p_Category.equals("음반")){
			return MTD2.getArrayData(MTD2.P_NAMEasLast2ForMusic);
		} else {
			return "";
		}
	}

	public static int P_STATESelector(int n) {
		if(n==0) {
			return -1;
		}else {
			return n;
		}
	}

	public static String getImagePath(String p_Category) {
		if(p_Category.equals("패션")){
			return "fashion.jpg";
		} else if(p_Category.equals("전자기기")){
			return "digital.jpg";
		} else if(p_Category.equals("음식")){
			return "food.jpg";
		} else if(p_Category.equals("도서")){
			return "book.jpg";
		} else if(p_Category.equals("스포츠용품")){
			return "sports.jpg";
		} else if(p_Category.equals("음반")){
			return "music.jpg";
		} else {
			return "";
		}
	}
	
	public static String getEngCategory(String p_Category) {
		if(p_Category.equals("패션")){
			return "fashion";
		} else if(p_Category.equals("전자기기")){
			return "digital";
		} else if(p_Category.equals("음식")){
			return "food";
		} else if(p_Category.equals("도서")){
			return "book";
		} else if(p_Category.equals("스포츠용품")){
			return "sports";
		} else if(p_Category.equals("음반")){
			return "music";
		} else {
			return "";
		}
	}
	
	public static String getKorCategory(String engCategory) {
		if(engCategory.equals("fashion")){
			return "패션";
		} else if(engCategory.equals("digital")){
			return "전자기기";
		} else if(engCategory.equals("food")){
			return "음식";
		} else if(engCategory.equals("book")){
			return "도서";
		} else if(engCategory.equals("sports")){
			return "스포츠용품";
		} else if(engCategory.equals("music")){
			return "음반";
		} else {
			return "";
		}
	}
	
	public static String getRealCategory(int n) {
		if(n<9){
			return "fashion";
		} else if(n<18){
			return "digital";
		} else if(n<27){
			return "food";
		} else if(n<36){
			return "book";
		} else if(n<45){
			return "sports";
		} else{
			return "music";
		}
	}
	
	public static String getRealCategory(String p_Category, int n) {
		if(p_Category.equals("패션")){
			return P_IMG_PATHForFashion[n];
		} else if(p_Category.equals("전자기기")){
			return P_IMG_PATHForDigital[n];
		} else if(p_Category.equals("음식")){
			return P_IMG_PATHForFood[n];
		} else if(p_Category.equals("도서")){
			return P_IMG_PATHForBook[n];
		} else if(p_Category.equals("스포츠용품")){
			return P_IMG_PATHForSports[n];
		} else if(p_Category.equals("음반")){
			return P_IMG_PATHForMusic[n];
		} else {
			return "";
		}
	}

	public static String P_IMG_PATHSelector(String p_Category) {
		if(p_Category.equals("패션")){
			return MTD2.getArrayData(MTD2.P_IMG_PATHForFashion);
		} else if(p_Category.equals("전자기기")){
			return MTD2.getArrayData(MTD2.P_IMG_PATHForDigital);
		} else if(p_Category.equals("음식")){
			return MTD2.getArrayData(MTD2.P_IMG_PATHForFood);
		} else if(p_Category.equals("도서")){
			return MTD2.getArrayData(MTD2.P_IMG_PATHForBook);
		} else if(p_Category.equals("스포츠용품")){
			return MTD2.getArrayData(MTD2.P_IMG_PATHForSports);
		} else if(p_Category.equals("음반")){
			return MTD2.getArrayData(MTD2.P_IMG_PATHForMusic);
		} else {
			return "";
		}
	}

}


public class MakeTestDataForProduct {

	public static void main(String[] args) {

		for(int i=0;i<MTD2.RECORD_NUM;i++) {
			StringBuffer sb = new StringBuffer();
			int s_No = MTD2.getRandomIndex(2, 300); // 랜덤 판매자 번호 구하기. 활동중인 회원만 나오게 (1~1000)
//			int p_state = MTD2.P_STATESelector(MTD2.getRandomIndex(1, 2)); // 1/2
//			boolean run = true;
//			if(p_state == 1) { //판매중이면 b_No(구매자)는 아직 안결정되었으니까
//				run = false;
//			}
//			String b_No = null;
//			while(run) {	//중복 방지(구매자 != 판매자)
//				b_No = Integer.toString(MTD2.getRandomIndex(2, 300)); // 활동중인 회원만 나오게
//				if(b_No != Integer.toString(s_No)) {
//					run = false;
//				}
//			}

			int n = i%9;

			String eng_Category = MTD2.getRealCategory(i);
			String p_Category = MTD2.getKorCategory(eng_Category);

			int day = i+1;
			int month = 6;
			if(day>30) {
				day = day-30;
				month = 7;
			}

			int firstNum = MTD2.getRandomIndex(10000, 500000);
			int sizeOfCut = 100;
			int price = (int)Math.floor(firstNum/sizeOfCut)*100;

//			String imgName = MTD2.getRealCategory(p_Category, n);
			String imgName = MTD2.getRealCategory(p_Category, n);

			sb.append("INSERT INTO ").append(MTD2.TABLE_NAME+" ").append("VALUES(");

			sb.append("PRODUCT_SEQ.NEXTVAL, "); //  P_NO NUMBER PRIMARY KEY,
			sb.append(s_No+", "); // S_NO NUMBER NOT NULL, 		 -- sellerNumber
			sb.append("NULL, "); // B_NO NUMBER,				 -- BuyerNumber
//			sb.append(b_No+", "); // B_NO NUMBER,				 -- BuyerNumber
			sb.append("'"+
					MTD2.getArrayData(MTD2.P_NAMEasFirst)+
					MTD2.P_NAMEasLastSelecter(p_Category, n)+
					"', "); // P_NAME VARCHAR2(20) NOT NULL,
			sb.append("'"+eng_Category+"', ");  // P_CARTEGORY VARCHAR2(50) NOT NULL,	-- fashion  digital  food  book  sports  music
			sb.append("'"+MTD2.RepeatContent(10, p_Category)+" "+
					"', "); // P_CONTENT VARCHAR2(500) NOT NULL,  --  상품설명~(글 내용)
			sb.append(price+", "); // P_PRICE NUMBER NOT NULL,
			sb.append("'"+imgName+".jpg', "); // P_IMG_PATH VARCHAR2(500),  -- resources/storage/imgName.jpg
			sb.append("'2020"+
					"/"+
					month+
					"/"+
					day+
					"', "); // P_REGDATE DATE,		
//			sb.append("'"+MTD2.getArrayData(MTD2.P_REGDATEtoYEAR)+
//					"/"+
//					MTD2.getRandomIndex(1, 12)+
//					"/"+
//					MTD2.getRandomIndex(1, 28)+//2월이 28일까지밖에 없어서 제외해버림
//					"', "); // P_REGDATE DATE,		
			sb.append(MTD2.getRandomIndex(100000)+", "); // P_HIT NUMBER,	
			sb.append("1"); // P_STATE NUMBER,				 -- (1)판매중 (2)판매완료
			//sb.append(p_state+""); // P_STATE NUMBER,				 -- (1)판매중 (2)판매완료
			sb.append(");");
			System.out.println(sb);

		}

		//		CREATE TABLE PRODUCT (
		//	    P_NO NUMBER PRIMARY KEY,
		//	    S_NO NUMBER NOT NULL, 		 -- sellerNumber
		//	    B_NO NUMBER,				 -- BuyerNumber
		//	    P_NAME VARCHAR2(20) NOT NULL,
		//	    P_CARTEGORY VARCHAR2(50) NOT NULL,	-- fashion  digital  food  book  sports  music
		//	    P_CONTENT VARCHAR2(500) NOT NULL,  --  상품설명~(글 내용)
		//	    P_PRICE NUMBER NOT NULL,
		//	    P_IMG_PATH VARCHAR2(500),  -- resources/storage/P_NOimg1.jpg
		//	    P_REGDATE DATE,		
		//	    P_HIT NUMBER,		
		//	    P_STATE NUMBER,				 -- (1)판매중 (2)승인대기중 (-1)판매완료
		//	    FOREIGN KEY (S_NO) REFERENCES MEMBER (M_NO),
		//	    FOREIGN KEY (B_NO) REFERENCES MEMBER (M_NO)
		//	);

	}

}