package singleton;

public final class Admin {
    private static Admin admin;
    private String id;
    private int accessLevel;

    public Admin(String id, int accessLevel) {
        this.id = id;
        this.accessLevel = accessLevel;
    }

    public static Admin create(String value,int accessLevel) {
        if (admin == null) {
            admin = new Admin(value, accessLevel);
        }
        return admin;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", accessLevel=" + accessLevel +
                '}';
    }
}