package LOKESH;

class classbox { // <-- No 'public' here
    double width;
    double height;
    double depth;
}
public class classbox {
    public static void main(String args[]) {
        classbox mybox = new classbox();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}