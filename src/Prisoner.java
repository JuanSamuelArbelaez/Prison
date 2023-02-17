public record Prisoner(String name, int iD, int age, int floor, int row, int column) {
    public String getCell() {
        return this.row() + "" + this.column();
    }
}