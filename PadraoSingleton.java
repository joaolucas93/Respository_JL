
public class PadraoSingleton {

	public static void main(String[] args) {

		CaldeiraChocolate caldeiraChocolate = CaldeiraChocolate.getInstance();
		Log arqLog = Log.getInstance();
		
		caldeiraChocolate.drenar();
		caldeiraChocolate.drenar();
		caldeiraChocolate.encher();
		caldeiraChocolate.ferver();
		caldeiraChocolate.encher();
		caldeiraChocolate.isFervida();
		caldeiraChocolate.isVazia();
		
		
		arqLog.Logger();
	}

}
