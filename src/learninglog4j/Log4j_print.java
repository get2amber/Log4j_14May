package learninglog4j;

import org.apache.log4j.Logger;


class Log4j_print {

	static  Logger log = Logger.getLogger(Log4j_print.class.getName());
	public static void main(String[] args) {
	
		
		log.debug(" i am debug");
		
		int a = 10,  b= 20;
		
		int c= a+b;
		System.out.println("value of c is :" + c);
		

		log.info(" c value is prinnted above");
		log.error(" this is errro message");
		System.out.println(log.equals(c));

	}

}
