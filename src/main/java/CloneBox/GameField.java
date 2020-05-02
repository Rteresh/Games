package CloneBox;

import java.util.Arrays;

import static CloneBox.Constants.*;

public class GameField {
    private int[][] theField; // состояние ячеек поля

    public int getState(int x, int y) {
        return theField[x][y];
        // возвращает состояние ячейки поля по координатам 
    }
    /*
    * Изменяет состояние ячейки поля по координатам
    * state новое состояние для этой ячейки*/
    
    public void setState(int x,int y,int state) {
        this.theField[x][y]=state;
    }
    public GameField(){
        theField = new int[COUNT_CELLS_X][COUNT_CELLS_Y];

        for (int[] ints : theField) {
            Arrays.fill(ints, 0);
        }
    }
    /*
    * изменяет столбец под номером i 
    * newColumn Массив новых состояний ячеек столбца */
    public void setColumn(int i,int []newColumn){
        theField[i]=newColumn;
    }
    /*
    * Возвращает массив состояний яекк столбца под номером i*/
    public int[] getColumn(int i){
        return theField[i];
    }
    /*Изменяет строку под номером i
    * newLine Массив новых состояний ячеек строкии*/
    
    public void setLine(int i,int [] newLine){
        for (int j = 0; j <COUNT_CELLS_X ; j++) {
            theField[j][i]=newLine[j];
        }
    }

    /*Возвращает массив состояний ячеек строки под номером i*/

    public int[] getLine(int i){
        int[] ret = new int[COUNT_CELLS_X];
        for (int j = 0; j <COUNT_CELLS_X ; j++) {
            ret[j]=theField[j][i];
        }
        return ret;
    }


}
