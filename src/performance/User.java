package performance;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 16.12.19
 * Time: 11:29
 * e-mail: slava_rossii@list.ru
 */
public class User {

    private String name;
    private String password;

    {
        name = "Vasya";
        password = "123";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
