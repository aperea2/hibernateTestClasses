package gov.noaa.nws.iris;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import gov.noaa.nws.iris.contact.Contact;
import gov.noaa.nws.iris.stationlog.StationLogCategoryType;
import gov.noaa.nws.iris.stationlog.StationLogEntry;
import gov.noaa.nws.iris.stationlog.StationLogImage;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Test application for Iris Framework");
		Session session = HibernateUtil.getSessionFactory().openSession();
//
//		session.beginTransaction();
//
//		StationLogImage sli = new StationLogImage();
//		sli.setId(34);
//
//		Set<StationLogImage> slis = new HashSet<StationLogImage>(1);
//
//		slis.add(sli);
//
//		StationLogEntry sle = new StationLogEntry();
//
//		sle.setNwsOffice("tes");
//
//		sle.setEmployeeName("Bob");
//		sle.setImportant(false);
//		sle.setText("test 123 from hibernate");
//
//		sle.getStationLogImages().addAll(slis);
//
//		// Prep Work
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//
//		// saveOrUpdate example - without transaction
//		Session session5 = sessionFactory.openSession();
//		session5.saveOrUpdate(sle);
//		System.out.println("*****");
		
//		DetachedCriteria query = DetachedCriteria.forClass(StationLogEntry.class)
//			    .add( Property.forName("employeeName").eq("Bob") );
//
//		Transaction txn = session.beginTransaction();
//		List<StationLogEntry> results = query.getExecutableCriteria(session).setMaxResults(100).list();
//		txn.commit();
//		session.close();
//		
//		results.forEach(r -> System.out.println(r.toString()));
		
//		DetachedCriteria query = DetachedCriteria.forClass(Contact.class)
//			    .add( Property.forName("location").eq("Auburn") );
//
//		Transaction txn = session.beginTransaction();
//		List<Contact> results = query.getExecutableCriteria(session).setMaxResults(10).list();
//		txn.commit();
//		session.close();
//		
//		results.forEach(r -> System.out.println(r.toString()));
//		
		
//		DetachedCriteria query = DetachedCriteria.forClass(Contact.class)
//			    .add( Property.forName("location").eq("Auburn") );
//
//		Transaction txn = session.beginTransaction();
//		List<Contact> results = query.getExecutableCriteria(session).setMaxResults(10).list();
//		txn.commit();
//		session.close();
//		
//		results.forEach(r -> System.out.println(r.toString()));
		
		Transaction txn = session.beginTransaction();

		DetachedCriteria criteria = DetachedCriteria.forClass(Contact.class);
		String nwsOfficeSid="ABQ";
		String firstIdChar="a";
		criteria.createAlias("nwsOffices", "nwsOfficesAlias");
		criteria.add(Restrictions.eq("nwsOfficesAlias.sid", nwsOfficeSid.trim().toUpperCase()));	
		//criteria.add(Restrictions.eq("loadSequence", firstIdChar.trim().toLowerCase()));
		
		List<Contact> list = criteria.getExecutableCriteria(session).setMaxResults(10).list();
		
		if (list.size() > 0) {
			list.forEach(l -> System.out.println(l.toString()));
		}
	}

}