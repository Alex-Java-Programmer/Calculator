import java.util.ArrayList;
// Класс для конвертации чисел из арабских в римские
public enum ConvertToRoman {
    I("I", 1), II("II", 2), III("III", 3),
    IV("IV", 4), V("V", 5), VI("VI", 6), VII("VII", 7),
    VIII("VIII", 8), IX("IX", 9), X("X", 10), XX("XX", 20),
    XXX("XXX", 30), XL("XL", 40), L("L", 50), LX("LX", 60),
    LXX("LXX", 70), LXXX("LXXX", 80), XC("XC", 90), C("C", 100);
    private String key;
    private int value;
    ConvertToRoman(String key, int value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public int getValue() {
        return value;
    }
    // Метод поиска римского числа из перечисления по параметру (арабское число)
    public static String SearchKey(int value) {
        String result = "No";
        for(ConvertToRoman i: values())
        {
            if (i.getValue() == value)
                result = i.getKey();
        }
        return result;
    }
    // Метод конвертации из арабского числа в римское. (учитывает "-")
    public static String convertToRoman(String text) {
        text = String.valueOf((int) Float.parseFloat(text));
        ArrayList<String> listRoman = new ArrayList<>();
        char[] mass = text.toCharArray();
        for (int i = 0; i < mass.length; i++)
        {
            String str = String.valueOf(mass[i]);
            for (int j = i + 1; j < mass.length; j++)
            {
                str += "0";
            }
            listRoman.add(SearchKey(Integer.parseInt(str)));
        }
        String result = "";
        if (mass[0] == '-')
            result = "-";
        if (mass[0] == '0')
            result = "N";
        for (int i = 0; i < listRoman.size(); i++)
        {
            if (!listRoman.get(i).equals("No"))
                result += listRoman.get(i);
        }
        return result;
    }
}