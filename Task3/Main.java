package by.epam.les10.main;

public class Main {
	//Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
    public static void main(String[] args) {
        Rouse ros1 = new Rouse(35, Color.Red);
        Rouse ros2 = new Rouse(20, Color.Green);
        Violet vio1 = new Violet(45, Color.Yellow);
        Craft cr= new Craft(100, "Craft package", "Brown");
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(ros1);
        bouquet.addFlower(ros2);
        bouquet.addFlower(vio1);
        bouquet.addPackaging(cr);
        System.out.println("Total price = " +bouquet.getPrice());
    }
}
