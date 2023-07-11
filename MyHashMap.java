public class MyHashMap {
    private static final int DEFAULT_CAPACITY = 16;
    private Node[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(Object key, Object value) {
        int bucketIndex = getBucketIndex(key);
        Node newNode = new Node(key, value);

        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = newNode;
            size++;
        } else {
            Node currentNode = buckets[bucketIndex];
            Node prevNode = null;

            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }

            prevNode.next = newNode;
            size++;
        }
    }

    public void remove(Object key) {
        int bucketIndex = getBucketIndex(key);

        Node currentNode = buckets[bucketIndex];
        Node prevNode = null;

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                if (prevNode == null) {
                    buckets[bucketIndex] = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int bucketIndex = getBucketIndex(key);

        Node currentNode = buckets[bucketIndex];

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }

        return null;
    }

    private int getBucketIndex(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length;
    }

    private static class Node {
        private Object key;
        private Object value;
        private Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}