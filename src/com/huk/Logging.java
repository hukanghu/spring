package com.huk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logging {

		private static Date dateafterDate;
		private static Date datebeforeDate;
	/** 
	    * This is the method which I would like to execute
	    * before a selected method execution.
	    */
	   public void beforeAdvice(){
		   dateafterDate = new Date();
		   SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	      System.out.println("beforeAdvice:Going to setup student profile."+df.format(dateafterDate));
	   }
	   /** 
	    * This is the method which I would like to execute
	    * after a selected method execution.
	    */
	   public void afterAdvice(){
		  datebeforeDate = new Date();
		  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	      System.out.println("afterAdvice:Student profile has been setup."+df.format(datebeforeDate));
	      long l=datebeforeDate.getTime()-dateafterDate.getTime();
	      long day=l/(24*60*60*1000);
	      long hour=(l/(60*60*1000)-day*24);
	      long min=((l/(60*1000))-day*24*60-hour*60);
	      long s=(l/1000-day*24*60*60-hour*60*60-min*60);
	      long ss=(l%1000);
	      System.out.println(""+day+"天"+hour+"小时"+min+"分"+s+"秒"+ss+"毫秒");
	      
	   }
	   /** 
	    * This is the method which I would like to execute
	    * when any method returns.
	    */
	   public void afterReturningAdvice(Object retVal){
	      System.out.println("afterReturningAdvice:Returning:" + retVal.toString() );
	   }
	   /**
	    * This is the method which I would like to execute
	    * if there is an exception raised.
	    */
	   public void AfterThrowingAdvice(IllegalArgumentException ex){
	      System.out.println("AfterThrowingAdvice:There has been an exception: " + ex.toString());   
	   }  
}
