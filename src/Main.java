
import designpatterns.FactoryShape;
import designpatterns.Shape;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        // class, variableName = new constructor()
//        sample s = new sample(new int[]{1, 2, 3, 5, 6, 67,0});
//        int[] b = s.Sort();
//        System.out.println(Arrays.toString(b));


//        InsertionSort.insertionSort(new int[] {23, 4,12,9,3,-12,-3});
        String sorted=SelectionSort.selectionSort(new int[] {23, 4,12,9,3,-12,-3});
        System.out.println(sorted);
        FactoryShape shapeFactory = new FactoryShape();

        //get an object of Circle and call its draw method.
        Shape shape1 =  shapeFactory.getShape("Circle");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 =  shapeFactory.getShape("Square");

        //call draw method of Rectangle
        shape2.draw();


    }
}
