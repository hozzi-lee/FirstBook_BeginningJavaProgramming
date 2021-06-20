package inheritance.polymorphism.practice;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	public static void main(String[] args) {

		List<Shape> list = new ArrayList<Shape>();

		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());

		for(Shape s : list) {
			s.draw();
		}
	}

}
