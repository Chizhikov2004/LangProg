class Strings {
    public static void main(String[] args) {
        String str = new String("Строка номер один");
        String str2 = new String(str);
        String str3 = "строка номер три";

        System.out.println(str + " " + str2 + " " + str3);

        //методы, работающие со строками
        //1. проверка на эквивалентность boolean equals(str)
        boolean eq;
        eq = str.equals(str2);
        System.out.println("Строки str и str2 эквивалентны: " + eq);
        eq = str.equals(str3);
        System.out.println("Строки str и str3 эквивалентны: " + eq);
    
        //2. Метод опредения длины строки int lenght()
        int lenght = str.length();
        System.out.println("Длина строки str: " + lenght);

        //3. Извлечение символов по индексу char charAt(index)
        char ch;
        ch = str.charAt(3);
        System.out.println("В строке str символ под индексом 3: " + ch);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println();


        //4. Сравнение строк 
        int results; 
        results = str.compareTo("Строка помер один");
        System.out.println("Результаты сравнения строк str1 и str2: " + results);
        results = str.compareTo(str3);
        System.out.println("Результаты сравнения строк str1 и str3: " + results);
        System.out.println();

        //5. Поиск подстроки и вывод индекса по первому вхождению подстроки
        str3 = "од";
        results = str.indexOf(str3);
        System.out.println("Первое вхождение подстроки \"од\": " + results);
        System.out.println();

        //6. Поиск подстроки и вывод индекса по последнему вхождению подстроки
        str3 = "н";
        results = str.lastIndexOf(str3);
        System.out.println("Последние вхождение подстроки \"н\": " + results);
        str3 = "три";
        results = str.lastIndexOf(str3);
        System.out.println("Последние вхождение подстроки \"три\": " + results);
        System.out.println();

        String[] strs = {"Разные", "элементы", "массива", "строк", str};
        System.out.println("Исходный массив ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");
        strs[1] = "измененные элементы";
        strs[4] = "Новая строка номер один";

        System.out.println("Измененный массив ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        //СОздание подстроки
        String substr;
        System.out.println("Выделяем строку из строки str: ");
        substr = str.substring(13,17);
        System.out.println("Оригинальная строка: " + str);
        System.out.println("Подстрока: " + substr);
        System.out.println();

        //Уравнение оператором switch при помощи строк
        String command = "cancel";
        switch(command) {
            case "connect":
                System.out.println("Подключение");
                break;
            case "cancel":
                System.out.println("Галя отмена");
                break;
            case "disconnect":
                System.out.println("Отключение");
                break;

            default:
                System.out.println("Неизвестная команда");
                break;
        }
        System.out.println();
        //Текстовый блок
        String strblk = """
                Пример блока с
                "нестандартным форматированием"
                строк.
                Можно пользоваться переносом строки, табуляции и прочими управлюящиими символами.
                """; 
        System.out.println(strblk);
        System.out.println();

        //Аргументы командной строки
        System.out.println("Количество параметров, переданных программе: " + args.length);
        System.out.println("Список параметров : ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аругмент [" + i +"]: " + args[i]);
        }
        System.out.println();


        String[][] phoneNumbers = {
            {"Автосервис", "383-262-25-01"},
            {"Деканат", "244-85-10-01"},
            {"Поликлиника", "255-255-255-01"},
            {"Сантехник", "900"}
        };
        int i2;

        if(args.length !=1)
            System.out.println("Usage: java Strings <наимнеование>");
        else {
            for ( i2 = 0; i2 < phoneNumbers.length; i2++) {
                if(phoneNumbers[i2][0].equals(args[0])) {
                    System.out.println(phoneNumbers[i2][0] + ":" + phoneNumbers[i2][1]);
                    break;
                }
            }
            if(i2==phoneNumbers.length)
                System.out.println("Ничего не найдено");
        }

    }

}