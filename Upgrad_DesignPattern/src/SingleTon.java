public class SingleTon {

    //  A single static instance initialized with null
    private static SingleTon singleInstance= null;

    // A private constructor
    private SingleTon() {

    }


    // A public method to create the instance
    public static SingleTon createInstance() {
        synchronized (new Object()) {
            if (singleInstance == null) {
                singleInstance = new SingleTon();
            }
        }
        return singleInstance;
    }
}
