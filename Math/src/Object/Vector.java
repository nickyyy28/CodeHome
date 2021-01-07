/**
 * @AUTHOR : 张辉阳
 * @date :  2020/12/6 10:21
 * @version : 1.0
 */


package Object;

import java.util.ArrayList;

public class Vector {
    private ArrayList<Double> list = new ArrayList<>();

    //false 为行向量 true 为列向量
    private boolean Rank;

    public Vector(boolean rank ,double ...a) {
        this.Rank = rank;
        for (double b : a) {
            this.list.add(b);
        }
    }

    public ArrayList<Double> getList(){
        return this.list;
    }

    public boolean isRank() {
        return Rank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double b : this.list){
            sb.append(b);
            sb.append(" ");
        }
        return sb.toString();
    }

    public int getLength(){
        return this.list.size();
    }

    public static void main(String[] args) {
        Vector vector = new Vector(true,2,4,7);
        Vector vector1 = new Vector(true,6,9,15);
        Vector vector2 = new Vector(true,9,5,7);
        Vector vector3 = new Vector(true,8,2,33);
        Vector vector4 = new Vector(true,4,3,74);
        Matrix matrix = new Matrix(vector,vector1,vector2,vector3,vector4);
        System.out.println(matrix);
    }
}
