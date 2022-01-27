import java.util.ArrayList;

public class Cell {
    ArrayList<Cell> nears;
    Status status;

    public Cell() {
        status = Status.NONE;
        nears = new ArrayList<>();
    }

    void addCell(Cell cell) {
        nears.add(cell);
    }

    void stepOne() {
        int around = countNearCells();
        status = status.stepOne(around);

    }
    void stepTwo() {
        status = status.stepTwo();
    }

    int countNearCells() {
        int count = 0;
        for (Cell cell : nears) {
            if (cell.status.isCell()) {
                count++;
            }
        }
        return count;
    }

    public void turn() {
        for (Cell cell: nears ) {
            cell.status = status.isCell() ? Status.NONE : Status.LIVE;
        }
    }
}
