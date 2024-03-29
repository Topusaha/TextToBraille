public class BrailleConversion
{
    //brail incoding 1 = dot 0 = no dot
    static String[] braille =
            {
                    "000000", //space
                    "100000", //a
                    "110000", //b
                    "100100", //c
                    "100110", //d
                    "100010", //e
                    "110100", //f
                    "110110", //g
                    "110010", //h
                    "010100", //i
                    "010110", //j
                    "101000", //k
                    "111000", //l
                    "101100", //m
                    "101110", //n
                    "101010", //o
                    "111100", //p
                    "111110", //q
                    "111010", //r
                    "011100", //s
                    "011110", //t
                    "101001", //u
                    "111001", //v
                    "010111", //w
                    "101101", //x
                    "101111", //y
                    "101011", //z

            };


    public static String convertToBraille(String str) {
        String position = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                position += braille[0];

            else
                position += braille[(str.charAt(i) + 93) % 27];
        }


        return position;

    }
}