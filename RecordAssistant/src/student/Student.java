package student;
import java.util.List;

import internship.Internship;
import job.Job;


/**
 * Student class 
 * @author Ibrahim Diabate, James Ho, Patrick Sanchez
 * 
 * 
 * @version 2.0
 * */


public class Student {

		
	String name;
	String idNumber;
	String address;
	String email;
	String transferCollege;
	String program;
	String graduationYear;
	String degreeLevel;
	String graduationTerm;
	List <Internship> myInternship;
	List <Job> myJob;
	double gpa;
	
	
	
	/**
	 * Constructor for a student object.
	 * @param theName
	 * @param theID
	 * @param theAddress
	 * @param theEmail
	 * @param theGpa
	 */
	
	public Student (String theName, String theID, String theAddress,
			String theEmail, double theGpa) {
		
		name = theName;
		idNumber = theID;
		address = theAddress;
		email = theEmail;
		gpa = theGpa;
		
	}
	
	
/***
 * Overloaded constructor
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
	
	public Student (String theName, String theID, String theAddress,
			String theEmail, String theTransferCollege, String theProgram,
			String theGradYear, String theDegreeLevel, String theGraduationTerm, 
			double theGpa) {
		
		name = theName;
		idNumber = theID;
		address = theAddress;
		email = theEmail;
		transferCollege = theTransferCollege;
		program = theProgram;
		graduationYear = theGradYear;
		degreeLevel = theDegreeLevel;
		graduationTerm = theGraduationTerm;
		gpa = theGpa;
		
	}
	
	
	public void viewProfile() {
		
		
		
	}
	
	
public void editProfile() {
		
	}
	
	
}
