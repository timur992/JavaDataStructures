package datastuctures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemoWeekdays {

	public static void main(String[] args) {

		List<String> weekdays = new ArrayList<>();

		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");

		// alternative looping in list
		for (String day : weekdays) {
			if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")
					|| day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Friday")) {
				System.out.println("Its a workday.... " + day + " Keep grinding....");
				if(day.equalsIgnoreCase("Friday")) {
					System.out.println(day + "      URAAAAAA its a payday");
				}					
			} else {
				System.out.println("Its a " + day +" Enjoy the weekend!!!! Drink responsibly");
			}
		}
		
		System.out.println("************************************************");
		
		//removing elements ----------YOU CANT USE SHORT FOR LOOP FOR REMOVING ELEMENTS, BECAUSE YOU NEED TO HAVE A REFERENCE TO INDEX
		for(int i = 0; i < weekdays.size(); i++) {
			if("Monday".equals(weekdays.get(i))) {
				weekdays.remove(i);
			}
		}
		

		
//		Iterator<String> iterator = weekdays.iterator();
		
//		//in order to modify, delete or etc from the list, you need to refer to index NOT ELEMENT
//		while(iterator.hasNext()) {
//			String itrValue = iterator.next();
//			if (!(itrValue.equals("Sunday") || itrValue.equals("Saturday")) ) {
//				iterator.remove(); 
//			}
//		}
		
//		weekdays.remove(0);
//		weekdays.remove("Tuesday");

		//printing in one line
		for(String element : weekdays) {
			System.out.print(element + " ");
		}
	}

}
