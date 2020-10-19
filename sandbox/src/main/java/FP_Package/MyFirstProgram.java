package FP_Package;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("Ура, ");
		hello("Ого ");
		hello("Вот это да ");
		Square s = new Square (5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и "+ r.b +" = " + r.area());
		}
		public static void hello(String somebody){

		System.out.println(somebody + "товарищи!");
		}
}