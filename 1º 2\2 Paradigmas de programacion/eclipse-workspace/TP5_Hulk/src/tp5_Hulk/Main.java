package tp5_Hulk;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hulk.promedioEnojos();
		//		public Hulk(String nombre, double peso, String color, boolean enojado){
		Hulk hulk1 = new Hulk("pepe", 85, "piel", false);
		Hulk hulk2 = new Hulk("pipo", 75, "amarillo", false);
		Hulk hulk3 = new Hulk("papo", 500, "piel", true);
		Hulk.promedioEnojos();
		
		printLinea();
		hulk1.provocar();
		hulk1.provocar();
		hulk1.saludar();
		hulk1.calmar();
		hulk1.calmar();
		hulk1.saludar();
		printLinea();
		hulk2.provocar();
		hulk2.provocar();
		hulk2.saludar();
		hulk2.calmar();
		hulk2.calmar();
		hulk2.saludar();
		printLinea();
		hulk3.provocar();
		hulk3.provocar();
		hulk3.saludar();
		hulk3.calmar();
		hulk3.calmar();
		hulk3.saludar();
		printLinea();
		Hulk.promedioEnojos();


	
	
	}
	
	
	
	
	public static void printLinea() {
		System.out.println("---------------------------------");
	}
	
	
}
