package de.othr.sw.HaberlRepairs.entity.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class RepairOrderDTO {

    @NotBlank
    private int planeId;
    @NotBlank
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date deadline;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date pickUpDate;
    private boolean isAccepted;
    private String description;
    @Valid
    private CustomerDTO customerDTO;

    public RepairOrderDTO(int planeId, Date deadline, Date pickUpDate, boolean isAccepted,String description,
                          CustomerDTO customerDTO) {
        this.planeId = planeId;
        this.deadline = deadline;
        this.pickUpDate = pickUpDate;
        this.isAccepted = isAccepted;
        this.description = description;
        this.customerDTO = customerDTO;
    }

    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        this.isAccepted = accepted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "repairOrderDTO{" +
                "planeId='" + planeId + '\'' +
                ", deadline='" + deadline + '\'' +
                ", pickUpDate='" + pickUpDate + '\'' +
                ", isAccepted='" + isAccepted + '\'' +
                ", description='" + description + '\'' +
                ", customerDTO=" + customerDTO +
                '}';
    }
}
