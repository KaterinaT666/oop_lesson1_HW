public class Main {
	public static void main(String[] args) {

		Human max = new Human("Максим", "Минск", 0, "бренд-менеджера");
		max.hello();

		Human ann = new Human( "Аня","Москва", -1993,
				null);
		ann.hello();

		Human kate = new Human("Катя", "Калининград", -1992,
				"продакт-менеджера");
		kate.hello();

		Human art = new Human( "Артём", "", 1995,
				"директора по развитию бизнеса");
		art.hello();
	}
}