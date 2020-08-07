package com.jza.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutocompleteTrie {

	Trie trie;

	public void build(List<String> words) {
		Trie trie = new Trie(false, new HashMap<>());
		for (String word : words) {
			Trie current = trie;
			for (Character c : word.toCharArray()) {
				if (!current.children.containsKey(c)) {
					current.children.put(c, new Trie(false, new HashMap<>()));
				}
				current = current.children.get(c);
			}
			current.isWord = true;
		}
		this.trie = trie;
	}

	public List<String> autocomplete(String word) {
		Trie current = this.trie;
		for (Character c : word.toCharArray()) {
			if (!current.children.containsKey(c)) {
				return new ArrayList<>();
			}
			current = current.children.get(c);
		}
		List<String> words = new ArrayList<>();
		this.dfs(current, word, words);
		return words;
	}

	public void dfs(Trie node, String prefix, List<String> words) {
		if (node.isWord) {
			words.add(prefix);
		}
		for (Character c : node.children.keySet()) {
			this.dfs(node.children.get(c), prefix + c, words);
		}
	}


	static class Trie {
		public Boolean isWord;
		public Map<Character, Trie> children;

		public Trie(Boolean isWord, Map<Character, Trie> children) {
			this.isWord = isWord;
			this.children = children;
		}
	}
}
