package com.swervedrivespecialties.swervelib.ctre;

import com.swervedrivespecialties.swervelib.CanPort;

public class CanCoderAbsoluteConfiguration {
    private final CanPort id;
    private final double offset;

    public CanCoderAbsoluteConfiguration(CanPort id, double offset) {
        this.id = id;
        this.offset = offset;
    }

    public CanCoderAbsoluteConfiguration(int id, double offset) {
        this.id = null;
        this.offset = offset;
    }

    public CanPort getId() {
        return id;
    }

    public double getOffset() {
        return offset;
    }
}
