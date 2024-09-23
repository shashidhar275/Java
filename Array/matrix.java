public class matrix{
    public static void main(String args[]){
        int matrix[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                matrix[i][j] = (int)(Math.random()*100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Enhanced For Loop in Java
        for(int m[]: matrix){
            for(int n: m){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}