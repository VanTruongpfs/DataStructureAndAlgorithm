package Exercise1.src.baitap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
	private String id;
	private String fullname;
	private String birthday;

	public Student(String id, String fullname, String birthday) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.birthday = birthday;
	}
	@Override
	public int hashCode() {
		return Objects.hashCode(fullname+id);
	}
	@Override
	public int compareTo(Student stu) {
		String[] name1 = this.fullname.split(" ");
		String[] name2 = stu.fullname.split(" ");
		if (name1[name1.length-1].equals(name2[name2.length-1])) {
			if (name1[name1.length-2].equals(name2[name2.length-2])) {
				return this.id.compareTo(stu.id);
			} else {
				return name1[name1.length-2].compareTo(name2[name2.length-2]);
			}
		}else {
			return name1[name1.length-1].compareTo(name2[name2.length-1]);
		}
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", birthday=" + birthday + "]" +"\n";
	}
	public static void main(String[] args) {
		Student s1 = new Student("001", "Nguyen Van A", "2000-01-01");
		Student s2 = new Student("002", "Le Thi B", "2000-02-01");
		Student s4 = new Student("004", "Le Phuoc B", "2000-02-01");
		Student s3 = new Student("003", "Tran Van C", "2000-03-01");
		System.out.println("TreeSet");
		Set<Student> studentSet = new TreeSet<>();
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		System.out.println(studentSet);
		System.out.println("HashSet");
		Set<Student> studentMap = new HashSet();
		studentMap.add(s1);
		studentMap.add(s2);
		studentMap.add(s3);
		studentMap.add(s4);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(studentMap);
	}
}

