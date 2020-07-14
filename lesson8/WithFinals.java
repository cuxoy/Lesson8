package lesson8;

public class WithFinals {
    final private int first;
    final private String second;
    final private boolean third;


   /*public WithFinals() {   Если переменные final, то конструктор "по умолчанию" финализирует перменные без
   параметров, что не имеет смысла. Например, second будет равен Null. Чтоб переменные имели хоть какой-то смысл,
   приходится задавать им изначальные значения. И с помощью сеттера их уже не изменить, по причине "final"
   }*/

    public WithFinals(int first, String second, boolean third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public boolean isThird() {
        return third;
    }
}



