package com.deadgrandead.conditional.realizations;

import com.deadgrandead.conditional.interfaces.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
