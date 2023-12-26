import java.util.Scanner;
public class karham {
    public static int findmax(int [][]etelaat , int CI) {
        int max=0;
        for (int k=0; k<etelaat.length;k++){
            if(etelaat[k][CI]>max){
                max = etelaat[k][CI];
            }
        }
        return max;
    }

    public static int findmin(int [][]etelaat , int CI) {
        int min = etelaat[0][0];
        for (int k = 0; k < etelaat.length; k++) {
            if (etelaat[k][CI] < min) {
                min = etelaat[k][CI];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner ino = new Scanner(System.in);

        System.out.println("Number of Students: ");
        int tstudent = ino.nextInt();

        System.out.println("Number of Courses: ");
        int tdars = ino.nextInt();

        int [][] etelaat = new int[tstudent][tdars];

        int[] studentIDs = new int[tstudent];
        int[] darsID = new int[tdars];

        for(int i=0; i<tstudent;i++){
            System.out.print("Student ID: ");
            studentIDs[i] = ino.nextInt();
        }
        for (int j =0; j<tdars;j++){
            System.out.println("Course ID: ");
            darsID[j] = ino.nextInt();
        }
        for (int i=0;i<tstudent;i++){
            for (int j=0;j<tdars;j++){
                System.out.println("Student ID " + studentIDs[i] + " Course ID " + darsID[j] + " Grade: " );
                etelaat[i][j] = ino.nextInt();
            }
        }
        for (int d=0;d<tdars;d++){
            int maxG = findmax(etelaat , d);
            int minG = findmin(etelaat , d);
            System.out.println(" Course ID " + darsID[d] + ", Student ID " + studentIDs[d] + ", Highest Grade: " + maxG );
            System.out.println(" Course ID " + darsID[d] + ", Student ID " + studentIDs[d] + ", Lowest Grade: " + minG );
        }
    }
}
