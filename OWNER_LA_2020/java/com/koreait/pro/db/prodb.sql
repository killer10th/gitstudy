DROP TABLE NOTICE;
DROP TABLE CART;
DROP TABLE QNA_A;
DROP TABLE QNA_Q;
DROP TABLE PRODUCT;
DROP TABLE MEMBER;

DROP SEQUENCE NOTICE_SEQ;
DROP SEQUENCE CART_SEQ;
DROP SEQUENCE MEMBER_SEQ;
DROP SEQUENCE PRODUCT_SEQ;
DROP SEQUENCE QNA_Q_SEQ;
DROP SEQUENCE QNA_A_SEQ;

CREATE TABLE MEMBER(
    M_NO NUMBER PRIMARY KEY,
    M_NAME VARCHAR2(20) NOT NULL,
    M_ID VARCHAR2(100) NOT NULL UNIQUE,
    M_PW VARCHAR2(100) NOT NULL,
    M_PHONE VARCHAR2(20) NOT NULL UNIQUE,
    M_EMAIL VARCHAR2(100) NOT NULL UNIQUE,
    M_ADDRESS VARCHAR2(200),
    M_REGDATE DATE,
    M_GRADE VARCHAR2(20),
    M_MONEY NUMBER,
    M_POINT NUMBER,
    M_STATE NUMBER -- 탈퇴여부 (2)-관리자 (1)-일반사용자 (0)-탈퇴한 사용자 
);

CREATE TABLE PRODUCT (
    P_NO NUMBER PRIMARY KEY,
    S_NO NUMBER NOT NULL,
    B_NO NUMBER,
    P_NAME VARCHAR2(20) NOT NULL,
    P_CARTEGORY VARCHAR2(50) NOT NULL,
    P_CONTENT VARCHAR2(500) NOT NULL,
    P_PRICE NUMBER NOT NULL,
    P_IMG_PATH VARCHAR2(500),
    P_REGDATE DATE,
    P_HIT NUMBER,
    P_STATE NUMBER, -- (1)판매중 (2)승인대기중 (-1)판매완료
    FOREIGN KEY (S_NO) REFERENCES MEMBER (M_NO),
    FOREIGN KEY (B_NO) REFERENCES MEMBER (M_NO)
);

CREATE TABLE QNA_Q(
   Q_NO NUMBER PRIMARY KEY,
   M_NO NUMBER,
   Q_CARTEGORY VARCHAR2(20),
   Q_TITLE VARCHAR2(50),
   Q_CONTENT VARCHAR2(500),
   Q_DATE DATE,
   Q_STATE NUMBER,
   FOREIGN KEY (M_NO) REFERENCES MEMBER (M_NO)
);

CREATE TABLE QNA_A(
   A_NO NUMBER PRIMARY KEY,
   Q_NO NUMBER NOT NULL UNIQUE,
   A_CONTENT VARCHAR2(500),
   A_DATE DATE,
   FOREIGN KEY (Q_NO) REFERENCES QNA_Q (Q_NO)
);

CREATE TABLE CART(
  C_NO NUMBER PRIMARY KEY,
  M_ID VARCHAR2(100) NOT NULL UNIQUE, 
  P_NO NUMBER,
  FOREIGN KEY (M_ID) REFERENCES MEMBER (M_ID),
  FOREIGN KEY (P_NO) REFERENCES PRODUCT (P_NO)    
);

CREATE TABLE NOTICE(
    N_NO NUMBER PRIMARY KEY,
    M_NO NUMBER NOT NULL,
    N_TITLE VARCHAR2(50),
    N_CONTENT VARCHAR2(500),
    N_DATE DATE,
    FOREIGN KEY (M_NO) REFERENCES MEMBER (M_NO)
);

CREATE SEQUENCE MEMBER_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 999999
NOCYCLE
NOCACHE;

CREATE SEQUENCE PRODUCT_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 999999
NOCYCLE
NOCACHE;

CREATE SEQUENCE QNA_Q_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 999999
NOCYCLE
NOCACHE;

CREATE SEQUENCE QNA_A_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 999999
NOCYCLE

NOCACHE;

CREATE SEQUENCE CART_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 999999
NOCYCLE
NOCACHE;

CREATE SEQUENCE NOTICE_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 999999
NOCYCLE
NOCACHE;

INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'관리자','admin','1111', '010-0000-0000', 'admin@gmaile.com', '서울시 종로구 ', SYSDATE, 'CHALLENGER', 0, 1000000,2);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'가길동','user1','1111', '010-1111-0000', 'user1@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'나길동','user2','1111', '010-2222-0000', 'user2@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'다길동','user3','1111', '010-3333-0000', 'user3@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'라길동','user4','1111', '010-4444-0000', 'user4@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'마길동','user5','1111', '010-5555-0000', 'user5@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'바길동','user6','1111', '010-6666-0000', 'user6@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'사길동','user7','1111', '010-7777-0000', 'user7@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user8','1111', '010-8888-0000', 'user8@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user9','1111', '010-9999-0000', 'user9@gmaile.com', '서울시 성북구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user10','1111', '010-0010-0000', 'user10@gmaile.com', '서울시 성북구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user11','1111', '010-0011-0000', 'user11@gmaile.com', '서울시 마포구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user12','1111', '010-0012-0000', 'user12@gmaile.com', '서울시 용산구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user13','1111', '010-0013-0000', 'user13@gmaile.com', '서울시 용산구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user14','1111', '010-0014-0000', 'user14@gmaile.com', '서울시 송파구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user15','1111', '010-0015-0000', 'user15@gmaile.com', '서울시 송파구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user16','1111', '010-0016-0000', 'user16@gmaile.com', '서울시 용산구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user17','1111', '010-0017-0000', 'user17@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
INSERT INTO MEMBER VALUES (MEMBER_SEQ.NEXTVAL,'아길동','user18','1111', '010-0018-0000', 'user18@gmaile.com', '서울시 종로구', SYSDATE, 'BRONZE',0,0,1);
COMMIT



