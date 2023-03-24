
public class Main {
	public static void main(String[] args) {
		Persister user = new Persister("Bob");
		user.report();
		user.save();
	}
}