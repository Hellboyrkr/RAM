class DayRunner {
	public static void main(String[] ram){
		Day today = Day.THURSDAY;

		System.out.println(today);

		Day[] days=Day.values();
		for(int i=0; i< days.length; i++){
			System.out.println(days[i]);
		}
	}
}	