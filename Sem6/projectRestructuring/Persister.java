
public class Persister extends User implements Saveable {

	private User user;

	public Persister(String name) {
		super(name);
		this.user = new User(name);
	}

	public void save() {
		System.out.println("Save user: " + user.getName());
	}
}