package Day15HashTable;

public class HashTableMain {
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "Paranoids are not paranoid because they are paranoid but"
                + " because they keep putting themselves deliberately into paranoid avoidable situations";
        /*
         * Storing given sentence in an array. Converting the sentence to lower
         * case and removing spaces.
         */
        String[] sentenceArray = sentence.toLowerCase().split(" ");
        // Iterating over the array.
        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);
            // If not found, frequency of the word StayWith 1
            if (value == null)
                value = 1;
            else
                // If found, frequency of the word increases by 1
                value = value + 1;
            hashTable.add(word, value);
        }
        System.out.println(hashTable);
        hashTable.remove("avoidable");		//Remove "avoidable" from the hashtable
        System.out.println(hashTable);
    }
}