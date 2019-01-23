package ch.noseryoung.lea;


/**
 * Holds all specifications of a specific course
 *
 * @author Yves Kaufmann
 */
public class Course {

	private Long id;
	private String subject;
	
	
	public Course() {
		
	}
	
	/**
	 * @param id
	 * @param subject
	 */
	public Course(Long id, String subject) {
		super();
		this.id = id;
		this.subject = subject;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
}




