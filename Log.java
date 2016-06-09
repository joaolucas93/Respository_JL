import java.io.FileWriter;
import java.io.IOException;

public class Log {
	private FileWriter arquivo;
	private volatile static Log uniqueInstance;
	
	private Log() {	
	}	

	public static Log getInstance() {
		if (uniqueInstance == null) {
			synchronized (Log.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Log();
				}
			}
			uniqueInstance = new Log();
		}
		return uniqueInstance;
	}
		
	public void Logger(){
		try {
			this.arquivo = new FileWriter("home/joaolucas-user/Log.log");
		} catch (IOException exception) {
			exception.printStackTrace();
			System.out.println("Erro ao inserir Log!");
		}

	}
}


