package DijkastraInterpreter;

public class App {
	public static void main(String[] args) {
		Algorithm algo = new Algorithm();
		algo.interpreterExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
		algo.result();
	}
}
