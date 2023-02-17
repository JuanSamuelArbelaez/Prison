import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PrisonFloor {
    public PrisonFloor(int floor, int columns, int rows){
        this.rows=(rows);
        this.columns=(columns);
        this.prisoners = new Prisoner[this.getRows()][this.getColumns()];
        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getColumns(); j++){
                this.prisoners[i][j] = creatRandomPrisoner(floor, i, j);
            }
        }
    }
    private final Prisoner[][] prisoners;
    private final int rows;
    private final int columns;
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    private Prisoner creatRandomPrisoner(int floor, int i, int j) {
        return new Prisoner(getRandomName(), getRandomID(), getRandomAge(), floor, i, j);
    }
    private int getRandomAge() {
        return 20+new Random().nextInt(41);
    }
    private int getRandomID() {
        return new Random().nextInt(10000);
    }
    private String getRandomName() {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Robinson", "Mario", "Luis", "Daniel", "John", "Mike", "Miguel", "Alejandro", "Samuel", "Juan", "Esteban", "Santiago", "Nicolas", "Jacobo"));
        return names.get(new Random().nextInt(names.size()));
    }
    public Prisoner getPrisoner(int rows, int columns) {
        try{
            return this.prisoners[rows][columns];
        } catch(Exception e){
            return null;
        }
    }
}
