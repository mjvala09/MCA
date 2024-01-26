// Explain Custom Exception
// Explain User Define Exception

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}
class TestCustomException{
	public static void main(String[] args) throws InvalidAgeException{
		int age = 13;
		if(age < 18){
			throw new InvalidAgeException("Not valid age");
		}else{
			System.out.println("Welcome User");
		}
	}	
}