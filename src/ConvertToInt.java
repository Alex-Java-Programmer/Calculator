// Класс для конвертации чисел из римских в арабские
public enum ConvertToInt {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4),
    V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8),
    IX("IX", 9), X("X", 10);
    private String key;
    private int value;
    ConvertToInt(String key, int value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public int getValue() {
        return value;
    }
    // Метод конвертации из римских в арабские (работает только с условием ввода от I до X)
    public static int convertToInt(String key) {
        int result = 0;
        for(ConvertToInt i: values())
        {
            if (i.getKey().equals(key))
                result = i.getValue();
        }
        return result;
    }
}