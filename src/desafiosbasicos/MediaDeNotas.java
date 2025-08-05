package desafiosbasicos;

public class MediaDeNotas {
    public static void main(String[] args) {

        double [] notes = new double[4];
        notes[0] = 4.0;
        notes[1] = 7.0;
        notes[2] = 5.5;
        notes[3] = 6.0;

        double sum = 0.0;

        for (int i = 0; i < notes.length; i++){
            sum += notes[i];

            }
        double average = sum / notes.length;
        System.out.printf("Average:  %.2f%n",average);


        }
    }

