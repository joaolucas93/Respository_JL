public class CaldeiraChocolate {

	private boolean vazia;
	private boolean fervida;

	private volatile static CaldeiraChocolate uniqueInstance;

	private CaldeiraChocolate() {
		vazia = true;
		fervida = false;
		System.out.println("Caldeira vazia e não fervida");
	}

	public static CaldeiraChocolate getInstance() {
		if (uniqueInstance == null) {
			synchronized (CaldeiraChocolate.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new CaldeiraChocolate();
				}
			}
			uniqueInstance = new CaldeiraChocolate();
		}

		return uniqueInstance;
	}

	public void encher() {
		if (isVazia()) {
			vazia = false;
			fervida = false;
			System.out.println("Caldeira cheia e não fervida");

		}
	}

	public void drenar() {
		if (!isVazia() && isFervida()) {

			vazia = true;
			System.out.println("Caldeira vazia");
		}
	}

	public void ferver() {
		if (!isVazia() && !isFervida()) {

			fervida = true;
			System.out.println("Caldeira fervida");
		}
	}

	public boolean isVazia() {
		return vazia;
	}

	public boolean isFervida() {
		return fervida;
	}

}