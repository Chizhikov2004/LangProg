class Arrays {
    public static void main(String[] args) {
        int [] nums = new int[10];
        // Заполненеие массива значениями
        for (int i = 0; i<10; i++)
            nums[i]= i;
        //Выввод содержимого массива
        for (int i = 0; i<10; i++)
            System.out.println("Элемент nums [" + i + "]: " + nums[i]);
        System.out.println();

        //ввод каждого элемента массива вручную
        nums[0] = 32;
        nums[1] = -42;
        nums[2] = 3112;
        nums[3] = 3;
        nums[4] = 20;
        nums[5] = 302;
        nums[6] = -25;
        nums[7] = 12;
        nums[8] = 31;
        nums[9] = -333;

        //Находим максимальное и минимальное значение в массива
        int min, max;
        min = max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("Минимальное значение: " + min + "\n" + "Максимальное значение: " + max);
        System.out.println();

        //Альтернативная форма инициализации массива: 
        int x =10;
        int[] nums1 = {32, -42, 3112, 3, 20, 302, -25, 12, 31, -333};
        min = max = nums1[0];
        for (int i = 1; i < nums1.length; i++) {
            if(nums1[i] < min) min = nums1[i];
            if(nums1[i] > max) max = nums1[i];
        }
        System.out.println("Минимальное значение: " + min + "\n" + "Максимальное значение: " + max);
        System.out.println();
        
    }

}