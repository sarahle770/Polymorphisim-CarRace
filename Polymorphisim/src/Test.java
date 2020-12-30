/**
 * This file is a part of Polymorphism project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        RaceCompetitor[] competitors = new RaceCompetitor[2];
        competitors[0] = new PrivateCar ("Mazda_3", "GUHR41");
        competitors[1] = new SportCar ("Ferarri", "HYGF54");

        int winner = Competition.go (competitors);

        for (RaceCompetitor competitor : competitors) {
            int competitionNumber = competitor.getCompetitionNumber ();
            if (competitor.getCompetitionNumber () == winner) {
                System.out.println (competitionNumber);
            }
        }
            System.out.printf ("And the winner is: %d\n ", winner);
        }
    }
