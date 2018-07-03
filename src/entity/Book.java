package entity;

import java.util.Date;

public class Book {
	
	private String ISBN;
	
	private String bookName;
	
	private String authorName;
	
	private int classificationId;
	
	private int pubilishingId;
	
	private Date publishTime;
	
	private String cover;
	
	private double rateSum;
	
	private int rateTime;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getClassificationId() {
		return classificationId;
	}

	public void setClassificationId(int classificationId) {
		this.classificationId = classificationId;
	}

	public int getPubilishingId() {
		return pubilishingId;
	}

	public void setPubilishingId(int pubilishingId) {
		this.pubilishingId = pubilishingId;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public double getRateSum() {
		return rateSum;
	}

	public void setRateSum(double rateSum) {
		this.rateSum = rateSum;
	}

	public int getRateTime() {
		return rateTime;
	}

	public void setRateTime(int rateTime) {
		this.rateTime = rateTime;
	}
	
}
