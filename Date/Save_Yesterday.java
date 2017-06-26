public void saveYesterDay(){
	//Holiday List
	List<String> holiday = new ArrayList<String>();
			
	holiday.add("20170606");holiday.add("20170815");holiday.add("20171003");holiday.add("20171004");
	holiday.add("20171005");holiday.add("20171009");holiday.add("20171225");
			
	//Today Date
	SimpleDateFormat formatter = new SimpleDateFormat ("yyyyMMdd");
	Date currentTime = new Date ( );
	String dTime = formatter.format ( currentTime );
		
	year = Integer.valueOf(dTime.substring(0, 4));
	month = Integer.valueOf(dTime.substring(4, 6));
	day = Integer.valueOf(dTime.substring(6, 8));			

			
	//Yesterday Date
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	Calendar c = Calendar.getInstance();
	c.set(year, month-1, day-1);
			
	//Holiday
	if(holiday.contains(sdf.format(c.getTime()))){
		c.set(year, month-1, day-2);
	}
			
	int k = c.get(Calendar.DAY_OF_WEEK);
	if(k==1) //Sunday
		c.set(year, month-1, day-3);
	if(k==7) //Saturday
		c.set(year, month-1, day-2);
					
	String beforeEdate = sdf.format(c.getTime());
	System.out.println("DATA DATE : "+beforeEdate);
			
	year = Integer.valueOf(beforeEdate.substring(0, 4));
	month = Integer.valueOf(beforeEdate.substring(4, 6));
	day = Integer.valueOf(beforeEdate.substring(6, 8));			
	c.set(year, month-1, day);
	
	// Yesterday Year
	year = c.get(Calendar.YEAR);
	// Yesterday Quarter
	quarter = (c.get(Calendar.MONTH) / 3) + 1;
	// Yesterday Month
	month = c.get(Calendar.MONTH) + 1;
	// Yesterday Week
	week = c.get(Calendar.WEEK_OF_MONTH);
	// Yesterday Day
	day = c.get(Calendar.DATE);
			
//	System.out.println(year+"/"+quarter+"/"+month+"/"+week+"/"+day);
}