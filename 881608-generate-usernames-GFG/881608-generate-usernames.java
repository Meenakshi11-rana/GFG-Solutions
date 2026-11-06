import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public ArrayList<String> generateUsernames(String[] arr) {
        ArrayList<String> result = new ArrayList<>();

        // Track all initial usernames as reserved
        HashSet<String> reserved = new HashSet<>();
        for (String name : arr) {
            reserved.add(name);
        }

        // Map to keep track of the next suffix count for each base name
        HashMap<String, Integer> baseCounters = new HashMap<>();
        // Set to track usernames that have already been assigned in this run
        HashSet<String> assigned = new HashSet<>();

        for (String name : arr) {
            // If the name hasn't been assigned to a previous user yet, keep it unchanged
            if (!assigned.contains(name)) {
                result.add(name);
                assigned.add(name);
            } else {
                // Name already assigned, find the smallest positive integer suffix
                int count = baseCounters.getOrDefault(name, 1);
                String newName = name + count;

                // Keep incrementing if the generated name is either reserved or already assigned
                while (reserved.contains(newName) || assigned.contains(newName)) {
                    count++;
                    newName = name + count;
                }

                // Save the progress for this base name to avoid starting from 1 next time
                baseCounters.put(name, count + 1);

                result.add(newName);
                assigned.add(newName);
            }
        }

        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna