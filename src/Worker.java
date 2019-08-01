public class Worker {

    public double work(int a, int b, int x, int y, String drunk) {
        if (a * b < x * y) {
            System.out.println("Plate is bigger than surface");
            return 0;
        }

        int checkDrunk = checkDrunk(drunk);

        return a * b / x * y + (a * b / x * y) / checkDrunk;

    }

    private int checkDrunk(String drunk) {
        if (isTrzezwy(drunk)) return 1;
        if (drunk.equals("slabo")) {
            return 5;
        } else if (drunk.equals("srednio")) {
            return 10;
        } else return 25;
    }

    private boolean isTrzezwy(String drunk) {
        return drunk == null;
    }

}

