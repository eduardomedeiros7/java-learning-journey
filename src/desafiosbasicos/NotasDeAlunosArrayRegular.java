package desafiosbasicos;

public class NotasDeAlunosArrayRegular {
    public static void main(String[] args) {

        double[][] studentNotes = new double[3][4];

        studentNotes[0][0] = 70.5;
        studentNotes[0][1] = 80.0;
        studentNotes[0][2] = 90.0;
        studentNotes[0][3] = 62.5;

        studentNotes[1][0] = 10.0;
        studentNotes[1][1] = 20.0;
        studentNotes[1][2] = 10.0;
        studentNotes[1][3] = 12.0;

        studentNotes[2][0] = 62.5;
        studentNotes[2][1] = 70.0;
        studentNotes[2][2] = 80.0;
        studentNotes[2][3] = 90.0;

        System.out.println("Student grades");
        for (int i = 0; i < studentNotes.length; i++){
            System.out.println("Student grades " + (i + 1) + ": ");
            for (int j = 0; j < studentNotes.length; j++){
                System.out.println(studentNotes[i][j] + " ");
            }
            System.out.println();
        }


    }
}
