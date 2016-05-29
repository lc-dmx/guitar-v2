package guitarshop.entity;

public class guitarspec {


	private  static String builder;
	private  static String model;
	private  static String type;
	private  static String backWood;
	private  static String topWood;

	public guitarspec(String builder) {
		guitarspec.builder = builder;

	}


	public boolean matches(guitarspec otherSpec) {
		
		return true;
	}

	public  String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		guitarspec.builder = builder;
	}

	public  String getModel() {
		return model;
	}

	public void setModel(String model) {
		guitarspec.model = model;
	}

	public  String getType() {
		return type;
	}

	public void setType(String type) {
		guitarspec.type = type;
	}

	public  String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		guitarspec.backWood = backWood;
	}

	public  String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		guitarspec.topWood = topWood;
	}

}
