package CloneBox;


public class Test {
    public static void main(String[] args) {
        int[][]a = new int [4][4];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                a[i][j]=j;
            }
        }
        System.out.println(a.length);
    }
}
