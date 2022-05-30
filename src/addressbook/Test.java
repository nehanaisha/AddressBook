package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	static UserMange user = new UserMange();
	static Scanner sc = new Scanner(System.in);

	public static void start() {
		System.out.println("======== address book management system ======");
		System.out.println("1. add contact");
		System.out.println("2. update query");
		System.out.println("3. delete the contact with the specified number according to the number");
		System.out.println("=============================");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			add();
			start();
			break;
		case 2:

            updateName();
            start();
            break;

		case 3:
			delUser();
			start();
			break;
		default:
			System.out.println("please enter the correct instruction!");
			start();
			break;
		}
	}

	public static void add() {
		System.out.println("please enter contact number:");
		int a = sc.nextInt();
		System.out.println("please enter first name:");
		String b = sc.next();
		System.out.println("please enter the contact mobile phone number:");
		String c = sc.next();
		System.out.println("please enter the zip code");
		String d = sc.next();
		System.out.println("please enter the email address of the contact:");
		String e = sc.next();
		System.out.println("please enter the lastName:");
		String f = sc.next();
		System.out.println("please enter the City:");
		String g = sc.next();
		System.out.println("please enter the Address:");
		String h = sc.next();
		System.out.println("please enter the State:");
		String i = sc.next();
		User x = new User(a, b, c, d, e, f, g, h, i);
		if (user.addUser(x)) {
			System.out.println("added successfully!");
		}
	}

	public static void updateName() {
		System.out.println("Enter user number");
		int number = sc.nextInt();
		System.out.println("Enter updated name");
		String firstname = sc.next();
		if (user.updateName(number, firstname)) {
			System.out.println("updated successfully");
		}
	}

	public static void delUser() {
		System.out.println("please enter the number");
		int no = sc.nextInt();
		if (user.delUser(no)) {
			System.out.println("deletion succeeded");
		}
	}

	public static void main(String[] args) {
		start();
	}
}