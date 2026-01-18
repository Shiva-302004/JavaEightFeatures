package com.gevernova.javaEightfeatures.DayTwo.UserRegistrationProblem;

public interface UserValidation<T, R> {
    R ValidateUserCredentials(T t);
}
