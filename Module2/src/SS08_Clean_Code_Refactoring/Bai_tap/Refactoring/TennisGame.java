package SS08_Clean_Code_Refactoring.Bai_tap.Refactoring;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int numberScoreOne, int numberScoreTwo) {
        String score = "";
        int tempScore=0;
        final boolean isEqualScore = numberScoreOne == numberScoreTwo;
        if (isEqualScore)
        {
            score = getScoreNumberOne(numberScoreOne);
        }
        else if (numberScoreOne>=4 || numberScoreTwo>=4)
        {
            score = getWinPlayer(numberScoreOne, numberScoreTwo);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = numberScoreOne;
                else { score+="-"; tempScore = numberScoreTwo;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String getWinPlayer(int numberScoreOne, int numberScoreTwo) {
        String score;
        int minusResult = numberScoreOne - numberScoreTwo;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getScoreNumberOne(int numberScoreOne) {
        String score;
        switch (numberScoreOne)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
