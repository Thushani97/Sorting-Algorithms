import designpatterns.FactoryShape;
import designpatterns.Shape;

public class Main {
    public static void main(String[] args){
        // class, variableName = new constructor()
//        sample s = new sample(new int[]{1, 2, 3, 5, 6, 67,0});
//        int[] b = s.Sort();
//        System.out.println(Arrays.toString(b));

        InsertionSort.insertionSort(new int[]{11, -2, 3, 5, 6, 67,0});

//        ######## Singleton Design Pattern ########
        SingletonDesign.getInstance().showMessage();

//        ######## Factory Design Pattern ########
        FactoryShape obj = new FactoryShape();
        Shape shape1= obj.getShape("Circle");
        shape1.draw();
    }
}
