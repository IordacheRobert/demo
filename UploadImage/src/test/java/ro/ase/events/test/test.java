package ro.ase.events.test;

import java.util.Date;

import org.hibernate.HibernateException;

import ro.ase.events.dao.EventDao;
import ro.ase.events.dao.EventTypeDao;
import ro.ase.events.dao.LocationDao;
import ro.ase.events.dao.UserDao;
import ro.ase.events.model.Event;
import ro.ase.events.model.EventType;
import ro.ase.events.model.Location;
import ro.ase.events.model.User;
import ro.ase.events.utils.HibernateSessionFactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HibernateSessionFactory hibernateSessionFactory=HibernateSessionFactory.getInstance();
//		hibernateSessionFactory.getSessionFactory();
//		hibernateSessionFactory.getSessionFactory();
//		hibernateSessionFactory.getSessionFactory();
//		hibernateSessionFactory.getSessionFactory();
//	
//		
//		HibernateSessionFactory hibernateSessionFactory2=HibernateSessionFactory.getInstance();
//		hibernateSessionFactory2.getSessionFactory();
//		hibernateSessionFactory2.getSessionFactory();
//		hibernateSessionFactory2.getSessionFactory();
//		hibernateSessionFactory2.getSessionFactory();
		
		Location location=new Location("Bucharest","Romania","Piata Romana").setId(9);
		System.out.println(location);
		
		User user=new User("admin@gmail.com", "admin");
		System.out.println(user);
		EventType eventType=new EventType("racing","bucharest tour");
		
		Event event=new Event("Booha","Party harder",new Date(),new Date(),new Date(), 40d,user ,eventType,location);
		
		LocationDao locationDao=new LocationDao();
		EventTypeDao eventTypeDao=new EventTypeDao();
		UserDao userDao=new UserDao();
		EventDao eventDao=new EventDao();
		event.getParticipants().add(user);
		
		//userDao.saveObject(user);
		eventDao.saveObject(event);
		//user.getEvents().add(event);
		//userDao.saveObject(user);
		//locationDao.saveObject(location);
		//locationDao.deleteObject(location);
//		try{
//			System.out.println(locationDao.getObject(8).toString());
//		}catch(Exception ex){
//			System.out.println(ex.getMessage());
//		}
//		
//		locationDao.updateObject(location.setId(55).setCity("titu"));
		
		
		
		
	}

}
