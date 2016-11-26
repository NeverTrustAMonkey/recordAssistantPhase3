package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import data.DataConnection;
 
import data.StudentDB;
 

public class StudentCollection {

	private static StudentDB mStudentDB;
	private static Connection mConnection;

	
	
	
	public static boolean add(Student stud) {
		if (mStudentDB == null) {
			mStudentDB = new StudentDB();
		}

		String message = mStudentDB.addStudent(stud);
		if (message.startsWith("Error adding student: ")) {
			return false;
		}
		return true;
	}
	
	

}
