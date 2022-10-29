public abstract class Appointment {


    private String Description;


    public Appointment() {


        Description = "";

    }


    public void setDescription(String description) {


        Description = description;

    }


    public abstract boolean occursOn(int year, int month, int day);


    public String toString()

    {
            return Description;

        }
}
