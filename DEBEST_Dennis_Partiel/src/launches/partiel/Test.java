package launches.partiel;

import classes.partiel.*;

public class Test {

	public static void main(String[] args) {
		StatItems stat = new StatItems();
		String simul = "aabbbCCCddddeeFFF014566666\nGHGHJGAhgjaggha1456";
		for (int i = 0 ; i<simul.length(); i++){
			char c = simul.charAt(i);
			if (c!='\n')
				stat.gereItem(c);
		}
		stat.trie();
		System.out.println(stat);
	}

}
