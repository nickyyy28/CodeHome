/**
 * @AUTHOR : 张辉阳
 * @date :  2020/12/6 10:36
 * @version : 1.0
 */


package Object;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    private ArrayList<Vector> matrix = new ArrayList<>();

    public Matrix(Vector ...a) {
        int len = a[0].getLength();
        boolean rank = a[0].isRank();
        for (Vector b : a){
            if (b.getLength() != len || b.isRank() != rank) return;
        }
        matrix.addAll(Arrays.asList(a));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vector b : this.matrix){
            sb.append(b.toString());
            sb.append("\n");
        }
        return sb.toString();
    }


}
