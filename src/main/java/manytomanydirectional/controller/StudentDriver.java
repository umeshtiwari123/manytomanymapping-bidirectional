package manytomanydirectional.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybidirectional.dto.Student;
import manytomanybidirectional.dto.Teacher;

public class StudentDriver {

	public static void main(String[] args) {
		
		Teacher teacher=new Teacher();
		teacher.setId(12);
		teacher.setName("Anamika");
		teacher.setNumber(1234);
		teacher.setAddress("Marathahalli");
		
		Teacher teacher1=new Teacher();
		teacher1.setId(14);
		teacher1.setName("Rishab");
		teacher1.setNumber(4321);
		teacher1.setAddress("BTM");
		
		Teacher teacher2=new Teacher();
		teacher2.setId(19);
		teacher2.setName("Umesh");
		teacher2.setNumber(32145);
		teacher2.setAddress("IndiraNagar");
		
		Student student=new Student();
		student.setId(101);
		student.setName("Sarika");
		student.setPhone(12345);
		student.setAddress("Indore");
		
		Student student1=new Student();
		student1.setId(102);
		student1.setName("Sargam");
		student1.setPhone(54321);
		student1.setAddress("Bhopal");
		
		Student student2=new Student();
		student2.setId(103);
		student2.setName("Pavithra");
		student2.setPhone(77543);
		student2.setAddress("Hyderabad");
		
		List<Teacher> list=new ArrayList<Teacher>();
		list.add(teacher2);
		list.add(teacher1);
		student.setList(list);
		
		
		List<Teacher> list1=new ArrayList<Teacher>();
		list.add(teacher);
		list.add(teacher1);
		student1.setList(list1);
		
		List<Teacher> list2=new ArrayList<Teacher>();
		list2.add(teacher2);
		list2.add(teacher1);
		list2.add(teacher);
		student2.setList(list2);
		
		
		List<Student> s1=new ArrayList<Student>();
		s1.add(student2);
		s1.add(student1);
		
		teacher.setStudents(s1);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		
		entityManager.persist(teacher);
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);

		entityTransaction.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
