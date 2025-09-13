package celu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio :)");
		
//		public Celular(int numero, int codigo_Area, double saldo){
//		public Celular(int numero, int codigo_Area){
		
		Celular.mostrarListaNrosExistentes();

		Celular miCelu = new Celular(4654999, 2804);
		Celular.mostrarListaNrosExistentes();
		
		Celular celuLuna = new Celular(4654997, 2804,500);
		Celular celuAzul = new Celular(4654998, 2804);
		
		
		miCelu.llamar(2945, 4673729);
		
		miCelu.recargar();
		miCelu.recargar(99999);
		miCelu.recargar(-110000);

		miCelu.llamar();
		Celular.mostrarListaNrosExistentes();

	}

}
