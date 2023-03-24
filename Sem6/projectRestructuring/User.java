
public class User implements Reportable {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void report() {
		System.out.println("Report for user: " + name);
	}
}