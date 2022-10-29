public class AppointmentRunner {

//define main method

        public static void main(String[] args)

        {

            System.out.print("Monthly is subclass of Appointment: ");

            System.out.println(Monthly.class.getSuperclass() == Appointment.class);

            System.out.println("Expected: true");

            System.out.print("Onetime is a subclass of superclass Appointment: ");

            System.out.println(Onetime.class.getSuperclass() == Appointment.class);

            System.out.println("Expected: true");

            System.out.print("Daily is a subclass of superclass Appointment: ");

            System.out.println(Daily.class.getSuperclass() == Appointment.class);

            System.out.println("Expected: true");

            System.out.print("Monthly appointments have no extra fields: ");

            System.out.println(Monthly.class.getDeclaredFields().length == 1);

            System.out.println("Expected: true");

            System.out.print("Onetime appointments have no extra fields: ");

            System.out.println(Onetime.class.getDeclaredFields().length == 3);

            System.out.println("Expected: true");

            System.out.print("Daily appointments have no extra fields: ");

            System.out.println(Daily.class.getDeclaredFields().length == 0);

            System.out.println("Expected: true");

            Appointment object = new Monthly(15, "pay the bills");

            System.out.println("Checking Monthly appointment: " + object);

            System.out.println("Expected: please pay the bills");

            System.out.println(object.occursOn(2016, 8, 15));

            System.out.println("Expected: true");

            object = new Onetime(2016, 11, 1, "Dentist appointment.");

          System.out.println("Checking onetime appointment: " + object);

            System.out.println("Expected: Dentist appointment.");

            System.out.println(object.occursOn(2016, 11, 1));

            System.out.println("Expected: true");

            object = new Daily("walk the dog.");

            System.out.println("Checking daily appointment: " + object);

            System.out.println("Expected: walk the dog");

            System.out.println(object.occursOn(2016, 12, 25));

            System.out.println("Expected: true");

        }
}
