package excella.project.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.training.model.Professor;

import com.example.demo.model.Student;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class College {
	
	@Autowired
	
	//@Qualifier("jaya")
	Professor prof;

}
