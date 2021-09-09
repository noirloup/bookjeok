-- 테이블 순서는 관계를 고려하여 한 번에 실행해도 에러가 발생하지 않게 정렬되었습니다.

-- TB_CATEGORY Table Create SQL

DROP TABLE TB_CATEGORY CASCADE CONSTRAINTS;

CREATE TABLE TB_CATEGORY
(
    CATE_CD      NUMBER          NOT NULL, 
    BOOK_CATEGORY    VARCHAR2(50)    NOT NULL, 
    CONSTRAINT PK_TB_BOOK_TYPE PRIMARY KEY (CATE_CD)
);

COMMENT ON TABLE TB_CATEGORY IS '카테고리';
COMMENT ON COLUMN TB_CATEGORY.CATE_CD IS '상품장르번호';
COMMENT ON COLUMN TB_CATEGORY.BOOK_CATEGORY IS '상품장르';


-- TB_PRODUCT_TYPE Table Create SQL

DROP TABLE TB_PRODUCT_TYPE CASCADE CONSTRAINTS;

CREATE TABLE TB_PRODUCT_TYPE
(
    P_TYPE_NUM      NUMBER          NOT NULL, 
    PRODUCT_TYPE    VARCHAR2(50)    NOT NULL, 
    CONSTRAINT PK_TB_PRODUCT_TYPE PRIMARY KEY (P_TYPE_NUM)
);

COMMENT ON TABLE TB_PRODUCT_TYPE IS '상품분류';
COMMENT ON COLUMN TB_PRODUCT_TYPE.P_TYPE_NUM IS '상품분류번호';
COMMENT ON COLUMN TB_PRODUCT_TYPE.PRODUCT_TYPE IS '상품분류명';


-- TB_PRODUCT_LOC Table Create SQL

DROP TABLE TB_PRODUCT_LOC CASCADE CONSTRAINTS;

CREATE TABLE TB_PRODUCT_LOC
(
    P_LOC_NUM      NUMBER          NOT NULL, 
    PRODUCT_LOCATION    VARCHAR2(50)    NOT NULL, 
    CONSTRAINT PK_TB_PRODUCT_LOC PRIMARY KEY (P_LOC_NUM)
);

COMMENT ON TABLE TB_PRODUCT_LOC IS '상품국내외분류';
COMMENT ON COLUMN TB_PRODUCT_LOC.P_LOC_NUM IS '상품국내외번호';
COMMENT ON COLUMN TB_PRODUCT_LOC.PRODUCT_LOCATION IS '상품국내외분류';


DROP TABLE TB_OTHER_SITE CASCADE CONSTRAINTS;

-- TB_OTHER_SITE Table Create SQL
CREATE TABLE TB_OTHER_SITE
(
    SITE_CD         NUMBER          NOT NULL, 
    SITE_BOOK_ID    NUMBER          NOT NULL, 
    SITE_NM         VARCHAR2(30)    NOT NULL, 
    SITE_PRICE      NUMBER   DEFAULT '0000'  NOT NULL, 
    CONSTRAINT PK_TB_OTHER_SITE PRIMARY KEY (SITE_CD)
);

COMMENT ON TABLE TB_OTHER_SITE IS '타 도서 사이트';
COMMENT ON COLUMN TB_OTHER_SITE.SITE_CD IS '사이트고유번호';
COMMENT ON COLUMN TB_OTHER_SITE.SITE_NM IS '사이트이름';
COMMENT ON COLUMN TB_OTHER_SITE.SITE_PRICE IS '사이트가격';
COMMENT ON COLUMN TB_OTHER_SITE.SITE_BOOK_ID IS '상품고유번호';

ALTER TABLE TB_OTHER_SITE
    ADD CONSTRAINT FK_TB_OTHER_SITE_SITE_BOOK_ID_ FOREIGN KEY (SITE_BOOK_ID)
        REFERENCES TB_BOOK (BOOK_ID);


DROP TABLE TB_BOOK CASCADE CONSTRAINTS;

-- TB_BOOK Table Create SQL
CREATE TABLE TB_BOOK
(
    BOOK_ID         NUMBER            NOT NULL, 
    BOOK_CATE_CD    NUMBER            NOT NULL, 
    BOOK_TYPE_NUM      NUMBER          NOT NULL,
    BOOK_LOC_NUM      NUMBER          NOT NULL,
    BOOK_IMG        VARCHAR2(300)        NOT NULL,
    BOOK_NM         VARCHAR2(300)      NOT NULL, 
    ISBN            NUMBER            NOT NULL, 
    RANKING         NUMBER            NULL, 
    BOOK_INTRO      VARCHAR2(4000)    NOT NULL, 
    AUTHOR          VARCHAR2(40)      NOT NULL, 
    AUTHOR_INTRO    VARCHAR2(2000)    NOT NULL, 
    BOOK_PRICE      NUMBER            NOT NULL, 
    AVG_SCORE       NUMBER            NULL, 
    PUBLISHER       VARCHAR2(30)      NOT NULL, 
    PUBLISH_DATE    DATE              NOT NULL, 
    BOOK_INDEX      VARCHAR2(1000)    NOT NULL, 
    CONSTRAINT PK_TB_BOOK PRIMARY KEY (BOOK_ID)
);

COMMENT ON TABLE TB_BOOK IS '도서';
COMMENT ON COLUMN TB_BOOK.BOOK_ID IS '상품고유번호';
COMMENT ON COLUMN TB_BOOK.BOOK_CATE_CD IS '상품장르번호';
COMMENT ON COLUMN TB_BOOK.BOOK_TYPE_NUM IS '상품분류번호';
COMMENT ON COLUMN TB_BOOK.BOOK_LOC_NUM IS '상품국내외번호';
COMMENT ON COLUMN TB_BOOK.BOOK_IMG IS '상품이미지';
COMMENT ON COLUMN TB_BOOK.BOOK_NM IS '상품명(도서명)';
COMMENT ON COLUMN TB_BOOK.ISBN IS 'ISBN';
COMMENT ON COLUMN TB_BOOK.RANKING IS '도서순위';
COMMENT ON COLUMN TB_BOOK.BOOK_INTRO IS '도서소개';
COMMENT ON COLUMN TB_BOOK.AUTHOR IS '저자';
COMMENT ON COLUMN TB_BOOK.AUTHOR_INTRO IS '저자소개';
COMMENT ON COLUMN TB_BOOK.BOOK_PRICE IS '가격';
COMMENT ON COLUMN TB_BOOK.AVG_SCORE IS '평균평점';
COMMENT ON COLUMN TB_BOOK.PUBLISHER IS '출판사';
COMMENT ON COLUMN TB_BOOK.PUBLISH_DATE IS '발행일';
COMMENT ON COLUMN TB_BOOK.BOOK_INDEX IS '목차';

ALTER TABLE TB_BOOK
    ADD CONSTRAINT FK_TB_BOOK_BOOK_CATE_CD_TB_BOO FOREIGN KEY (BOOK_CATE_CD)
        REFERENCES TB_CATEGORY (CATE_CD);
        
ALTER TABLE TB_BOOK
    ADD CONSTRAINT FK_TB_BOOK_BOOK_TYPE_NUM_TB_BOO FOREIGN KEY (BOOK_TYPE_NUM)
        REFERENCES TB_PRODUCT_TYPE (P_TYPE_NUM);
        
ALTER TABLE TB_BOOK
    ADD CONSTRAINT FK_TB_BOOK_BOOK_LOC_NUM_TB_BOO FOREIGN KEY (BOOK_LOC_NUM)
        REFERENCES TB_PRODUCT_LOC (P_LOC_NUM);


DROP TABLE TB_USER CASCADE CONSTRAINTS;

-- TB_USER Table Create SQL
CREATE TABLE TB_USER
(
    USER_ID         VARCHAR2(20)     NOT NULL, 
    NICKNAME        VARCHAR2(20)     NOT NULL, 
    USER_PWD        VARCHAR2(40)     NOT NULL, 
    USER_NM         VARCHAR2(40)     NOT NULL, 
    GENDER          CHAR(1)             NOT NULL,
    AGE             NUMBER             NOT NULL, 
    PHONE           VARCHAR2(30)     NOT NULL, 
    EMAIL           VARCHAR2(40)     NOT NULL, 
    ADDR_POST   NUMBER              NULL,
    ADDR            VARCHAR2(80)     NULL, 
    ADDR_DETAIL     VARCHAR2(100)    NULL, 
    POINT           NUMBER     DEFAULT '0'      NOT NULL, 
    USER_INTRO    VARCHAR2(300)    NULL, 
    PREFERRED       VARCHAR2(100)   NULL,
    USER_RANK     VARCHAR2(20)    DEFAULT 'NEW'    NOT NULL, 
    ADMIN           CHAR(1)     DEFAULT 'N'     NOT NULL, 
    CONSTRAINT PK_TB_USER PRIMARY KEY (USER_ID)
);

COMMENT ON TABLE TB_USER IS '회원 정보';
COMMENT ON COLUMN TB_USER.USER_ID IS '아이디';
COMMENT ON COLUMN TB_USER.NICKNAME IS '닉네임';
COMMENT ON COLUMN TB_USER.USER_PWD IS '암호';
COMMENT ON COLUMN TB_USER.USER_NM IS '이름';
COMMENT ON COLUMN TB_USER.GENDER IS '성별';
COMMENT ON COLUMN TB_USER.AGE IS '나이';
COMMENT ON COLUMN TB_USER.PHONE IS '전화번호';
COMMENT ON COLUMN TB_USER.EMAIL IS '이메일';
COMMENT ON COLUMN TB_USER.ADDR_POST IS '우편번호';
COMMENT ON COLUMN TB_USER.ADDR IS '주소';
COMMENT ON COLUMN TB_USER.ADDR_DETAIL IS '상세주소';
COMMENT ON COLUMN TB_USER.POINT IS '포인트';
COMMENT ON COLUMN TB_USER.USER_INTRO IS '소개';
COMMENT ON COLUMN TB_USER.PREFERRED IS '선호 장르';
COMMENT ON COLUMN TB_USER.USER_RANK IS '회원등급';
COMMENT ON COLUMN TB_USER.ADMIN IS '관리자권한';


DROP TABLE TB_SALETYPE CASCADE CONSTRAINTS;

-- TB_SALETYPE Table Create SQL
CREATE TABLE TB_SALETYPE
(
    TYPE_NUM          NUMBER           NOT NULL, 
    SALE_TYPE          VARCHAR2(20)     NOT NULL, 
     PRIMARY KEY (TYPE_NUM)
);

COMMENT ON TABLE TB_SALETYPE IS '판매_방식';
COMMENT ON COLUMN TB_SALETYPE.TYPE_NUM IS '판매방식번호';
COMMENT ON COLUMN TB_SALETYPE.SALE_TYPE IS '판매방식';


DROP TABLE TB_USED_NORMAL CASCADE CONSTRAINTS;

-- TB_USED_NORMAL Table Create SQL
CREATE TABLE TB_USED_NORMAL
(
    N_MARKET_CD          NUMBER           NOT NULL, 
    N_TYPE_NUM          NUMBER     NOT NULL, 
    N_USER_WRITER_ID     VARCHAR2(20)     NOT NULL, 
    N_USED_BOOK_ID       NUMBER           NOT NULL, 
    PRICE              NUMBER           NOT NULL, 
    N_REG_DATE         DATE         DEFAULT SYSDATE         NOT NULL, 
    REG_COUNT          NUMBER           NOT NULL, 
    SALE_COUNT         NUMBER          DEFAULT '0'       NOT NULL, 
    N_USED_BOOK_INTRO    VARCHAR2(300)    NOT NULL, 
    N_QUALITY            CHAR(1)          NOT NULL, 
     PRIMARY KEY (N_MARKET_CD)
);

COMMENT ON TABLE TB_USED_NORMAL IS '장터_일반';
COMMENT ON COLUMN TB_USED_NORMAL.N_MARKET_CD IS '일반장터고유번호';
COMMENT ON COLUMN TB_USED_NORMAL.N_TYPE_NUM IS '판매방식번호';
COMMENT ON COLUMN TB_USED_NORMAL.N_USER_WRITER_ID IS '작성자아이디';
COMMENT ON COLUMN TB_USED_NORMAL.N_USED_BOOK_ID IS '상품고유번호';
COMMENT ON COLUMN TB_USED_NORMAL.PRICE IS '판매가';
COMMENT ON COLUMN TB_USED_NORMAL.N_REG_DATE IS '등록날짜';
COMMENT ON COLUMN TB_USED_NORMAL.REG_COUNT IS '초기등록수량';
COMMENT ON COLUMN TB_USED_NORMAL.SALE_COUNT IS '판매수량';
COMMENT ON COLUMN TB_USED_NORMAL.N_USED_BOOK_INTRO IS '상품 소개';
COMMENT ON COLUMN TB_USED_NORMAL.N_QUALITY IS '품질';

ALTER TABLE TB_USED_NORMAL
    ADD CONSTRAINT FK_TB_USED_NORMAL_N_TYPE_NUM FOREIGN KEY (N_TYPE_NUM)
        REFERENCES TB_SALETYPE (TYPE_NUM);
        
ALTER TABLE TB_USED_NORMAL
    ADD CONSTRAINT FK_TB_USED_NORMAL_N_USER_WRITER_ID FOREIGN KEY (N_USER_WRITER_ID)
        REFERENCES TB_USER (USER_ID);

ALTER TABLE TB_USED_NORMAL
    ADD CONSTRAINT FK_TB_USED_NORMAL_N_USED_BOOK_ID FOREIGN KEY (N_USED_BOOK_ID)
        REFERENCES TB_BOOK (BOOK_ID);
        

DROP TABLE TB_USED_AUCTION CASCADE CONSTRAINTS;

-- TB_USED_AUCTION Table Create SQL
CREATE TABLE TB_USED_AUCTION
(
    A_MARKET_CD       NUMBER     NOT NULL, 
    A_TYPE_NUM          NUMBER      DEFAULT '1'    NOT NULL, 
    A_USER_WRITER_ID     VARCHAR2(20)     NOT NULL, 
    A_USED_BOOK_ID       NUMBER           NOT NULL, 
    START_BID       NUMBER      DEFAULT '0'     NOT NULL, 
    BID_COUNT   NUMBER      DEFAULT '0'     NOT NULL,
    CURRENT_BID     NUMBER      DEFAULT '0'     NOT NULL, 
    A_BID_USER     VARCHAR2(20)     NULL, 
    A_REG_DATE      DATE    DEFAULT SYSDATE       NOT NULL, 
    A_CLOSE_DATE    DATE       NOT NULL, 
    SALE_STATE      CHAR(1)     DEFAULT 'N'    NOT NULL, 
    SALE_FIN        NUMBER      DEFAULT '0'     NOT NULL, 
    A_USED_BOOK_INTRO    VARCHAR2(300)    NOT NULL, 
    A_QUALITY            CHAR(1)          NOT NULL, 
    CONSTRAINT PK_TB_USED_AUCTION PRIMARY KEY (A_MARKET_CD)
);

COMMENT ON TABLE TB_USED_AUCTION IS '장터_경매';
COMMENT ON COLUMN TB_USED_AUCTION.A_MARKET_CD IS '경매장터고유번호';
COMMENT ON COLUMN TB_USED_AUCTION.A_TYPE_NUM IS '판매방식번호';
COMMENT ON COLUMN TB_USED_AUCTION.A_USER_WRITER_ID IS '작성자아이디';
COMMENT ON COLUMN TB_USED_AUCTION.A_USED_BOOK_ID IS '상품고유번호';
COMMENT ON COLUMN TB_USED_AUCTION.START_BID IS '시작입찰가';
COMMENT ON COLUMN TB_USED_AUCTION.BID_COUNT IS '입찰 횟수';
COMMENT ON COLUMN TB_USED_AUCTION.CURRENT_BID IS '현재입찰가';
COMMENT ON COLUMN TB_USED_AUCTION.A_BID_USER IS '입찰유저 아이디';
COMMENT ON COLUMN TB_USED_AUCTION.A_REG_DATE IS '등록날짜';
COMMENT ON COLUMN TB_USED_AUCTION.A_CLOSE_DATE IS '마감날짜';
COMMENT ON COLUMN TB_USED_AUCTION.SALE_STATE IS '판매상태';
COMMENT ON COLUMN TB_USED_AUCTION.SALE_FIN IS '판매완료(y=1)';
COMMENT ON COLUMN TB_USED_AUCTION.A_USED_BOOK_INTRO IS '상품 소개';
COMMENT ON COLUMN TB_USED_AUCTION.A_QUALITY IS '품질)';

ALTER TABLE TB_USED_AUCTION
    ADD CONSTRAINT FK_TB_USED_AUCTION_A_TYPE_NUM FOREIGN KEY (A_TYPE_NUM)
        REFERENCES TB_SALETYPE (TYPE_NUM);
        
ALTER TABLE TB_USED_AUCTION
    ADD CONSTRAINT FK_TB_USED_AUCTION_A_USER_WRITER_ID FOREIGN KEY (A_USER_WRITER_ID)
        REFERENCES TB_USER (USER_ID);

ALTER TABLE TB_USED_AUCTION
    ADD CONSTRAINT FK_TB_USED_AUCTION_A_USED_BOOK_ID FOREIGN KEY (A_USED_BOOK_ID)
        REFERENCES TB_BOOK (BOOK_ID);
        
        ALTER TABLE TB_USED_AUCTION
    ADD CONSTRAINT FK_TB_USED_AUCTION_A_BID_USER FOREIGN KEY (A_BID_USER)
        REFERENCES TB_USER (USER_ID);


DROP TABLE TB_TRADE CASCADE CONSTRAINTS;

-- TB_TRADE Table Create SQL
CREATE TABLE TB_TRADE
(
    BUY_CD          NUMBER          NOT NULL, 
    N_MARKET_CD       NUMBER          NULL, 
    A_MARKET_CD       NUMBER          NULL, 
    USER_BUYER_ID         VARCHAR2(20)    NOT NULL, 
    PAY_METHOD      VARCHAR2(10)    NOT NULL, 
    RECEIPT_CD      VARCHAR2(20)    NOT NULL, 
    ADD_PHONE       VARCHAR2(30)    NULL, 
    SHIP_ADDR       VARCHAR2(50)    NOT NULL, 
    RETURN_ADDR     VARCHAR2(30)    NOT NULL, 
    USE_STATUS      CHAR(1)    DEFAULT 'N'     NOT NULL, 
    BEFORE_POINT    NUMBER          NOT NULL, 
    USING_POINT     NUMBER     DEFAULT '0'     NOT NULL, 
    AFTER_POINT     NUMBER          NOT NULL, 
     PRIMARY KEY (BUY_CD)
);

COMMENT ON TABLE TB_TRADE IS '거래관리';
COMMENT ON COLUMN TB_TRADE.BUY_CD IS '구매고유번호';
COMMENT ON COLUMN TB_TRADE.N_MARKET_CD IS '일반장터고유번호';
COMMENT ON COLUMN TB_TRADE.A_MARKET_CD IS '경매장터고유번호';
COMMENT ON COLUMN TB_TRADE.USER_BUYER_ID IS '구매자아이디';
COMMENT ON COLUMN TB_TRADE.PAY_METHOD IS '결재방식';
COMMENT ON COLUMN TB_TRADE.RECEIPT_CD IS '영수코드';
COMMENT ON COLUMN TB_TRADE.ADD_PHONE IS '추가전화번호';
COMMENT ON COLUMN TB_TRADE.SHIP_ADDR IS '배송지';
COMMENT ON COLUMN TB_TRADE.RETURN_ADDR IS '반송지';
COMMENT ON COLUMN TB_TRADE.USE_STATUS IS '포인트사용유무';
COMMENT ON COLUMN TB_TRADE.BEFORE_POINT IS '사용전포인트';
COMMENT ON COLUMN TB_TRADE.USING_POINT IS '사용할포인트';
COMMENT ON COLUMN TB_TRADE.AFTER_POINT IS '사용후포인트';

ALTER TABLE TB_TRADE
    ADD CONSTRAINT FK_TB_TRADE_USER_BUYER_ID_TB_USER_ID FOREIGN KEY (USER_BUYER_ID)
        REFERENCES TB_USER (USER_ID);

ALTER TABLE TB_TRADE
    ADD CONSTRAINT FK_TB_TRADE_N_MARKET_CD_TB_USED_ FOREIGN KEY (N_MARKET_CD)
        REFERENCES TB_USED_NORMAL (N_MARKET_CD);
        
ALTER TABLE TB_TRADE
    ADD CONSTRAINT FK_TB_TRADE_A_MARKET_CD_TB_USED_ FOREIGN KEY (A_MARKET_CD)
        REFERENCES TB_USED_AUCTION (A_MARKET_CD);


DROP TABLE TB_REVIEW CASCADE CONSTRAINTS;

-- TB_REVIEW Table Create SQL
CREATE TABLE TB_REVIEW
(
    REVIEW_CD               NUMBER            NOT NULL, 
    REVIEW_WRITER_ID        VARCHAR2(20)      NOT NULL, 
    REVIEW_BOOK_ID          NUMBER            NOT NULL, 
    REVIEW_NAME             VARCHAR2(50)      NOT NULL, 
    REVIEW_REG_DATE         DATE              NOT NULL, 
    REVIEW_MODIFY_DATE      DATE              NULL, 
    REVIEW_ORIGINAL_FILE    VARCHAR2(200)      NULL, 
    REVIEW_RENAME_FILE      VARCHAR2(200)      NULL, 
    REVIEW_CONTENT          VARCHAR2(2000)    NOT NULL, 
    SCORE                   NUMBER      DEFAULT '0'      NOT NULL, 
    KEYWORD                VARCHAR2(50)      NULL, 
     PRIMARY KEY (REVIEW_CD)
);

COMMENT ON TABLE TB_REVIEW IS '리뷰';
COMMENT ON COLUMN TB_REVIEW.REVIEW_CD IS '리뷰고유번호';
COMMENT ON COLUMN TB_REVIEW.REVIEW_WRITER_ID IS '아이디';
COMMENT ON COLUMN TB_REVIEW.REVIEW_BOOK_ID IS '상품고유번호';
COMMENT ON COLUMN TB_REVIEW.REVIEW_NAME IS '리뷰제목';
COMMENT ON COLUMN TB_REVIEW.REVIEW_REG_DATE IS '등록날짜';
COMMENT ON COLUMN TB_REVIEW.REVIEW_MODIFY_DATE IS '수정날짜';
COMMENT ON COLUMN TB_REVIEW.REVIEW_ORIGINAL_FILE IS '원본첨부파일';
COMMENT ON COLUMN TB_REVIEW.REVIEW_RENAME_FILE IS '변경첨부파일';
COMMENT ON COLUMN TB_REVIEW.REVIEW_CONTENT IS '리뷰내용';
COMMENT ON COLUMN TB_REVIEW.SCORE IS '평점';
COMMENT ON COLUMN TB_REVIEW.KEYWORD IS '키워드';

ALTER TABLE TB_REVIEW
    ADD CONSTRAINT FK_TB_REVIEW_REVIEW_WRITER_ID_ FOREIGN KEY (REVIEW_WRITER_ID)
        REFERENCES TB_USER (USER_ID);

ALTER TABLE TB_REVIEW
    ADD CONSTRAINT FK_TB_REVIEW_REVIEW_BOOK_ID_TB FOREIGN KEY (REVIEW_BOOK_ID)
        REFERENCES TB_BOOK (BOOK_ID);


DROP TABLE TB_NOTICE CASCADE CONSTRAINTS;

-- TB_NOTICE Table Create SQL
CREATE TABLE TB_NOTICE
(
    NOTICE_NUM                   NUMBER           NOT NULL, 
    NOTICE_WRITER_ID             VARCHAR2(20)     NOT NULL, 
    NOTICE_TITLE                 VARCHAR2(50)     NOT NULL, 
    NOTICE_ORIGINAL_FILE         VARCHAR2(200)     NULL, 
    NOTICE_RENAME_FILE           VARCHAR2(200)     NULL, 
    NOTICE_CONTENT               VARCHAR2(100)    NOT NULL, 
    NOTICE_GROUP                 VARCHAR2(20)      DEFAULT '전체'      NOT NULL, 
    NOTICE_REG_DATE    DATE      DEFAULT SYSDATE       NOT NULL, 
    NOTICE_MODIFY_DATE           DATE             NULL, 
    VIEW_COUNT                   NUMBER      DEFAULT '0'      NOT NULL, 
    CONSTRAINT PK_TB_NOTICE PRIMARY KEY (NOTICE_NUM)
)
/

COMMENT ON TABLE TB_NOTICE IS '공지';
COMMENT ON COLUMN TB_NOTICE.NOTICE_NUM IS '번호';
COMMENT ON COLUMN TB_NOTICE.NOTICE_WRITER_ID IS '아이디';
COMMENT ON COLUMN TB_NOTICE.NOTICE_TITLE IS '공지제목';
COMMENT ON COLUMN TB_NOTICE.NOTICE_ORIGINAL_FILE IS '원본첨부파일';
COMMENT ON COLUMN TB_NOTICE.NOTICE_RENAME_FILE IS '변경첨부파일';
COMMENT ON COLUMN TB_NOTICE.NOTICE_CONTENT IS '공지내용';
COMMENT ON COLUMN TB_NOTICE.NOTICE_GROUP IS '공지분류';
COMMENT ON COLUMN TB_NOTICE.NOTICE_REG_DATE IS '등록일';
COMMENT ON COLUMN TB_NOTICE.NOTICE_MODIFY_DATE IS '수정일';
COMMENT ON COLUMN TB_NOTICE.VIEW_COUNT IS '조회수';

ALTER TABLE TB_NOTICE
    ADD CONSTRAINT FK_TB_NOTICE_NOTICE_WRITER_ID_ FOREIGN KEY (NOTICE_WRITER_ID)
        REFERENCES TB_USER (USER_ID);


DROP TABLE TB_ASK CASCADE CONSTRAINTS;

-- TB_ASK Table Create SQL
CREATE TABLE TB_ASK
(
    ASK_NUM              NUMBER            NOT NULL, 
    ASK_WRITE_ID         VARCHAR2(20)      NOT NULL, 
    ASK_GROUP            VARCHAR2(20)      DEFAULT '전체'     NOT NULL, 
    ASK_TITLE            VARCHAR2(50)      NOT NULL, 
    ASK_CONTENT          VARCHAR2(2000)    NOT NULL, 
    ASK_STATE            VARCHAR2(10)     DEFAULT 'N'    NOT NULL, 
    ASK_ORIGINAL_FILE    VARCHAR2(200)      NULL, 
    ASK_RENAME_FILE      VARCHAR2(200)      NULL, 
    ANSWER_ID               VARCHAR2(20)        NULL,
    ANSWER_CONTENT       VARCHAR2(2000)    NULL, 
    WRITE_DATE           DATE              NOT NULL, 
    ANSWER_DATE          DATE                NULL, 
    CONSTRAINT PK_TB_ASK PRIMARY KEY (ASK_NUM)
);

COMMENT ON TABLE TB_ASK IS '1:1문의';
COMMENT ON COLUMN TB_ASK.ASK_NUM IS '번호';
COMMENT ON COLUMN TB_ASK.ASK_WRITE_ID IS '아이디';
COMMENT ON COLUMN TB_ASK.ASK_GROUP IS '문의분류';
COMMENT ON COLUMN TB_ASK.ASK_TITLE IS '문의제목';
COMMENT ON COLUMN TB_ASK.ASK_CONTENT IS '문의내용';
COMMENT ON COLUMN TB_ASK.ASK_STATE IS '문의상태';
COMMENT ON COLUMN TB_ASK.ASK_ORIGINAL_FILE IS '원본첨부파일';
COMMENT ON COLUMN TB_ASK.ASK_RENAME_FILE IS '변경첨부파일';
COMMENT ON COLUMN TB_ASK.ANSWER_ID IS '답변 관리자 아이디';
COMMENT ON COLUMN TB_ASK.ANSWER_CONTENT IS '답변내용';
COMMENT ON COLUMN TB_ASK.WRITE_DATE IS '작성일';
COMMENT ON COLUMN TB_ASK.ANSWER_DATE IS '답변일';

ALTER TABLE TB_ASK
    ADD CONSTRAINT FK_TB_ASK_ASK_WRITE_ID_TB FOREIGN KEY (ASK_WRITE_ID)
        REFERENCES TB_USER (USER_ID);


DROP TABLE TB_SHOW_SCALE CASCADE CONSTRAINTS;

-- TB_SHOW_SCALE Table Create SQL
CREATE TABLE TB_SHOW_SCALE
(
    USER_ID    VARCHAR2(20)    NOT NULL, 
    SCALE1     VARCHAR2(20)    NULL, 
    SCALE2     VARCHAR2(20)    NULL, 
    SCALE3     VARCHAR2(20)    NULL, 
    SCALE4     VARCHAR2(20)    NULL, 
    CONSTRAINT PK_TB_SHOW_SCALE PRIMARY KEY (USER_ID)
);

COMMENT ON TABLE TB_SHOW_SCALE IS '공개범위';
COMMENT ON COLUMN TB_SHOW_SCALE.USER_ID IS '아이디';
COMMENT ON COLUMN TB_SHOW_SCALE.SCALE1 IS '범위1';
COMMENT ON COLUMN TB_SHOW_SCALE.SCALE2 IS '범위2';
COMMENT ON COLUMN TB_SHOW_SCALE.SCALE3 IS '범위3';
COMMENT ON COLUMN TB_SHOW_SCALE.SCALE4 IS '범위4';

ALTER TABLE TB_SHOW_SCALE
    ADD CONSTRAINT FK_TB_SHOW_SCALE_USER_ID_TB_US FOREIGN KEY (USER_ID)
        REFERENCES TB_USER (USER_ID);


DROP TABLE TB_QUIT CASCADE CONSTRAINTS;

-- TB_QUIT Table Create SQL
CREATE TABLE TB_QUIT
(
    USER_ID       VARCHAR2(20)      NOT NULL, 
    REASON1       VARCHAR2(20)      NULL, 
    REASON2       VARCHAR2(20)      NULL, 
    REASON3       VARCHAR2(20)      NULL, 
    REASON_ETC    VARCHAR2(1000)    NULL, 
    CONSTRAINT PK_TB_QUIT PRIMARY KEY (USER_ID)
);

COMMENT ON TABLE TB_QUIT IS '탈퇴사유';
COMMENT ON COLUMN TB_QUIT.USER_ID IS '아이디';
COMMENT ON COLUMN TB_QUIT.REASON1 IS '사유1';
COMMENT ON COLUMN TB_QUIT.REASON2 IS '사유2';
COMMENT ON COLUMN TB_QUIT.REASON3 IS '사유3';
COMMENT ON COLUMN TB_QUIT.REASON_ETC IS '기타';

ALTER TABLE TB_QUIT
    ADD CONSTRAINT FK_TB_QUIT_USER_ID_TB_USER_USE FOREIGN KEY (USER_ID)
        REFERENCES TB_USER (USER_ID);


DROP TABLE TB_PREFERRED CASCADE CONSTRAINTS;

-- TB_PREFERRED Table Create SQL
CREATE TABLE TB_PREFERRED
(
    USER_ID    VARCHAR2(20)    NOT NULL, 
    MYBEST1    VARCHAR2(50)    NULL, 
    MYBEST2    VARCHAR2(50)    NULL, 
    MYBEST3    VARCHAR2(50)    NULL, 
    MYBEST4    VARCHAR2(50)    NULL, 
    CONSTRAINT PK_TB_PREFERRED PRIMARY KEY (USER_ID)
);

COMMENT ON TABLE TB_PREFERRED IS '선호장르';
COMMENT ON COLUMN TB_PREFERRED.USER_ID IS '아이디';
COMMENT ON COLUMN TB_PREFERRED.MYBEST1 IS '선호1';
COMMENT ON COLUMN TB_PREFERRED.MYBEST2 IS '선호2';
COMMENT ON COLUMN TB_PREFERRED.MYBEST3 IS '선호3';
COMMENT ON COLUMN TB_PREFERRED.MYBEST4 IS '선호4';

ALTER TABLE TB_PREFERRED
    ADD CONSTRAINT FK_TB_PREFERRED_USER_ID_TB_USE FOREIGN KEY (USER_ID)
        REFERENCES TB_USER (USER_ID);


DROP TABLE TB_CHART CASCADE CONSTRAINTS;

-- TB_CHART Table Create SQL
CREATE TABLE TB_CHART
(
    BOOK_ID         NUMBER          NOT NULL, 
    CHART_BUY_CD    NUMBER          NOT NULL, 
    BEST_BOOK       CHAR(1)     DEFAULT 'N'    NOT NULL, 
    NEW_BOOK        CHAR(1)     DEFAULT 'N'    NOT NULL, 
    CONSTRAINT PK_TB_CHART PRIMARY KEY (BOOK_ID)
);

COMMENT ON TABLE TB_CHART IS '차트분류';
COMMENT ON COLUMN TB_CHART.BOOK_ID IS '상품고유번호';
COMMENT ON COLUMN TB_CHART.CHART_BUY_CD IS '구매고유번호';
COMMENT ON COLUMN TB_CHART.BEST_BOOK IS '베스트셀러';
COMMENT ON COLUMN TB_CHART.NEW_BOOK IS '신규도서';

ALTER TABLE TB_CHART
    ADD CONSTRAINT FK_TB_CHART_CHART_BUY_CD_TB_TR FOREIGN KEY (CHART_BUY_CD)
        REFERENCES TB_TRADE (BUY_CD);