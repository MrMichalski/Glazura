public class Worker {
    public double work(int a, int b, int x, int y) {
        if(a*b < x*y) {
            System.out.println("Plate is bigger than surface");
        }
            return a*b/x*y+(a*b/x*y)/10;
    }
}
