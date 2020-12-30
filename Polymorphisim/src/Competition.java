

/**
 * This file is a part of Polymorphisim project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Competition {

    public static int go(RaceCompetitor[] competitors) {
        int distanceWinner = competitors[0].getDistance ();
        int competitionNumber = competitors[0].getCompetitionNumber ();

        for (RaceCompetitor competitor : competitors) {
            int distance = competitor.getDistance ();

            printTravelDistance (distance);

            if (distance > distanceWinner) {
                distanceWinner = distance;
                competitionNumber = competitor.getCompetitionNumber ();
            }
        }
        return competitionNumber ;
    }

    private static void printTravelDistance(int distance) {
        System.out.println ("-".repeat (Math.max (0, distance)));
    }
}
