package module3.inheritance.multilevelinheritance;

import java.time.LocalDateTime;

abstract public class BaseEntity {
    /*
    It can have variables
    It can have constructor
    It cannot be instantiated
    It can consist of concert methods
    It is most commonly used for implementing common logics or shared logics amongst the child subclasses.
     */

    protected long id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    protected BaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void save() {
        validate();
        audit();
        System.out.println("Saved Successfully");
    }

    abstract public void validate();

    public void audit() {
        System.out.println("User created at -> " + this.createdAt);
    }
}
