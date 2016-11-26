package student;

import java.util.List;

import internship.Internship;
import job.Job;

/**
 * Student class
 * 
 * @author Ibrahim Diabate
 * 
 * 
 * @version 2.0
 */

public class Student {

	private String idNumber;
	private String lastName;
	private String firstName;
	private String email;
	private String address;
	private double gpa;
	private String graduationYear;
	private String transferCollege;
	private String program;
	private String degreeLevel;
	private String mInternship;

	private List<Internship> myInternship;
	private List<Job> myJob;

	/***
	 * Overloaded constructor. Creates a student object with all his/her
	 * available information
	 * 
	 * @param theName
	 * @param theID
	 * @param theAddress
	 * @param theEmail
	 * @param theTransferCollege
	 * @param theProgram
	 * @param theGradYear
	 * @param theDegreeLevel
	 * @param theGraduationTerm
	 * @param theGpa
	 */

	public Student(String theLastName, String theFirstName, String theEmail, String theAddress, double theGpa,
			String theGradYear, String theTransferCollege, String theProgram, String theDegreeLevel,
			Internship theInternship, Job theJob) {

		this(theLastName, theFirstName, theEmail, theAddress, theGpa, theGradYear, theTransferCollege, theProgram,
				theDegreeLevel);

		setMyInternship(theInternship);
		setMyJob(theJob);

	}

	/**
	 * Constructor for a student object. Creates a student with only fields that
	 * are required.
	 * 
	 * @param theLastName
	 * @param theFirstName
	 * @param theEmail
	 * @param theAddress
	 * @param theGpa
	 * @param theGradYear
	 * @param theTransferCollege
	 * @param theProgram
	 * @param theDegreeLevel
	 */
	public Student(String theLastName, String theFirstName, String theEmail, String theAddress, double theGpa,
			String theGradYear, String theTransferCollege, String theProgram, String theDegreeLevel) {

		setLastName(theLastName);
		setFirstName(theFirstName);
		setEmail(theEmail);
		setAddress(theAddress);
		setGpa(theGpa);
		setGraduationYear(theGradYear);
		setTransferCollege(theTransferCollege);
		setProgram(theProgram);
		setDegreeLevel(theDegreeLevel);

	}

	/*
	 * SETTERS
	 * 
	 * 
	 */

	public void setFirstName(String firstNme) {
		firstName = firstNme;
	}

	public void setLastName(String lastNme) {
		lastName = lastNme;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTransferCollege(String transferCollege) {
		this.transferCollege = transferCollege;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}

	public void setDegreeLevel(String degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	public void setMyInternship(Internship theInternship) {
		myInternship.add(theInternship);
	}

	public void setMyJob(Job theJob) {
		myJob.add(theJob);
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void setMyInternship(List<Internship> myInternship) {
		this.myInternship = myInternship;
	}

	/*
	 * GETTERS
	 * 
	 * 
	 */

	public double getGpa() {
		return gpa;
	}

	public List<Job> getMyJob() {
		return myJob;
	}

	public List<Internship> getMyInternship() {
		return myInternship;
	}

	public String getDegreeLevel() {
		return degreeLevel;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public String getProgram() {
		return program;
	}

	public String getTransferCollege() {
		return transferCollege;
	}

	public String getEmail() {
		return email;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void viewProfile() {

	}

	public void editProfile() {

	}

}
