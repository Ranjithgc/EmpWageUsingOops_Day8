class EmployeeWageUsingSwitch
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int hoursperday = 8;
	public static final int wageperhr = 20;
	public static int wage() {
		int salary = 0;
		int hrsPerDay;
		

   		int random=(int)Math.floor(Math.random()*10) % 3;

   		switch(random) {

   		case IS_FULL_TIME:
				  hrsPerDay = 8;
				  System.out.println("Employee is Present");
	
        		  		break;
   
   		case IS_PART_TIME:
				  hrsPerDay = 4;
				  System.out.println("Emloyee is Part time Present");
         
          		break;

   		default:
			hrsPerDay = 0;
			System.out.println("Employee is absent");
          		break;
		}
		salary = wageperhr * hrsPerDay;
		return salary;
	} 
	
	public static void main(String[] args) {
	System.out.println(wage());
	}
}
