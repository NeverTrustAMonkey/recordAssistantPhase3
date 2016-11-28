/**
 * Internship class, which houses the data such as company name, 
 * salary, start date skills used, and internship duration.  It 
 * also houses the means to edit the data of an internship 
 * 
 * @author Patrick Sanchez
 * 
 */
package internship;

import java.util.ArrayList;

public class Internship {

    //name of the company
    private String companyName;
    
    //amount of the salary that a student is paid
    private String salary;
    
    //an arraylist to track the skills used in the internship
    private ArrayList<String> skillsUsed;
    
    //the duration of the internship in weeks
    private int internshipDurationWeeks;
    
    
    /**
     * 
     * 
     * @param compname  String representing the company name
     * @param sal String representing the salary that the student was paid
     * in the format 
     * @param duration Int representing the number of weeks that
     *  an internship lasted for a student 
     */
    public Internship(String compname, String sal, int duration) {
        
        setCompanyName(compname);
        setSalary(sal);
        setInternshipDurationWeeks(duration);
        
        
    }
    
    //TODO - Decide on minimum values for each
    /**
     * Edits the fields of the internship
     * 
     * @return returns true if the internship was successfully edited
     * false otherwise
     */
    public boolean editInternship() {
        return false;
        
    }


    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }


    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }


    /**
     * @return the skillsUsed
     */
    public ArrayList<String> getSkillsUsed() {
        return skillsUsed;
    }


    /**
     * @param skillsUsed the skillsUsed to set
     */
    public void setSkillsUsed(ArrayList<String> skillsUsed) {
        this.skillsUsed = skillsUsed;
    }


    /**
     * 
     * @return the internshipDurationWeeks
     */
    public int getInternshipDurationWeeks() {
        return internshipDurationWeeks;
    }


    /**
     * @param internshipDurationWeeks the internshipDurationWeeks to set
     */
    public void setInternshipDurationWeeks(
            int internshipDurationWeeks) {
        this.internshipDurationWeeks = internshipDurationWeeks;
    }
    
    
    
}
 