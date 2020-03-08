package ie.gmit;

public class practice {

    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public practice(String title, String name, String id, String phone, int age) {
        //setTitle(title);
        //setName(name);
        //setId(id);
        //setPhone(phone);
        //setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("TITLE: " + title);
        if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 10) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() >= 10) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Invalid ID");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() >= 10) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age too young");
        }
    }
}
