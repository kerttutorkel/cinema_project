package ee.sda;

import ee.sda.hibernate.Department;
import ee.sda.hibernate.HibernateUtils;
import org.hibernate.Session;

public class MainHibernate {

    public static void main(String[] args) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Department dept = session.find(Department.class, 1);
        session.close();
    }



}