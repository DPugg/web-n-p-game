package poly.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import poly.entity.TaiKhoanEntity;
import poly.entity.TheNapEntity;

@Repository
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<TaiKhoanEntity> getUsers() {
		return sessionFactory.getCurrentSession().createQuery("from TaiKhoanEntity").list();
	}
	
	@Transactional
	public List<TheNapEntity> getCard() {
		return sessionFactory.getCurrentSession().createQuery("from TheNapEntity").list();
	}
	
	//them, dk
	@Transactional
	public void saveUser(TaiKhoanEntity client) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.save(client);

		} catch (Exception e) {
			e.printStackTrace();
			session = sessionFactory.openSession();
		}
	}
	
	// login
	@Transactional
	public TaiKhoanEntity findUser(String username, String password) {
		Session session =sessionFactory.getCurrentSession();
		String hql = "from TaiKhoanEntity as admin where admin.username=:username and admin.password=:password ";
		try {
			Query query = session.createQuery(hql);
			query.setParameter("username",username);
			query.setParameter("password", password);
			TaiKhoanEntity admin = (TaiKhoanEntity) query.uniqueResult();
			return admin;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return new TaiKhoanEntity();
	}
	
	//nap the
	@Transactional
	public TheNapEntity findCard(String maThe) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from TheNapEntity as card where card.maThe=:maThe";
		try {
			Query query = session.createQuery(hql);
			query.setParameter("maThe", maThe);
			TheNapEntity card = (TheNapEntity) query.uniqueResult();
			System.out.println("ma the dung");
			System.out.println(card);
			return card;
			

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sql saiiii");
		}
		return new TheNapEntity();
		
	}
	

}
