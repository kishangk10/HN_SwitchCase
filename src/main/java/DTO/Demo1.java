package DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Employes_Details")
public class Demo1 {
	@Id
	private int Emp_id;
	@Column(nullable = false)
	private String Name;
	private double Salary;
	@Column(nullable = false)
	private String job_role;

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getJob_role() {
		return job_role;
	}

	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	@Override
	public String toString() {
		return "Demo1 [Emp_id=" + Emp_id + ", Name=" + Name + ", Salary=" + Salary + ", job_role=" + job_role + "]";
	}

}
