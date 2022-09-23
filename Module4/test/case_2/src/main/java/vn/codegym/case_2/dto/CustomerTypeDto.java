package vn.codegym.case_2.dto;

import vn.codegym.case_2.model.Customer;

import javax.validation.constraints.NotBlank;
import java.util.Set;

public class CustomerTypeDto {
    private int customerTypeId;
    @NotBlank
    private String customerTypeName;
    private Set<Customer> customers;

    public CustomerTypeDto() {
    }

    public CustomerTypeDto(int customerTypeId, String customerTypeName, Set<Customer> customers) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.customers = customers;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
