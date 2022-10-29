public class Daily extends Appointment{


        public Daily(String description)

        {
            setDescription(description);

        }
        public boolean occursOn(int year, int month, int day)

        {
            return true;

        }
}
