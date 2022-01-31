package OptionalClass;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] str = new String[10];
//		String ss = str[5].toLowerCase();
//		System.out.println(ss);
		
		String[] str = new String[10];
		str[5] = "I am ak";
		Optional<String> ss = Optional.ofNullable(str[5]);
//		if(ss.isPresent()) {
//			String ss1 = str[5].toLowerCase();
//			System.out.println(ss1);
//		}
		ss.ifPresent(System.out::println);
		System.out.println(ss.get());
		System.out.println(str[5].toLowerCase());
		
		Optional<String> ee = Optional.empty();
		System.out.println(ee);
		System.out.println(ss.filter((a)->a.equals("I am ak")));
		
		System.out.println(ss.get());
		
		System.out.println(ss.hashCode());
		
		System.out.println(ss.isPresent());
		
		System.out.println(Optional.ofNullable(str[5]));
		
		System.out.println(ss.orElse("I am aki"));
		
		Optional<String> ss1 = Optional.ofNullable(str[6]);
		System.out.println(ss1.orElse("I am akii"));
		
		ss1.ifPresent(System.out::print);
		
	}

}
