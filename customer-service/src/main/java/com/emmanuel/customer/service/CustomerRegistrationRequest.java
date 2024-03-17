package com.emmanuel.customer.service;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
