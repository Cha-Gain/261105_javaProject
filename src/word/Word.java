package word;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word implements Comparable<Word> {
	// 하나의 단어에 뜻이 여러개 저장 될 수 있게 저장
	// 뜻에 띄어쓰기를 포함
	private String word;
	private List<String> mean = new ArrayList<>();
	
	public Word() {}
	
	public Word(String word) {
		this.word = word;
	}
	
	public Word(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	}
	
	// mean 출력 메서드
	public void printMean() {
		int cnt = 0;
		System.out.println(word);
		for(String m : mean) {
			cnt++;
			System.out.println(cnt + ". " + m);
		}
		System.out.println("-----------------------");
	}

	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public List<String> getMean() {
		return mean;
	}
	
	public void setMean(List<String> mean) {
		this.mean = mean;
	}
	
	@Override
	public String toString() {
		return word + " : " + mean;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public int compareTo(Word o) {
		// this 랑 o 둘이 비교
		return this.word.compareTo(o.getWord());
	}
}
