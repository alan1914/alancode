package com.alan.effectivejava.chapter11;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/10/010 15:44
 **/
public class HashTable implements Cloneable {

    private Entry[] buckets = null;

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        /**
         * Recursively copy the linked list headed by this Entry
         * @return
         */
        Entry deepCopy() {
            return new Entry(key, value, next == null ? null : next.deepCopy());
        }
    }

    @Override
    public HashTable clone() {
        try {
            HashTable hashTable = (HashTable) super.clone();
            hashTable.buckets = buckets.clone();
            return hashTable;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {

    }

}
