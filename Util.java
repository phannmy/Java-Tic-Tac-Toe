public class Util {
    private static int playerNums = 1;
    private static String difficulties = " easy";
    private static boolean win = false;
    private static boolean draw = false;    
    public void setPlayerNums(int playerNums)
    {
        Util.playerNums = playerNums;
    }

    public static int getPlayerNums()
    {
        return playerNums;
    }

    public  void setDifficulties(String difficulties)
    {
        Util.difficulties = difficulties;
    }

    public static String getDifficulties()
    {
        return difficulties;
    }

    public static  void setWin(Boolean win)
    {
        Util.win = win;
    }

    public static Boolean getWin()
    {
        return win;
    }

    public  void setDraw(Boolean draw)
    {
        Util.draw = draw;
    }

    public static Boolean getDraw()
    {
        return draw;
    }
}
