import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Prison prison = new Prison(4, 4, 4);
        prison.printPrisoners(prison.getPrisoners_AgeAbove(45, 0, 0, 0, new ArrayList<>()));
    }
}