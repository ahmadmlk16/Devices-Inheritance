package AhmadMalik;

public class Main {

    public static void main(String[] args) {
	Electronics e1, e2 , e3 ,e4;
	e1 = new Cellphone("Apple","IPhone XS Max", "Silver", 0.3, 12);
	e2 = new Laptop ("Dell","Inspison 1500","Black",1.2,6);
	e3 = new Desktop("Alienware","7000 series","RGB",25,6);
	e4 = new Tablet("Samsung", "Tab S4","White", 0.6,8);

	e1.disp();
	e2.disp();
	e3.disp();
	e4.disp();

    }
}
