package gov.noaa.nws.iris;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import gov.noaa.nws.iris.stationlog.StationLogCategoryType;
import gov.noaa.nws.iris.stationlog.StationLogEntry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Test application for Iris Framework");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
//		StationLogEntry sle = new StationLogEntry();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//		String dateInString = "31-08-1982 10:20:56";
//		Date date = null;
//		try {
//			date = sdf.parse(dateInString);
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
//		
//        Date begin = date;
//        Date end = new Date();
//        
//		String nwsOffice="ABQ";
//		
//		DetachedCriteria query = DetachedCriteria.forClass(StationLogEntry.class);
//        List results = new ArrayList<StationLogEntry>();
//		
//		try {
//            session = HibernateUtil.getSessionFactory().openSession();
//             results = query.getExecutableCriteria(session).list();
//		
//        } catch (Exception e) {
//        	System.out.println(e.getMessage());
//        }
//		
//		results.forEach(result->System.out.println(result));

		session.beginTransaction();

		StationLogCategoryType slct = new StationLogCategoryType();
		
		String name="Other";
		String categoryType="General";
		DetachedCriteria query = DetachedCriteria.forClass(StationLogCategoryType.class).add(Restrictions.eq("id", 11))
				;
		List results = new ArrayList<StationLogCategoryType>();
		
		try {
          session = HibernateUtil.getSessionFactory().openSession();
           results = query.getExecutableCriteria(session).list();
		
      } catch (Exception e) {
      	System.out.println(e.getMessage());
      }
		
		results.forEach(result->System.out.println(result));

	}
	
}