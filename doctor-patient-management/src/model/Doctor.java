public class Doctor extends Person {
    private String doctorId;
    private String specialization;

    public Doctor(String firstName, String lastName, int age, String gender, String doctorId, String specialization) {
        super(firstName, lastName, age, gender);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String displayInfo() {
        return "Doctor ID: " + doctorId + "\n" +
               "Name: " + getFirstName() + " " + getLastName() + "\n" +
               "Age: " + getAge() + "\n" +
               "Gender: " + getGender() + "\n" +
               "Specialization: " + specialization;
    }
}