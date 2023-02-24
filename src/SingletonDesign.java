public class SingletonDesign {
    private SingletonDesign(){};
    private static SingletonDesign instance = new SingletonDesign();
    static SingletonDesign getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
