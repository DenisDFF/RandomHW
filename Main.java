public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        list.remove(1);

        System.out.println("Size after removal: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        list.clear();

        System.out.println("Size after clearing: " + list.size());


        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Размер списка: " + list.size());


        String element = list.get(2);
        System.out.println("Элемент по индексу 2: " + element);


        list.remove(1);
        System.out.println("Размер списка после удаления элемента: " + list.size());


        list.clear();
        System.out.println("Размер списка после очистки: " + list.size());

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");

        // Вывод размера списка
        System.out.println("Размер списка: " + list.size());

        // Вывод первого элемента в списке
        System.out.println("Первый элемент в списке: " + list.get(0));

        // Вывод размера списка после удаления элемента
        System.out.println("Размер списка: " + list.size());

        // Очистка списка
        list.clear();

        // Вывод размера списка после очистки
        System.out.println("Размер списка после очистки: " + list.size());


        MyStack<String> stack = new MyStack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println("Size: " + stack.size());

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Size after pop: " + stack.size());


        MyHashMap<String, Integer> hashMap = new MyHashMap<>();

        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 30);

        System.out.println("Size of HashMap: " + list.size());

        System.out.println("Value for 'Apple': " + hashMap.get("Apple"));
        System.out.println("Value for 'Banana': " + hashMap.get("Banana"));
        System.out.println("Value for 'Orange': " + hashMap.get("Orange"));

        hashMap.remove("Banana");

        System.out.println("Size after removal: " + list.size());
        System.out.println("Value for 'Banana' after removal: " + hashMap.get("Banana"));

        list.clear();

        System.out.println("Size after clearing: " + list.size());
    }
}