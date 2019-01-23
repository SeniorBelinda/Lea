package ch.noseryoung.lea;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * This class holds all REST endpoints targeted towards the class course
 *
 * @author Yves Kaufmann
 */
@RestController
@RequestMapping("/courses")
public class CourseController {
	
	/**
	 * This method returns the requested course
	 *
	 * @param  id
	 * @return    ResponseEntity with the course that was requested
	 */
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Course> getById(@PathVariable long id) {
		Course course = new Course(new Long(id),"module223");
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
	
	/**
	 * This method returns all courses
	 *
	 * @return ResponseEntity with all existing courses
	 */
	@GetMapping({ "", "/" })
	public @ResponseBody ResponseEntity<Iterable<Course>> getAll() {
		Course course1 = new Course(new Long(1),"module223");
		Course course2 = new Course(new Long(2),"module223");
		return new ResponseEntity<>(Arrays.asList(course1,course2), HttpStatus.OK);
	}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
=======
}
>>>>>>> Stashed changes
