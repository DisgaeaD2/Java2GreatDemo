package great;

import java.util.HashMap;

public enum Dinasty {
	None(0, "없음"), GoChosun(1, "고조선"), SamKuk(2, "삼국"), Silla(3, "통일신라"), Koryo(4, "고려"), Chosun(5, "조선"), Ilje(6,
			"식민지"), KorRep(7, "대한민국");

	private int value;
	private String name;
	static private HashMap<Integer, Dinasty> map = new HashMap();

	private Dinasty(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	static {
		for (Dinasty d : Dinasty.values())
			map.put(d.value, d);
	}
	
	public Dinasty getDinasty(int i) {
		return map.get(i);
	}
	
	public String getName() {
		return null;
		//return this.name;
	}
}
