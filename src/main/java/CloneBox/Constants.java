package CloneBox;

public class Constants {
    public static final int CELL_SIZE = 64;//размер одной плитки
    /*кол-во ячеек по вертикали и горизонтали*/
    public static final int COUNT_CELLS_X = 4;
    public static final int COUNT_CELLS_Y = 4;

    /*Параметры окна*/

    public static final int SCREEN_WIDTH = CELL_SIZE*COUNT_CELLS_X;
    public static final int SCREEN_HEIGHT= CELL_SIZE*COUNT_CELLS_Y;
    public static final String SCREEN_NAME = "2048";

    /*
    * Есть шанс что появится плитка со значением не 2, а 4 */
    public static final int CHANCE_OF_LUCKY_SPAWN = 17;
    /*
    * Состоянии новосозданых клеток (при условии что CHANCE_OF_LUCKY_SPAWN и без него )*/

    public static final int LUCKY_INITIAL_CELL_STATE = 4;
    public static final int INITIAL_CELL_STATE = 2;

    /*Кол-во определенных к первому ходу пользователя ячеек*/
    public static final int COUNT_INITIAL_CELLS = 2;

}
