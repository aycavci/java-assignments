/*
 * (**) Implement the classes Student and ReportCard. Each	method in both
 * classes has a comment before it, explaining what	it does. Once you
 * completed both classes print the ReportCard's for given students. Your
 * output may vary	slightly depending the values you choose for painting.
 */

import acm.program.*;

public class GradeReport extends GraphicsProgram{

	public void run() {
		Student s0 = new Student("Enis Sert", "20101234", 75, 85);
		Student s1 = new Student("Emre Unal", "20105678", 100, 65);
		Student s2 = new Student("Serkan Ozkul", "20109876", 85, 95);

		add(new ReportCard(s0), 5, 5);
		add(new ReportCard(s1), 110, 5);
		add(new ReportCard(s2), 215, 5);
	}
}
