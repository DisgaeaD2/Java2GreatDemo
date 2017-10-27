package great;

import java.util.HashMap;

public enum MatchType {
	None(0, "없음"), Name(1, "이름"), Gender(2, "성별"), Age(3, "시대"), Type(4, "분류"), Year(5, "년도"), Work(6, "업적");

	private int value;
	private String name;
	static private HashMap<Integer, MatchType> map = new HashMap();

	private MatchType(int value, String name) {
		this.value = value;
		this.name = name;
	}

	static {
		for (MatchType m : MatchType.values())
			map.put(m.value, m);
	}

	public MatchType getMatchType(int i) {
		return map.get(i);
	}

	public String getName() {
		return this.name;
	}
}