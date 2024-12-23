package test241223.elice.elice10;

public class Student {
	 int studno;
	 String name;
	 String major;
	 public Student(int studno, String name, String major) {
	  this.studno = studno;
	  this.name = name;
	  this.major = major;
	 }
	 public String toString() {
	  return "[학번=" + studno + ", 이름=" + name + ", 전공=" + major + "]";
	 }
	 
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if(o instanceof Student) {
			Student other = (Student) o;
			if(this.name.equals(other.name) && this.studno == other.studno) {
				result = true;
			}
		}
		
		return result;
	}

}
