package fu.se1302.healthcare.object;

public class Doctor {
    private int DT_Id;
    private String DT_Fullname;
    private int DT_Gender;
    private String DT_Email;
    private String DT_Password;
    private String DT_Phone;
    private String DT_Birthday;
    private String DT_Address;
    private String DT_Avatar;
    private int DT_Status;
    private int DOT_Id;

    public Doctor() {
    }

    public Doctor(int DT_Id, String DT_Fullname, int DT_Gender, String DT_Email, String DT_Password, String DT_Phone, String DT_Birthday, String DT_Address, String DT_Avatar, int DT_Status, int DOT_Id) {
        this.DT_Id = DT_Id;
        this.DT_Fullname = DT_Fullname;
        this.DT_Gender = DT_Gender;
        this.DT_Email = DT_Email;
        this.DT_Password = DT_Password;
        this.DT_Phone = DT_Phone;
        this.DT_Birthday = DT_Birthday;
        this.DT_Address = DT_Address;
        this.DT_Avatar = DT_Avatar;
        this.DT_Status = DT_Status;
        this.DOT_Id = DOT_Id;
    }

    public int getDT_Id() {
        return DT_Id;
    }

    public void setDT_Id(int DT_Id) {
        this.DT_Id = DT_Id;
    }

    public String getDT_Fullname() {
        return DT_Fullname;
    }

    public void setDT_Fullname(String DT_Fullname) {
        this.DT_Fullname = DT_Fullname;
    }

    public int getDT_Gender() {
        return DT_Gender;
    }

    public void setDT_Gender(int DT_Gender) {
        this.DT_Gender = DT_Gender;
    }

    public String getDT_Email() {
        return DT_Email;
    }

    public void setDT_Email(String DT_Email) {
        this.DT_Email = DT_Email;
    }

    public String getDT_Password() {
        return DT_Password;
    }

    public void setDT_Password(String DT_Password) {
        this.DT_Password = DT_Password;
    }

    public String getDT_Phone() {
        return DT_Phone;
    }

    public void setDT_Phone(String DT_Phone) {
        this.DT_Phone = DT_Phone;
    }

    public String getDT_Birthday() {
        return DT_Birthday;
    }

    public void setDT_Birthday(String DT_Birthday) {
        this.DT_Birthday = DT_Birthday;
    }

    public String getDT_Address() {
        return DT_Address;
    }

    public void setDT_Address(String DT_Address) {
        this.DT_Address = DT_Address;
    }

    public String getDT_Avatar() {
        return DT_Avatar;
    }

    public void setDT_Avatar(String DT_Avatar) {
        this.DT_Avatar = DT_Avatar;
    }

    public int getDT_Status() {
        return DT_Status;
    }

    public void setDT_Status(int DT_Status) {
        this.DT_Status = DT_Status;
    }

    public int getDOT_Id() {
        return DOT_Id;
    }

    public void setDOT_Id(int DOT_Id) {
        this.DOT_Id = DOT_Id;
    }
}
