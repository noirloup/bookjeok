package book.model.vo;

import java.sql.Date;

public class BookReview {
	private static final long serialVersionUID = 115L;

	   private int bookId;
	   private int bookCateCd;
	   private String bookCategory;
	   private int bookTypeNum;
	   private String bookType;
	   private int bookLocNum;
	   private String bookLocation;
	   private String bookNm;
	   private String bookImg;
	   private int isbn;
	   private int ranking;
	   private String bookIntro;
	   private String author;
	   private String authorIntro;
	   private int bookPrice;
	   private int avgScore;
	   private String publisher;
	   private java.sql.Date publishDate;
	   private String bookIndex;
	   
	    private int reviewCd;
		private String reviewWriterId;
		private int reviewBookId;
		private String reviewName;
		private java.sql.Date reviewRegDate;
		private java.sql.Date reviewModifyDate;
		private String reviewOriginalFile;
		private String reviewRenameFile;
		private String reviewContent;
		private int score;
		private String keyword;

	   public BookReview() {}

	public BookReview(int bookId, int bookCateCd, String bookCategory, int bookTypeNum, String bookType, int bookLocNum,
			String bookLocation, String bookNm, String bookImg, int isbn, int ranking, String bookIntro, String author,
			String authorIntro, int bookPrice, int avgScore, String publisher, Date publishDate, String bookIndex,
			int reviewCd, String reviewWriterId, int reviewBookId, String reviewName, Date reviewRegDate,
			Date reviewModifyDate, String reviewOriginalFile, String reviewRenameFile, String reviewContent, int score,
			String keyword) {
		super();
		this.bookId = bookId;
		this.bookCateCd = bookCateCd;
		this.bookCategory = bookCategory;
		this.bookTypeNum = bookTypeNum;
		this.bookType = bookType;
		this.bookLocNum = bookLocNum;
		this.bookLocation = bookLocation;
		this.bookNm = bookNm;
		this.bookImg = bookImg;
		this.isbn = isbn;
		this.ranking = ranking;
		this.bookIntro = bookIntro;
		this.author = author;
		this.authorIntro = authorIntro;
		this.bookPrice = bookPrice;
		this.avgScore = avgScore;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.bookIndex = bookIndex;
		this.reviewCd = reviewCd;
		this.reviewWriterId = reviewWriterId;
		this.reviewBookId = reviewBookId;
		this.reviewName = reviewName;
		this.reviewRegDate = reviewRegDate;
		this.reviewModifyDate = reviewModifyDate;
		this.reviewOriginalFile = reviewOriginalFile;
		this.reviewRenameFile = reviewRenameFile;
		this.reviewContent = reviewContent;
		this.score = score;
		this.keyword = keyword;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookCateCd() {
		return bookCateCd;
	}

	public void setBookCateCd(int bookCateCd) {
		this.bookCateCd = bookCateCd;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public int getBookTypeNum() {
		return bookTypeNum;
	}

	public void setBookTypeNum(int bookTypeNum) {
		this.bookTypeNum = bookTypeNum;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getBookLocNum() {
		return bookLocNum;
	}

	public void setBookLocNum(int bookLocNum) {
		this.bookLocNum = bookLocNum;
	}

	public String getBookLocation() {
		return bookLocation;
	}

	public void setBookLocation(String bookLocation) {
		this.bookLocation = bookLocation;
	}

	public String getBookNm() {
		return bookNm;
	}

	public void setBookNm(String bookNm) {
		this.bookNm = bookNm;
	}

	public String getBookImg() {
		return bookImg;
	}

	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getBookIntro() {
		return bookIntro;
	}

	public void setBookIntro(String bookIntro) {
		this.bookIntro = bookIntro;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorIntro() {
		return authorIntro;
	}

	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public java.sql.Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(java.sql.Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getBookIndex() {
		return bookIndex;
	}

	public void setBookIndex(String bookIndex) {
		this.bookIndex = bookIndex;
	}

	public int getReviewCd() {
		return reviewCd;
	}

	public void setReviewCd(int reviewCd) {
		this.reviewCd = reviewCd;
	}

	public String getReviewWriterId() {
		return reviewWriterId;
	}

	public void setReviewWriterId(String reviewWriterId) {
		this.reviewWriterId = reviewWriterId;
	}

	public int getReviewBookId() {
		return reviewBookId;
	}

	public void setReviewBookId(int reviewBookId) {
		this.reviewBookId = reviewBookId;
	}

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public java.sql.Date getReviewRegDate() {
		return reviewRegDate;
	}

	public void setReviewRegDate(java.sql.Date reviewRegDate) {
		this.reviewRegDate = reviewRegDate;
	}

	public java.sql.Date getReviewModifyDate() {
		return reviewModifyDate;
	}

	public void setReviewModifyDate(java.sql.Date reviewModifyDate) {
		this.reviewModifyDate = reviewModifyDate;
	}

	public String getReviewOriginalFile() {
		return reviewOriginalFile;
	}

	public void setReviewOriginalFile(String reviewOriginalFile) {
		this.reviewOriginalFile = reviewOriginalFile;
	}

	public String getReviewRenameFile() {
		return reviewRenameFile;
	}

	public void setReviewRenameFile(String reviewRenameFile) {
		this.reviewRenameFile = reviewRenameFile;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BookReview [bookId=" + bookId + ", bookCateCd=" + bookCateCd + ", bookCategory=" + bookCategory
				+ ", bookTypeNum=" + bookTypeNum + ", bookType=" + bookType + ", bookLocNum=" + bookLocNum
				+ ", bookLocation=" + bookLocation + ", bookNm=" + bookNm + ", bookImg=" + bookImg + ", isbn=" + isbn
				+ ", ranking=" + ranking + ", bookIntro=" + bookIntro + ", author=" + author + ", authorIntro="
				+ authorIntro + ", bookPrice=" + bookPrice + ", avgScore=" + avgScore + ", publisher=" + publisher
				+ ", publishDate=" + publishDate + ", bookIndex=" + bookIndex + ", reviewCd=" + reviewCd
				+ ", reviewWriterId=" + reviewWriterId + ", reviewBookId=" + reviewBookId + ", reviewName=" + reviewName
				+ ", reviewRegDate=" + reviewRegDate + ", reviewModifyDate=" + reviewModifyDate
				+ ", reviewOriginalFile=" + reviewOriginalFile + ", reviewRenameFile=" + reviewRenameFile
				+ ", reviewContent=" + reviewContent + ", score=" + score + ", keyword=" + keyword + "]";
	}
	   
	   
}
