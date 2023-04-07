public class Student {
    private String name;
    private String surname;
    Student(String name, String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        String str = this.name + " " + this.surname;
        return str;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }
}
