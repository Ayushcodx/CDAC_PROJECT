package com.bookmydriver.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    private String email;
    private String phoneNo;
    private String driverName;
    private Double rating;

    @OneToOne(mappedBy = "driver")
    private Booking bookings;

    @OneToMany(mappedBy = "driver")
    private List<Review> reviews;

	public Driver() {
		super();
	}

	public Driver(Long driverId, String email, String phoneNo, String driverName, Double rating, Booking bookings,
			List<Review> reviews) {
		super();
		this.driverId = driverId;
		this.email = email;
		this.phoneNo = phoneNo;
		this.driverName = driverName;
		this.rating = rating;
		this.bookings = bookings;
		this.reviews = reviews;
	}

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Booking getBookings() {
		return bookings;
	}

	public void setBookings(Booking bookings) {
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
		return "Driver [driverId=" + driverId + ", email=" + email + ", phoneNo=" + phoneNo + ", driverName="
				+ driverName + ", rating=" + rating + ", bookings=" + bookings + ", reviews=" + reviews + "]";
	}
    
    

    
}

