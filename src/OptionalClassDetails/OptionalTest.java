package OptionalClassDetails;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		
		String st = null;
		System.out.println(st);
		Optional<String>optional = Optional.ofNullable(st);
		System.out.println(optional);
		//System.out.println(optional.of(st));
		System.out.println(optional.isPresent());
		//System.out.println(optional.get());
		System.out.println(optional.orElse("There is no value"));
		
		
		
	}

}
