import java.util.HashMap;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap <String, Integer> map = new HashMap<>();
		for (int i =0; i < names.length; i++){
			map.put(names[i], ages[i]);
		}
	return map;
	}
	
	public static void increaseAge(HashMap<String, Integer> map, String name) {
		if (map.containsKey(name)) {
			map.put(name, map.get(name) + 1);
		}
	}

	public static void replaceName (HashMap<String, Integer> map, String oldName, String newName) {
		if (map.containsKey(oldName)) {
			Integer age = map.remove(oldName);
			map.put(newName, age);
		}
	}

}
