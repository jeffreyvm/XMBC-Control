package be.jeffreyvanmulem.model;

/**
 * Created by IntelliJ IDEA.
 * User: Jeffrey
 * Date: 06/01/12
 * Time: 20:06
 * To change this template use File | Settings | File Templates.
 */
public class Movie extends AbstractEntity{
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
