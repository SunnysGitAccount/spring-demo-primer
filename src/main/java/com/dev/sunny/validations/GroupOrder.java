package com.dev.sunny.validations;

import jakarta.validation.GroupSequence;

@GroupSequence({FirstOrder.class, SecondOrder.class})
public interface GroupOrder {
}
