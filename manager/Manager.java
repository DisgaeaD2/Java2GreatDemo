package manager;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Manager {

	ArrayList<Managable> sList = new ArrayList<>();
	
	protected void readAll(String fileName, Factory fac) {
		Scanner scan = openFile(fileName);
		Managable m = null;
		while (scan.hasNext()) {
			m = fac.create();
			m.read(scan);
			sList.add(m);
		}
		scan.close();
	}
	protected Managable find(String kwd) {
		for (Managable m : sList)
			if (m.compare(kwd)) 
				return m;
		return null;
	}
	protected void printAll() {
		for (Managable m : sList)
			m.print();
	}
	private Scanner openFile(String filename) {
		File f = new File(filename);
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return fileIn;
	}
}
