package ArrayPackage;

public class SummeMatrixDiagonaleGegendiagonale {
    public static void main(String[] args) {

        //pozvati metodu koja racuna sumu kontra adijagonale u duplom array

        int [][] dupliNiz={{10,2,3,4},{5,20,7,8}, {9,3,30,3},{4,5,6,40}};
        System.out.println(summeGegendiagonale_newversion(dupliNiz));
    }

    public static int summeGegendiagonale_newversion(int matrix [][]){
        int sum =0;
        for(int i=0; i<matrix.length; i++){           //ova  dva for-a i if kombinacija se uvijek moze kopirati za
                                                      //pristup kontradijagonali
            for(int j=matrix[i].length-1; j>=0; j--){

                if((matrix[i].length-1)-i == j) {
                    sum = sum + matrix[i][j];
                }

            }
        }
        return sum;
    }
}
