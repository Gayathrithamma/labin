package S27.lab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Creating a Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setWheels(4);
        vehicle.setPrice(10000);

        // Creating a Car
        Car car = new Car();
        car.setWheels(4);
        car.setPrice(15000);
        car.setModel("Sedan");
        car.setAutomatic(true);

        // Creating a Bike
        Bike bike = new Bike();
        bike.setWheels(2);
        bike.setPrice(5000);
        bike.setModel("Sport");
        bike.setType("Motorbike");

        // Saving the objects
        session.save(vehicle);
        session.save(car);
        session.save(bike);

        // Commit the transaction
        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Records inserted successfully");
    }
}