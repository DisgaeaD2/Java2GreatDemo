package student;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import manager.Factory;
import manager.Managable;
import manager.Manager;

public class StudentDemo extends Manager implements Factory {
	
	
	public static void main(String[] args) {
		StudentDemo demo = new StudentDemo();
		demo.doit();
	}

	void doit() {
		readAll("students.txt",this);
		readScores();
		printAll();
	}

	void readScores() {
		Scanner keyin = new Scanner(System.in);
		System.out.println("학생 아이디와 점수 입력 (점수 끝은 0)");
		String id;
		Managable st = null;
		while (true) {
			System.out.print("... ");
			id = keyin.next();
			st = (Student)find(id);
			if (st == null)
				break;
			((Student) st).readScores(keyin);
			;
		}
	}

	@Override
	public Student create() {
		return new Student();
	}

}