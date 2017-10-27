package great;

import java.util.HashMap;

public enum GreatType {
	Etc(0, "기타"), King(1, "왕"), Millitary(2, "무인"), Politician(3, "정치가"), Artist(4, "예술가"), Doctor(5,
			"의사"), Religionist(6, "종교인");

	private int value;
	private String name;
	static private HashMap<Integer, GreatType> map = new HashMap<>();

	private GreatType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	static {
		for (GreatType g : GreatType.values())
			map.put(g.value, g);
	}
	
	public GreatType getGreatType(int i) {
		return map.get(i);
	}

	public String getNmae() {
		return this.name;
	}

}
