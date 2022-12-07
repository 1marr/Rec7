/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment

    private static String generateCharacter(char ch, int num) {
        String str = "";
        for (int count = 0; count < num; count++) {
            str += ch;
        }
        return str;
    }

    public static String leftRightTriangle(int height)
    {
        String str = "";
        for(int row=1; row <= height; row++){
            str += generateCharacter('*', row)+"\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        for(int row = 1; row <= height; row++){
            str += generateCharacter( ' ', height - row) + generateCharacter('*', row)+"\n";
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        for(int y = radius-1; y > -radius; y--){
            int x = (int)(Math.sqrt((radius*radius) - (y*y)));
            str += generateCharacter(' ', radius-x) + generateCharacter('*',2*x)+"\n";
        }
        return str;
    }
}
