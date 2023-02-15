package Controller;

import java.util.Scanner;

import DAO.Sample1;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sample1 sample1 = new Sample1();

		boolean flag = true;
		while (flag) {
			System.out.println(
					"1. add emp..\n2. fetch emp..\n3. remove emp..\n4. update emp Salry..\n5. Fetch All..\n6. Remove All..\n7. Exit");
			switch (scanner.nextInt()) {
			case 1: {
				System.out.println("Enter the Emp_id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the Salary");
				double sal = scanner.nextDouble();
				System.out.println("Enter the Job Role");
				String job = scanner.next();
				sample1.addEmp(id, name, sal, job);
				System.out.println("Added......");
			}
				break;
			case 2: {
				System.out.println("enter the Emp_id");
				int id = scanner.nextInt();
				sample1.fetchEmp(id);
			}
				break;
			case 3: {
				System.out.println("Enter the Emp_id");
				int id = scanner.nextInt();
				sample1.removeEmp(id);
				System.out.println("Emp is removed.......");
			}
				break;
			case 4: {
				System.out.println("Enter the Emp_id");
				int id = scanner.nextInt();
				System.out.println("Enter the new Salary");
				double sal = scanner.nextDouble();
				sample1.updateEmpSal(id, sal);
				System.out.println("Employ sal is updated ....");
			}
				break;
			case 5: {
				sample1.fetchAll();
			}
				break;
			case 6: {
				sample1.deleteAll();
				System.out.println("All records are deleted");
			}
				break;
			case 7: {
				flag = false;
				System.out.println("-----<(Thank You)>-----");
			}
				break;

			default:
				System.out.println("Invalid Option..\nPlease select the correct Option..");
				break;
			}
		}
	}
}
