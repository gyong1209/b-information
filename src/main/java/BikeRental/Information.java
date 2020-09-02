package BikeRental;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Information_table")
public class Information {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long addressId;
    private String address;
    private String status;

    @PostUpdate
    public void onPostUpdate(){
        DmSendCancelled dmSendCancelled = new DmSendCancelled();
        BeanUtils.copyProperties(this, dmSendCancelled);
        dmSendCancelled.publishAfterCommit();


    }

    @PrePersist
    public void onPrePersist(){
        DmSended dmSended = new DmSended();
        BeanUtils.copyProperties(this, dmSended);
        dmSended.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}
