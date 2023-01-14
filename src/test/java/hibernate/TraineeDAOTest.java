package hibernate;

import org.junit.Test;

import com.skillstorm.hibernate.beans.Classroom;
import com.skillstorm.hibernate.beans.Trainee;
import com.skillstorm.hibernate.data.TraineeDAO;


public class TraineeDAOTest {
	TraineeDAO dao = new TraineeDAO();
	
	@Test
	public void save() {
		Trainee tr = new Trainee("Toby", "IT", new Classroom(2));
		dao.save(tr);
	}
}
