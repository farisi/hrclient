package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private Long id;


    private String firstName;
    

    private String lastName;

   
    private String email;
    

    private String placeOfBirth;
    
    private String address;
    
    private String mobile;
    

    private Double salary=0.0;
    

    private LocalDate birthDate;
    

    private LocalDate joinDate;
        

    private LocalDateTime createdAt=LocalDateTime.now();
    

    private LocalDateTime updatedAt=LocalDateTime.now();
    
    public Employee() {}

	public Employee(Long id, String firstName, String lastName, String email, String placeOfBirth, String address,
			String mobile, Double salary, LocalDate birthDate, LocalDate joinDate, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.placeOfBirth = placeOfBirth;
		this.address = address;
		this.mobile = mobile;
		this.salary = salary;
		this.birthDate = birthDate;
		this.joinDate = joinDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
