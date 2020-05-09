import java.text.DecimalFormat;
// Класс операций сложения, вычитания, умножения, деления
public class ResultOperation {
    private int a;
    private int b;
    private String operation;
    public ResultOperation(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    // Метод который выполняет сложение, вычитание, умножение и деление
    // Проверяет соответствие условию задачи и выбрасывает исключения если условия не выполняются
    public String method() throws Exception {
        if (a > 0 && a < 11 && b > 0 && b < 11)
        {
            if (operation.equals("+"))
                return String.valueOf(a + b);
            else if (operation.equals("-"))
                return String.valueOf(a - b);
            else if (operation.equals("*"))
                return String.valueOf(a * b);
            else if (operation.equals("/"))
                return String.valueOf((float) a / b);
            else
                throw new Exception();
        }
        else
            throw new Exception();
    }
}