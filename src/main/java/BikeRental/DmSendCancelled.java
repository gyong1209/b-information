package BikeRental;

public class DmSendCancelled extends AbstractEvent {

    private Long id;
    private String satus;

    public DmSendCancelled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getSatus() {
        return satus;
    }

    public void setSatus(String satus) {
        this.satus = satus;
    }
}
