import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        String q1 = "Who composed \"Fur Elise\", Bagatelle No.25 in A minor?\n"
                + "(a) Ludwig Van Beethoven\n(b) Gioachino Rossini\n(c) Antonio Vivaldi\n";

        String q2 = "Who composed \"Moonlight\", Piano Sonata No.14 in C-sharp minor, Op. 27, No.2?\n"
                + "(a) J.S. Bach\n(b) Ludwig Van Beethoven\n(c) Frederic Chopin\n";

        String q3 = "Who composed \"Eine kleine Nachtmusik\", Serenade No.13 for strings in G major?\n"
                + "(a) Wolfgang Amadeus Mozart\n(b) Carl Orff\n(c) Richard Wagner\n";

        String q4 = "Who composed Toccata and Fugue in D minor?\n"
                + "(a) Antonio Vivaldi\n(b) J.S. Bach\n(c) Gioachino Rossini\n";

        String q5 = "Who composed Symphony No.5 in C minor?\n"
                + "(a) Frederic Chopin\n(b) Ludwig Van Beethoven\n(c) Samuel Barber\n";

        String q6 = "Who composed Carmina Burana: O Fortuna?\n"
                + "(a) Gioachino Rossini\n(b) J.S. Bach\n(c) Carl Orff\n";

        String q7 = "Who composed The Four Seasons, Winter in F Minor?\n"
                + "(a) Johann Strauss\n(b) Wolfgang Amadeus Mozart\n(c) Antonio Vivaldi\n";

        String q8 = "Who composed The Valkyrie: Ride of the Valkyries?\n"
                + "(a) Frederic Chopin\n(b) Richard Wagner\n(c) Ludwig Van Beethoven\n";

        String q9 = "Who composed The Barber of Seville: Overture?\n"
                + "(a) Gioachino Rossini\n(b) Antonio Vivaldi\n(c) Samuel Barber\n";

        String q10 = "Who composed Nocturne No.2 in E-Flat major, Op.9?\n"
                + "(a) Frederic Chopin\n(b) Antonio Vivaldi\n(c) Wolfgang Amadeus Mozart\n";


        Questions [] questions = {
                new Questions(q1, "a"),
                new Questions(q2, "b"),
                new Questions(q3, "a"),
                new Questions(q4, "b"),
                new Questions(q5, "b"),
                new Questions(q6, "c"),
                new Questions(q7, "c"),
                new Questions(q8, "b"),
                new Questions(q9, "a"),
                new Questions(q10, "a")
        };

        takeTest(questions);
    }

    public static void takeTest(Questions[] question){
        Scanner input = new Scanner(System.in);

        int score = 0;

        for(int i = 0; i < question.length; i++){
            System.out.println(question[i].prompt);
            String answer = input.nextLine();

            if(answer.equals(question[i].answer)){
                score++;
            }
        }

        System.out.println("Your score is " + score + "/" + question.length);
    }
}
