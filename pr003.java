class Cars {
	int pass; // количества пассажиров
	int volume; // емкость бензобака
	double fuel; // расходж топлива на 100 км
	
}
class pr003 {
	public static void main(String[] args) {
		Cars Honda = new Cars();
		Honda.pass  = 2;
	       	Honda.volume = 55;
		Honda.fuel = 20.0;

		Cars BMW = new Cars();
		BMW.pass = 5;
		BMW.volume = 40;
		BMW.fuel = 15.5;

		System.out.println("Параметры Хонды: ");
		System.out.println("Количество пассажиров: " + Honda.pass + " Объем бака: " + Honda.volume + " Расход топлива " + Honda.fuel);
		
		double range;
		range = Honda.volume/Honda.fuel*100;
		System.out.println("Хонд на полном баке проедет: " + range + "км ");
		range = BMW.volume/BMW.fuel*100;
		System.out.println("БМВ ну такое себе, на полном баке проедет: " + range + "км ");


	}
}
