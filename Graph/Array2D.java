package Graph;

public class Array2D {
    int a[][];

    Array2D(int rows, int cols){
        a=new int[rows][cols];
    }

    public void insert() {
        a[0][0]=1;
        a[0][1]=2;

        a[1][0]=4;
        a[1][1]=5;


    }

    public void display() {
        for(int i=0;i<a.length;i++) {

            for(int j=0;j<a[0].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");

        }

    }

    public static void main(String [] args) {
        Array2D arr=new Array2D(2, 2);
        arr.insert();
        arr.display();
    }
}
