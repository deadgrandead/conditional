package com.deadgrandead.conditional.realizations;

import com.deadgrandead.conditional.interfaces.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
