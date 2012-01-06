package be.jeffreyvanmulem.model;

/**
 * Created by IntelliJ IDEA.
 * User: Jeffrey
 * Date: 06/01/12
 * Time: 10:22
 * To change this template use File | Settings | File Templates.
 */
public class AbstractEntity {
    protected Long id;
    protected Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
