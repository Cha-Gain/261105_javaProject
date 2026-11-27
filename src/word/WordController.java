package word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WordController {
	private List<Word> wordBook = new ArrayList<>();
	
	public WordController() {
		String word = "dog";
		List<String> mean = new ArrayList<>();
		mean.add("개");
		mean.add("강아지");
		mean.add("개과 동물");
		mean.add("집에서 기르는 동물");	
		
		Word w = new Word(word, mean);
		
		String word2 = "cat";
		List<String> mean2 = new ArrayList<>(Arrays.asList("고양이","야옹이","귀여운 동물"));
		
		Word w2 = new Word(word2, mean2);
		
		List<String> mean3 = new ArrayList<>(Arrays.asList("호랑이","어흥"));
		
		Word w3 = new Word("tiger", mean3);
		
		wordBook.add(w);
		wordBook.add(w2);
		wordBook.add(w3);
	}
	
	public void insertWord(Scanner scan) {
		
		System.out.println("단어>");
		String word = scan.next();
		
		// 입력받은 단어가 이미 존재하는 단어인지 확인
		if(wordBook.contains(new Word(word))) {
			System.out.println("이미 존재하는 단어입니다.");
			return;
		}
		
		scan.nextLine(); // 이전에 입력 된 엔터 값을 지우기
		
		List<String> mean = new ArrayList<>();
		while(true) {
			System.out.println("뜻> (종료:0)");
			// 뜻에 띄어쓰기 포함
			String m = scan.nextLine();
			if(m.equals("0")) {
				break;
			}
			mean.add(m);
		}
		
		wordBook.add(new Word(word, mean));
		System.out.println("단어 등록 완료!!");
	}
	
	public void printWord() {
		// 전체 출력		
		wordBook.sort(null); // 이미 클래스에서 구현완료
		//Collections.sort(wordBook); // 내부 구현에 따라 정렬
//		wordBook.sort(new Comparator<Word>() {
//
//			@Override
//			public int compare(Word o1, Word o2) {
//				return o1.getWord().compareTo(o2.getWord());
//			}
//		});
		
		System.out.println("---단어장--");
		for(Word w : wordBook) {
			w.printMean();
		}
	}
	
	public void searchWord(Scanner scan) {
		// 단어 검색
		System.out.println("단어>");
		String word = scan.next();
		
		int index = wordBook.indexOf(new Word(word));
		
		if(index != -1) {
			System.out.println(wordBook.get(index));
			return;
		} 
		
		System.out.println("검색 단어가 없습니다");
	}
	
	public void modifyWord(Scanner scan) {
		// 단어 수정
		/* 수정할 단어 입력 받기
		 * 해당 Word를 wordBook에서 검색 => index
		 * get(index) 단어 가져오기
		 * 뜻 리스트 보여주기
		 * 몇번 뜻을 수정할지 숫자로 받기 => no-1(mean의 번지)
		 * 변경할 뜻 입력받기
		 * getMean => 뜻 가져오기 / setMean(no-1, 변경할 뜻)
		 * 
		 */
		System.out.println("단어>");
		String word = scan.next();
		
		int index = wordBook.indexOf(new Word(word));
		
		if(index == -1) {
			System.out.println("없는 단어입니다.");
			return;
		}
		wordBook.get(index).printMean(); // 뜻 출력
		System.out.println("변경할 의미의 번호를 입력>");
		int no = scan.nextInt();
		if(no<=0|| no>wordBook.get(index).getMean().size()) {
			System.out.println("없는 번지 입니다 다시 시도");
			return;
		}
		
		System.out.println("변경 뜻 입력>");
		scan.nextLine();
		String changeMean = scan.nextLine();
		
		wordBook.get(index).getMean().set(no-1, changeMean);
		System.out.println("수정완료!!");
		
		
	}
	
	public void removeWord(Scanner scan) {
		// 단어 삭제
		// list move(index) =>값을 리턴 / remove(Object) => boolean
		System.out.println("단어>");
		String word = scan.next();
		
		boolean ok = wordBook.remove(new Word(word));
		
		System.out.println(ok? "삭제 완료" : "없는 단어입니다");

	}
	
}
