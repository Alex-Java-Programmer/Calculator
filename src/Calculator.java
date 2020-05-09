import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws Exception {
        /*
        Требования:
        1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами:
        a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)!
        2. Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
        3. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числа.
        4. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.
        На выходе числа не ограничиваются по величине и могут быть любыми.
        5. Калькулятор умеет работать только с целыми числами.
        6. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно,
        при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
        7. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
        8. При вводе пользователем строки не соответствующей одной из вышеописанных арифметических операций
        приложение выбрасывает исключение и завершает свою работу.
         */
        while (true)  // Программа работает пока не возникнет исключение по условию задачи
        {
            //Ввод строки через пробел (число_операция_число)
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next("\\w+");
            String operation = scanner.next("\\D");
            String b = scanner.next("\\w+");
            try
            {
                // Для арабских чисел от 1 до 10
                int aInt = Integer.parseInt(a);
                int bInt = Integer.parseInt(b);
                ResultOperation resultOperation = new ResultOperation(aInt, bInt, operation);
                System.out.println(resultOperation.method());
            }
            catch (NumberFormatException e)
            {
                // Для римских чисел от I до X
                int aInt = ConvertToInt.convertToInt(a);
                int bInt = ConvertToInt.convertToInt(b);
                ResultOperation resultOperation = new ResultOperation(aInt, bInt, operation);
                System.out.println(ConvertToRoman.convertToRoman(resultOperation.method()));
            }
        }
    }
}