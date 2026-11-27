package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 클래스
		// Date클래스 => Deprecated (비권장)
		// Calender 클래스 / LocalDate 클래스
		
		Date d = new Date();
		System.out.println(d); // 오늘날짜
		System.out.println(d.getHours());
		
		Calendar c = Calendar.getInstance(); // 추상클래스 new 객체로 생성 불가능
		int year = c.get(Calendar.YEAR); // 멤버변수 static final
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month+1); // 0~11
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println(year + "-" + (month+1) + "-" + day);
		
		System.out.println("-------------");
		LocalDate date = LocalDate.now(); // static
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		System.out.println(datetime.getYear());
		System.out.println(datetime.getMonth()); // NOVEMBER
		System.out.println(datetime.getMonthValue()); // 11
		System.out.println(datetime.getDayOfMonth()); // 23
		System.out.println(datetime.toLocalDate());
		
		LocalDateTime birth = LocalDateTime.of(2009, 9, 30, 8, 30);
		System.out.println(birth);
		
		//formatter y M d h m s 연월일시분초
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
		long days = ChronoUnit.DAYS.between(datetime, birth); // 일 차이
		System.out.println(days);
		
		
	}

}
