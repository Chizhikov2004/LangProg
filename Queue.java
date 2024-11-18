class Queue {
    char[] q;
    int putloc, getloc; //указатели на индексы для помещения и извлчеения символов
    Queue(int size) {
        q = new char[size]; //выделяем память под очередь нужного размера
        putloc = getloc = 0;
    }

    //Метод для помещения символа в очередь
    void put(char ch) {
        if (putloc==q.length) {
            System.out.println(" - очередь переполнена");
            return;
        }
        q[putloc++] = ch;
    }

    //Метод для извлечения символа из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Сохранение алфавит в очередь bigQ");
        for ( i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        System.out.print("Содержимое очереди bigQ: ");
        for ( i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0)
                System.out.println(ch);
        }
        System.err.println("\n");
        System.out.println("Сохраняем символы в очередь smallQ");
        for ( i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        System.out.println("Извлекаем символы из очередь smallQ");
        for ( i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0)
                System.out.println(ch);
        }
        System.out.println();

    }

}
