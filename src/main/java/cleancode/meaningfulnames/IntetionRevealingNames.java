package cleancode.meaningfulnames;


import java.util.ArrayList;
import java.util.List;

public class IntetionRevealingNames {

    // BadOne
    public List<int[]> getThem(List<int[]> theList){
        List<int[]> list1 = new ArrayList<int[]>();
        for(int[] x : theList){
            if(x[0] == 4){
                list1.add(x);
            }
        }
        return list1;
    }

    // GoodOne
    public List<Cell> getFlaggedCelles(List<Cell> gameBoard){
        List<Cell> flaggedCell = new ArrayList<>();

        for(Cell cell: gameBoard){
            if(cell.isFlagged()){
                flaggedCell.add(cell);
            }
        }

        return flaggedCell;
    }

}

class Cell{

    public static final int STATUS_VALUE = 0;
    public static final int FLAGED = 4;
    private int[] cellData;

    public boolean isFlagged(){
        return cellData[STATUS_VALUE] == FLAGED;

    }
}
