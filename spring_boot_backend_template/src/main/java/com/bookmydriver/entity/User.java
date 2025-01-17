package com.bookmydriver.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String emailId;
    private String phoneNo;
    private String passwordHash;
    private String userName;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

	public User() {
		super();
	}

	public User(Long userId, String emailId, String phoneNo, String passwordHash, String userName,
			List<Booking> bookings, List<Review> reviews) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.passwordHash = passwordHash;
		this.userName = userName;
		this.bookings = bookings;
		this.reviews = reviews;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", passwordHash="
				+ passwordHash + ", userName=" + userName + ", bookings=" + bookings + ", reviews=" + reviews + "]";
	}

   
    
    
}

