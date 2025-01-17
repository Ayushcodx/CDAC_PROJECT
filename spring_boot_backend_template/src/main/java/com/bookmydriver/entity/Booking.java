package com.bookmydriver.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "driverId")
    private Driver driver;

    private String vehicleName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String destination;

    @OneToOne(mappedBy = "booking")
    private Payment payment;

    @OneToOne(mappedBy = "booking")
    private Review review;

	public Booking() {
		super();
	}

	public Booking(Long bookingId, User user, Driver driver, String vehicleName, LocalDateTime startTime,
			LocalDateTime endTime, String destination, Payment payment, Review review) {
		super();
		this.bookingId = bookingId;
		this.user = user;
		this.driver = driver;
		this.vehicleName = vehicleName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.destination = destination;
		this.payment = payment;
		this.review = review;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", user=" + user + ", driver=" + driver + ", vehicleName="
				+ vehicleName + ", startTime=" + startTime + ", endTime=" + endTime + ", destination=" + destination
				+ ", payment=" + payment + ", review=" + review + "]";
	}

   
}

