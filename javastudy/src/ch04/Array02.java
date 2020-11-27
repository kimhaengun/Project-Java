package ch04;

class Job{
	
}
class Police extends Job{
	String name ="°æÂû";
	 
}
class Doctor extends Job{
	String name = "ÀÇ»ç";
}

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job[] job = new Job[2];
		job[0]=new Police();
		job[1]=new Doctor();
		
		System.out.println(job[0]);
		
		
		
		
		
		
		
	 
	}

}
