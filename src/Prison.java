import java.util.ArrayList;

public class Prison {
    private final ArrayList<PrisonFloor> floors = new ArrayList<>();

    public Prison(int floors, int rows, int columns) {
        for(int i=0;i<floors;i++) {
                this.floors.add(new PrisonFloor(i+1, rows, columns));
        }
    }
    public ArrayList<Prisoner> getPrisoners_AgeAbove(int age, int floorNumber, int rows, int columns, ArrayList<Prisoner> auxPrisonerList ){
        Prisoner auxPrisoner = floors.get(floorNumber).getPrisoner(rows, columns);
        if(auxPrisoner.age()>age) auxPrisonerList.add(auxPrisoner);

        if(columns >=floors.get(floorNumber).getColumns()-1){
            if(rows >=floors.get(floorNumber).getRows()-1){
                if(floorNumber >= floors.size()-1){
                    return auxPrisonerList;
                }
                return getPrisoners_AgeAbove(age, floorNumber+1, 0, 0, auxPrisonerList);
            }
            return getPrisoners_AgeAbove(age, floorNumber, rows+1, 0, auxPrisonerList);
        }
        return getPrisoners_AgeAbove(age, floorNumber, rows, columns+1, auxPrisonerList);
    }
    public void printPrisoners(ArrayList<Prisoner> auxPrisonerList) {
        for(Prisoner prisoner:auxPrisonerList){
            System.out.println("--------------------------------");
            System.out.println("     Prisoner ID: "+prisoner.iD()+
                    "\n     Name: "+prisoner.name()+
                    "\n     Cell: "+prisoner.getCell()+
                    "\n     Age: "+prisoner.age());
            System.out.println("--------------------------------");
        }
    }
}
