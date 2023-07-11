public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Добавление элементов в список
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Size: " + list.size());

        // Вывод элементов списка
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // Удаление элемента из списка
        list.remove(1);

        System.out.println("Size after removal: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // Очистка списка
        list.clear();

        System.out.println("Size after clearing: " + list.size());

        // Добавление элементов в список
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Размер списка: " + list.size());

        // Получение элемента по индексу
        Object element = list.get(2);
        System.out.println("Элемент по индексу 2: " + element);

        // Удаление элемента по индексу
        list.remove(1);
        System.out.println("Размер списка после удаления элемента: " + list.size());

        // Очистка списка
        list.clear();
        System.out.println("Размер списка после очистки: " + list.size());

        // Добавление элементов в стек
        MyStack stack = new MyStack();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println("Size: " + stack.size());

        // Получение элемента с вершины стека (первый элемент в стеке)
        System.out.println("Peek: " + stack.peek());

        // Удаление элемента с вершины стека (первый элемент в стеке)
        System.out.println("Pop: " + stack.pop());

        System.out.println("Size after pop: " + stack.size());

        // Создание и использование объекта MyHashMap
        MyHashMap map = new MyHashMap();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("Size of map: " + map.size());
        System.out.println("Value for key2: " + map.get("key2"));

        map.remove("key1");

        System.out.println("Size of map after removal: " + map.size());
    }
}