class TwoDShape{
	private double width;
	private double height;
	String name; 
	int i = 100;
	TwoDShape(double w, double h){
	
		if(h > 29.7)
                        height = 29.7;
                else
                        height = h;
		
		if(w > 21.0)
                        width = 21.0;
                else
                        width = w;

		name = "Двумерная фигура";

	}
	double getWidth(){
		return width;
	}
	double getHeight(){
		return height; 
	}
	void setWidth(double w){
		if(w > 21.0)
			width = 21.0;
		else
			width = w;
	}
	void setHeight(double h){
		if(h > 29.7)
			height = 29.7;
		else
			height = h;
	}
	void showDim(){
		System.out.println("размер фигуры: " + width + " " + height);
	}

	double area() {
		System.out.println("Метод должен быть переопределен!");
		return 0.0;
	}
}

class Triangle extends TwoDShape{
	String style;
	int i = 10;
	Triangle(String s, double w, double h){
		super(w, h); //вызов констрктора суперкласса
		style = s;
		name = "Треугольник";
	}
	double area(){
		return getWidth() * getHeight() / 2;
	}
    void showStyle(){
		System.out.println("стиль: " + style);
	}
	//демонстарция доступа к одноименной переменной суперкласса
	int showSuperI(){
		return super.i;
	}

	/*
	String showName(){
		return name;
	}
	*/	
}

class ColorTriangle extends Triangle {
	String color;

    public ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h); // вызов констурктора Triangle
		color = c;
		name = "цветной треугольник";
    }

	void showColor() {
		System.out.println("цвет: " + color);
	}
	
}

class Rectangle extends TwoDShape{
	String outline;
	Rectangle(String o, double w, double h){
		super(w, h); //вызов констрктора суперкласса
		outline = o;
		name = "Прямоугольник";
	}
	double area(){
		return getWidth() * getHeight();
	}
	boolean isSquare(){
		if(getWidth() == getHeight())
			return true;
		return false;
	}
}

class Interihance{
	public static void main(String[] args){
		TwoDShape fig1 = new TwoDShape(20.0, 30.0);
		Triangle t1 = new Triangle("закрашенный", 4.5, 7.0);
	    ColorTriangle t2 = new ColorTriangle("синий", "контурный", 3.5, 8.0);
		Rectangle r1 = new Rectangle("сплошная", 5.0, 5.0);
		Rectangle r2 = new Rectangle("пунтир", 5.0, 7.0);
		System.out.println("информация об оьъектах");
		System.out.println("fig1: " + fig1.name);
		fig1.showDim();
		System.out.println("t1: " + t1.name);
                t1.showStyle();
		//t1.showName();
		System.out.println();
		System.out.println("площадь: " + t1.area());
		System.out.println("r1: " + r1.name);
		System.out.println("квадрат: " + r1.isSquare());
		System.out.println("площадь: " + r1.area());
		System.out.println(t1.i);
		System.out.println(t1.showSuperI());
		//Совместимость переменных родственных классов 
		// Переменная суперкласса может ссылаться на объект любого класса
		System.out.println();
		System.out.println("Ширина двумерной фигуры " + fig1.getWidth());
		//при указании на объкут суперкласса выполняется метод суперкласса
		fig1.area();
		System.out.println("имя фигуры: " + fig1.name);
		System.out.println();
		
		fig1 = t1;
		System.out.println("Ширина треугольника, на который ссылается fig1 " + fig1.getWidth());
		//при указании на объект подкласса "треугольник" выполняется вычисление площади для треугольника
		System.out.println("Площадь треугольника " + fig1.area());
		System.out.println("имя фигуры: " + fig1.name);
		System.out.println();

		fig1 = r1;
		System.out.println("Ширина прямогульника, на который ссылается fig1 " + fig1.getWidth());
		//при указании на объект подкласса "прямогульник" выполняется вычисление площади для прямогульника
		System.out.println("Площадь прямогульника " + fig1.area());
		System.out.println("имя фигуры: " + fig1.name);
		System.out.println();

		fig1 = t2;
		t2.showColor();
		System.out.println("Площадь цветного треугольника " + fig1.area());
		System.out.println("имя фигуры: " + fig1.name);
		System.out.println();


		// доступ к челанм для ссылочных переменных суперкласса закрыт: 
		//System.out.println(fig1.style());


		//проверка доступности переменных
		/*
		System.out.println(fig1.width);
		System.out.println(t1.width); //подкласс имеент доступ к переменным и методам суперкласса
		System.out.println(fig1.style); //суперкласс не имеет доступа к переменным описаннм в подклассе
		*/

		
	}

}