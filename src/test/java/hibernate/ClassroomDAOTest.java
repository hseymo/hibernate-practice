package hibernate;

import org.junit.Test;

import com.skillstorm.hibernate.beans.Classroom;
import com.skillstorm.hibernate.data.ClassroomDAO;

public class ClassroomDAOTest {
	ClassroomDAO dao = new ClassroomDAO();
	
	@Test
	public void save() {
		Classroom cr = new Classroom("Cyber");
		dao.save(cr);
	}
}
