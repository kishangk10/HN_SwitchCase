package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.Demo1;

public class Sample1 {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void addEmp(int id, String name, double sal, String jR) {
		entityTransaction.begin();
		Demo1 demo1 = new Demo1();
		demo1.setEmp_id(id);
		demo1.setName(name);
		demo1.setSalary(sal);
		demo1.setJob_role(jR);
		entityManager.persist(demo1);
		entityTransaction.commit();
	}

	public void fetchEmp(int id) {
		Demo1 e = entityManager.find(Demo1.class, id);
		if (e != null)
			System.out.println(e);
		else
			System.out.println("Data not Found");
	}

	public void removeEmp(int id) {
		Demo1 e = entityManager.find(Demo1.class, id);
		if (e != null) {
			entityTransaction.begin();
			entityManager.remove(e);
			entityTransaction.commit();
		} else
			System.out.println("Data not Found");
	}

	public void updateEmpSal(int id, double sal) {
		Demo1 e = entityManager.find(Demo1.class, id);
		if (e != null) {
			entityTransaction.begin();
			e.setSalary(sal);
			entityManager.merge(e);
			entityTransaction.commit();
		} else
			System.out.println("Data not Found");
	}

	public void fetchAll() {
		Query q = entityManager.createQuery("select r from Employes_Details r");
		List<Demo1> l = q.getResultList();
		for (Demo1 d : l)
			System.out.println(d);
	}

	public void deleteAll() {
		Query q = entityManager.createQuery("delete from Employes_Details");
		entityTransaction.begin();
		q.executeUpdate();
		entityTransaction.commit();
	}

}
