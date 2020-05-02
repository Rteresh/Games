package CloneBox;

import java.util.Random;

import static CloneBox.Constants.*;

public class Main {
    private static GameField gameField;

    private static void generateNeWCell(){
        int state = (new Random().nextInt(100)<= CHANCE_OF_LUCKY_SPAWN)
                ? LUCKY_INITIAL_CELL_STATE
                : INITIAL_CELL_STATE;

        int randomX, randomY;

        randomX = new Random().nextInt(COUNT_CELLS_X);
        int currentX = randomX;
        randomY= new Random().nextInt(COUNT_CELLS_Y);
        int currentY = randomY;

        boolean placed = false;

        while (!placed){
            if(gameField.getState(currentX,currentY)==0){
                gameField.setState(currentX,currentY,state);
                placed=true;
            }
            else {
                if(currentX+1<COUNT_CELLS_X){
                    currentX++;
                }
                else {
                    currentX=0;
                    if(currentY+1<COUNT_CELLS_Y){
                        currentY++;
                    }
                    else currentY=0;
                }
            }
            if((currentX==randomX)&& (currentY==randomY)){

            }
        }

    }
}
